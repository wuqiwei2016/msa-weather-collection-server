package com.htht.weather.springCloudWeather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Weathers implements Serializable{
    private static final long serialVersionUID = -6708454704979535880L;
    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private Forecasts data;

}
