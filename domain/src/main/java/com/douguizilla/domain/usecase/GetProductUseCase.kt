package com.douguizilla.domain.usecase

import com.douguizilla.domain.repository.ProductRepository

class GetProductUseCase(
    private val repository: ProductRepository
) {
    suspend fun execute() = repository.getProducts()
}