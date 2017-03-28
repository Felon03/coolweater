package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:38.
 * Email: Freedom.JFL@Live.com.
 */

public class Suggestion {
    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
