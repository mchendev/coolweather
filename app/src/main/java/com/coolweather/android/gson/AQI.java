package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MChen on 2018/3/13.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
        @SerializedName("qlty")
        public String quality;
    }
}
