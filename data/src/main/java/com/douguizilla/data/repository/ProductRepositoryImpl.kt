package com.douguizilla.data.repository

import com.douguizilla.domain.model.Product
import com.douguizilla.domain.network.NetworkService
import com.douguizilla.domain.network.ResultWrapper
import com.douguizilla.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val networkService: NetworkService
) : ProductRepository {
    override suspend fun getProducts(): ResultWrapper<List<Product>> {
        return networkService.getProducts()
    }
}