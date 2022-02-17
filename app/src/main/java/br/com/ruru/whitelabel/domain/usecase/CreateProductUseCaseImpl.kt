package br.com.ruru.whitelabel.domain.usecase

import android.net.Uri
import br.com.ruru.whitelabel.data.ProductRepository
import br.com.ruru.whitelabel.domain.model.Product
import java.lang.Exception
import java.util.*
import javax.inject.Inject


class CreateProductUseCaseImpl @Inject constructor(
    private val uploadProductImageUseCase: UploadProductImageUseCase,
    private val productRepository: ProductRepository
): CreateProductUseCase {
    override suspend fun invoke(description: String, price: Double, imagemUri: Uri): Product {
        return try {
            val imageUrl = uploadProductImageUseCase(imagemUri)
            val product = Product(UUID.randomUUID().toString(), description, price, imageUrl)
            productRepository.createProduct(product)
        } catch (e: Exception){
            throw e
        }
    }
}