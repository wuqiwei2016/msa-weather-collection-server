package com.htht.weather.springCloudWeather.service;

public interface WeatherDataCollectionService {

    /**
     * 根据城市id同步天气
     */
    void syncDateByCityId(String cityId);
}
