package org.lbl.springboot.demo.t2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.boot.context.properties.EnableConfigurationProperties;

@RestController
//@EnableConfigurationProperties({ConfigBean.class,UserBean.class})  通过此方式也可以注入bean
public class EntityController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping("/em")
    public String entityMethod() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @Autowired
    UserBean user;

    @RequestMapping(value = "/user")
    public String user() {
        return user.getName() + ":" + user.getAge();
    }
}
