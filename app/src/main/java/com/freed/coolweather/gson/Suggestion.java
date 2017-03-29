package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:38.
 * Email: Freedom.JFL@Live.com.
 */

public class Suggestion {
    @SerializedName("air")
    public Air air;

    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("drsg")
    public DressGuide dressGuide;

    public Sport sport;

    public class Air {
        @SerializedName("txt")
        public String info;
    }

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class DressGuide {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
