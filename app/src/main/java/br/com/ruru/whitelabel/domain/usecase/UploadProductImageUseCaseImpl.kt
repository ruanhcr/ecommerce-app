package br.com.ruru.whitelabel.domain.usecase

import android.net.Uri
import br.com.ruru.whitelabel.data.ProductRepository
import javax.inject.Inject

class UploadProductImageUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
): UploadProductImageUseCase {
    override suspend fun invoke(imageUri: Uri): String {
        return productRepository.uploadProductImage(imageUri)
    }
}