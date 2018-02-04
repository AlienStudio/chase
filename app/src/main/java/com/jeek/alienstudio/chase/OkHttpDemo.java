package com.jeek.alienstudio.chase;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpDemo {
    private OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.body() != null) {
                return response.body().string();
            }
            else {
                return "Null";
            }
        }
    }
}
