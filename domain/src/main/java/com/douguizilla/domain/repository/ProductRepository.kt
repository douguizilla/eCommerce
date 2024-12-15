package com.douguizilla.domain.repository

import com.douguizilla.domain.model.Product
import com.douguizilla.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}