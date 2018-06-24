package com.htht.weather.springCloudWeather.job;

import com.htht.weather.springCloudWeather.service.WeatherDataCollectionService;
import com.htht.weather.springCloudWeather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/** 定时获取天气数据
 * Created by wuqiw on 2018/6/19.
 */
@Slf4j
public class WeatherDataSyncJob extends QuartzJobBean{


    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("Weather Data Sync Job. Start！");

        //获取城市列表
        List<City> cityList = null;

        try {
            //todo  改为由城市数据API微服务提供数据\
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280601");
            cityList.add(city);
           /* cityList = cityDataService.listCity();*/
        }catch (Exception e){
            log.error("Exception!", e);
        }

        //遍历城市id获取天气
        for(City city : cityList){
           String cityId=  city.getCityId();
            log.info("Weather Data Sync Job, cityId:" + cityId);
            weatherDataCollectionService.syncDateByCityId(cityId);
        }
        log.info("Weather Data Sync Job. End！");
    }
}
