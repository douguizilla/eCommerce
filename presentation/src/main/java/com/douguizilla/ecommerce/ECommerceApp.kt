package com.douguizilla.ecommerce

import android.app.Application
import com.douguizilla.data.di.dataModule
import com.douguizilla.domain.di.domainModule
import com.douguizilla.ecommerce.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ECommerceApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ECommerceApp)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            ))
        }
    }
}