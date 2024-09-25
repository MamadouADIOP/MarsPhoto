package com.example.marsphotos.fake
import kotlinx.coroutines.test.runTest
import com.example.marsphotos.data.NetworkMarsPhotosRepository
import junit.framework.TestCase.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }

}