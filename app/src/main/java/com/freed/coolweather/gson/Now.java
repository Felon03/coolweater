package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:37.
 * Email: Freedom.JFL@Live.com.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("text")
        public String info;;
    }
}
