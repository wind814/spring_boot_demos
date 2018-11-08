package com.wind.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(value = "@Api用在类上，进行类得注释！")
public class DemoController {

//    @ApiImplicitParam的参数说明：
//            paramType：指定参数放在哪个地方
//            header：请求参数放置于Request Header，使用@RequestHeader获取
//            query：请求参数放置于请求地址，使用@RequestParam获取
//            path：（用于restful接口）-->请求参数的获取：@PathVariable
//            body：（不常用）
//            form（不常用）
//    name：参数名
//    dataType：参数类型
//    required：参数是否必须传 true | false
//    value：说明参数的意思
//    defaultValue：参数的默认值
    @RequestMapping(value = "/start",method = RequestMethod.GET)
    @ApiOperation(value="start方法", notes="test: demo")
    @ApiImplicitParam(paramType="query", name = "name", value = "名字", required = true, dataType = "String")
    public String start(String name){
        System.out.println(name);
        return name;
    }

}
