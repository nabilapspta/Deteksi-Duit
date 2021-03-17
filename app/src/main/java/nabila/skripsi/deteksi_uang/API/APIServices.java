package nabila.skripsi.deteksi_uang.API;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface APIServices {

    @Multipart
    @POST("classify")
    Call<ClassifiedModel> createTask(@Part MultipartBody.Part file);

}
