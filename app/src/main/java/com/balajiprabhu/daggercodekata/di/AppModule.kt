package com.balajiprabhu.daggercodekata.di

import com.balajiprabhu.daggercodekata.data.Constants
import com.balajiprabhu.daggercodekata.data.remote.WeatherService
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    companion object {

        @Singleton
        @Provides
        fun providesInterceptor(): Interceptor {
            return object : Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    var request = chain.request()
                    request = request.newBuilder()
                            .build()
                    return chain.proceed(request)
                }
            }
        }

        @Singleton
        @Provides
        fun providesOkHttpClient(): OkHttpClient {
            return OkHttpClient.Builder()
                    .addInterceptor(providesInterceptor())
                    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build()
        }

        @Singleton
        @Provides
        fun providesRetrofit(): Retrofit =
                Retrofit.Builder()
                        .baseUrl(Constants.BASE_URL)
                        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(providesOkHttpClient())
                        .build()

        @Singleton
        @Provides
        fun providesAppClient(): WeatherService =
                providesRetrofit().create(WeatherService::class.java)

    }

}