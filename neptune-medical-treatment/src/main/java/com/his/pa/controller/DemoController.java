package com.his.pa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2021/7/26 13:53
 */
@RestController
@RequestMapping("/pa")
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "123";
    }
}
