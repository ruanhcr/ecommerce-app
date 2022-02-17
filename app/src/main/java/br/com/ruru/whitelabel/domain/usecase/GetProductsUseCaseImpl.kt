package br.com.ruru.whitelabel.domain.usecase

import br.com.ruru.whitelabel.data.ProductRepository
import br.com.ruru.whitelabel.domain.model.Product
import javax.inject.Inject

class GetProductsUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
): GetProductsUseCase {
    override suspend fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}