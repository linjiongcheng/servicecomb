package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAppljc {

        AppljcDelegate appljcDelegate = new AppljcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = appljcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}