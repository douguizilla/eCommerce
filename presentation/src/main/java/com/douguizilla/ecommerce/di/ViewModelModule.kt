package com.douguizilla.ecommerce.di

import com.douguizilla.ecommerce.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        HomeViewModel(get())
    }
}