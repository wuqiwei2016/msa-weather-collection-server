package com.htht.weather.springCloudWeather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class yesterdays implements Serializable{
    private static final long serialVersionUID = -5497708218229644468L;
    private String date;
    private String sunrise;
    private String high;
    private String low;
    private String sunset;
    private int aqi;
    private String fx;
    private String fl;
    private String type;
    private String notice;
    private List<yesterdays> forecast;
}
