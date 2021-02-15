package com.example.dustinfo.data;
import com.example.dustinfo.model.FineDust;

import retrofit2.Callback;
public interface FineDustRepository {

    boolean isAvailable();

    void getFineDustData(Callback<FineDust> callback);
}