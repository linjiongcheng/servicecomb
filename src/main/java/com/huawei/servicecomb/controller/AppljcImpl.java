package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-19T06:16:09.618Z")

@RestSchema(schemaId = "appljc")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class AppljcImpl {

    @Autowired
    private AppljcDelegate userAppljcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userAppljcDelegate.helloworld(name);
    }

}
