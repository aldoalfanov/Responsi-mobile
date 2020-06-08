package reynaldo.leo.myinternet.api

import io.reactivex.Single
import reynaldo.leo.myinternet.model.Photo
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}