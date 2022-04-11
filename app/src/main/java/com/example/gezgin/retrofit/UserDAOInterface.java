package com.example.gezgin.retrofit;


import com.example.gezgin.PlacesFav;
import com.example.gezgin.retrofit.UserResponse.CRUDResponse;
import com.example.gezgin.retrofit.UserResponse.UsersResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserDAOInterface {


    @POST("gezginapp/insert_places.php")
    @FormUrlEncoded
    Call<CRUDResponse> set_places(@Field("places_name") String places_name, @Field("places_img") String places_img, @Field("places_rate") String places_rate,@Field("user_id") Integer user_id);

    @POST("gezginapp/getfav_places.php")
    @FormUrlEncoded
    Call<PlacesFav> getfav_places(@Field("user_id") int user_id);

    @POST("gezginapp/deletefav_places.php")
    @FormUrlEncoded
    Call<CRUDResponse> delete_fav(@Field("places_id") int places_id);

    @GET("gezginapp/all_users.php")
    Call<UsersResponse> all_user();

    @POST("gezginapp/insert_users.php")
    @FormUrlEncoded
    Call<CRUDResponse> user_add(@Field("user_name") String user_name, @Field("user_password") String user_password, @Field("user_email") String user_email);

    @POST("gezginapp/login_response.php")
    @FormUrlEncoded
    Call<UsersResponse> login_response(@Field("username") String username);

    @POST("gezginapp/username_check.php")
    @FormUrlEncoded
    Call<CRUDResponse> username_check(@Field("username") String username);

    @POST("gezginapp/email_check.php")
    @FormUrlEncoded
    Call<CRUDResponse> email_check(@Field("useremail") String useremail);

    @POST("gezginapp/delete_account.php")
    @FormUrlEncoded
    Call<CRUDResponse> delete_account(@Field("userid") int userid);

    @POST("gezginapp/username_change.php")
    @FormUrlEncoded
    Call<CRUDResponse> username_change(@Field("userid") int userid, @Field("username")String username);

    @POST("gezginapp/password_change.php")
    @FormUrlEncoded
    Call<CRUDResponse> password_change(@Field("userid") int userid, @Field("userpassword")String userpassword);

}
