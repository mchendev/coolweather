package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MChen on 2018/3/13.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
