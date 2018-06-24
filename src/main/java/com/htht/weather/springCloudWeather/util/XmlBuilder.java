package com.htht.weather.springCloudWeather.util;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 *  java提供的解析xml文件
 */
public class XmlBuilder {

    /**
     * 将xml 转为制定的POJO
     * @return
     */
    public static Object xmlStrToObject(Class<?> clazz,String xmlStr) throws Exception {
        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);

        //XML 转为对象的接口
        Unmarshaller unmarshaller = context.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);

        if(reader != null){
            reader.close();
        }
        return xmlObject;
    }
}
