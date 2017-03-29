package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:36.
 * Email: Freedom.JFL@Live.com.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;

        @SerializedName("qlty")
        public String quality;
    }
}
