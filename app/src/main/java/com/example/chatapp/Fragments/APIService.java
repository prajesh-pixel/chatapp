package com.example.chatapp.Fragments;

import com.example.chatapp.Notification.MyResponse;
import com.example.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAATuH61EA:APA91bGa2RWW3G19ekYvfmyscaaxZjvPUVR5nuIUHCJEflyfPog564QO_F2J34gF-Cl_tqO9tfX6jwWJRIx4DwHsXuEQ7J2Mv2B3OJ4pCybZD7FzRoxODbuxr_IJ0_81-Eyqs_SAvKmE"
            }
    )
    @POST("fcm/send")
     Call<MyResponse> sendNotification(@Body Sender body);
}
