package org.lbl.springboot.demo.t1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一篇：基础教程
 * libl
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    private String index() {
        return "Hello Spring Boot!";
    }
}
