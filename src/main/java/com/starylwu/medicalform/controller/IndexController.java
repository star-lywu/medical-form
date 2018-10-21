package com.starylwu.medicalform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Wuyulong
 * @Date: 2018/10/21 22:20
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/health")
    public String health(){
        return "health";
    }

}
