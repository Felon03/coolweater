package com.freed.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Freedom.Ly on 2017-3-28  19:31.
 * Email: Freedom.JFL@Live.com.
 */

public class Basic {
    @SerializedName("city")     // 使用@SerializedName()注解的方式让JSON字段和Java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;        //com.google.gson.JsonSyntaxException: java.lang.NumberFormatException 之前将weatherId的类型写成int的了 出错

    public Update update;

    public class Update {
        @SerializedName("loc")
                public String updateTime;
    }
}
