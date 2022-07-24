package com.adam.springbootstudy.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController 可讓 Spring Boot 可訪問 該類
 */
@RestController
public class HelloController {

    /**
     * 顯示 hello 字串
     * ```
     * 三種執行方式
     * 1.IDE 執行 RUN
     * 2.透過Maven cmd : 對該專案目錄 輸入 mvn spring-boot:run
     * 3.打包 jar  mvn package
     * 目錄: C:\Users\蕭立品\IdeaProjects\SpringBootStudy\target\SpringBootStudy-0.0.1-SNAPSHOT.jar
     * cmd : java -jar .\SpringBootStudy-0.0.1-SNAPSHOT.jar
     * ```
     *
     * @return {String}
     * @RequestMapping 可讓 Spring Boot 執行該方法
     */
    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public String showHello() {
        return "Hello Spring Boot";
    }


}
