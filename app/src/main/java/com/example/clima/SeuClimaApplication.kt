package com.example.clima

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.example.clima.di.AppComponent.getAllModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SeuClimaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupDependencyInjection()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

    private fun setupDependencyInjection() {
        startKoin {
            androidLogger()
            androidContext(this@SeuClimaApplication)
            modules(getAllModules())
        }
    }
}