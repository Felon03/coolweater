package com.freed.coolweather.gson;

/**
 * Created by Freedom.Ly on 2017-3-28  19:36.
 * Email: Freedom.JFL@Live.com.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
