package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:37.
 * Email: Freedom.JFL@Live.com.
 */

public class Now {
    public Wind wind;

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class Wind {
        @SerializedName("dir")
        public String windDirection;

        @SerializedName("sc")
        public String windLevel;
    }

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
