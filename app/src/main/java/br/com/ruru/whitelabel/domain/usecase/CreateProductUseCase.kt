package br.com.ruru.whitelabel.domain.usecase

import android.net.Uri
import br.com.ruru.whitelabel.domain.model.Product

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imagemUri: Uri): Product
}