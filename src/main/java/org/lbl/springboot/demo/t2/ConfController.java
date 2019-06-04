package org.lbl.springboot.demo.t2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 第二篇：配置文件
 * libl
 */
@RestController
public class ConfController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/my")
    public String my() {
        return name + ":" + age;
    }
}
