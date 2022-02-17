package br.com.ruru.whitelabel.domain.usecase

import br.com.ruru.whitelabel.domain.model.Product

interface GetProductsUseCase {

    suspend operator fun invoke(): List<Product>
}