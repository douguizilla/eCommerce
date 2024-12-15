package com.douguizilla.data.di

import com.douguizilla.data.repository.ProductRepositoryImpl
import com.douguizilla.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get())}
}