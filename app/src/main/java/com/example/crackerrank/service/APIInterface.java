package com.example.crackerrank.service;

import com.example.crackerrank.entity.GetSubmission;
import com.example.crackerrank.entity.Submission;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("")
    Call<GetSubmission> getSubmission (@Query("token") String token);

    @POST("")
    Call<Submission> submission (@Query("base64_encoded") Boolean base64_encoded, @Query("fields") String fields);
}
