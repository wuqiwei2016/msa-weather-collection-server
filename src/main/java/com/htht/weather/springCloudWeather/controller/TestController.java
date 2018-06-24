package com.htht.weather.springCloudWeather.controller;

import com.htht.weather.springCloudWeather.vo.TestEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wuqiw on 2018/6/20.
 */
@RestController
public class TestController {
    /**
     * get方法测试
     * @return
     */
    @GetMapping("testGet")
    public TestEntity testGet() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1);
        testEntity.setName("get");
        return testEntity;
    }

    /**
     * post方法
     * @return
     */
    @PostMapping("testPost")
    public TestEntity testPost(){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1);
        testEntity.setName("post");
        return testEntity;
    }


    /**
     * post 方法传值
     * @param id
     * @param name
     * @return
     */
    @PostMapping("testPostParam")
    public String testPostParam(@RequestParam("id") String id, @RequestParam("name") String name){
        System.out.println("Post id:"+id);
        System.out.println("Post name:"+name);
        return "你好";
    }


    /**
     * post 方法传值
     * @param id
     * @param name
     * @return
     */
    @PutMapping("testPut")
    public String testPut(@RequestParam("id") String id,@RequestParam("name") String name){
        System.out.println("put id:"+id);
        System.out.println("put name:"+name);
        return "del succ";
    }


    /**
     * del方法传值
     * @param id
     * @return
     */
    @DeleteMapping("testDel")
    public String testDel(@RequestParam("id") String id){
        System.out.println("del id:"+id);
        return "del succ";
    }
}
