package com.htht.weather.springCloudWeather.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Forecasts implements Serializable{
    private static final long serialVersionUID = -6913355958645182009L;
    private String shidu;
    private int pm25;
    private int pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private yesterdays yesterday;
}
