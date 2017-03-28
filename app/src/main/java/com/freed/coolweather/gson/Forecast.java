package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:42.
 * Email: Freedom.JFL@Live.com.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
