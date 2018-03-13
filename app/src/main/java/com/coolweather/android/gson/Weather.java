package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Mchen on 2018/3/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public AQI aqi;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
