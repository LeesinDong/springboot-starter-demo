package com.leesin;

import com.leesin.autoconfiguration.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 22:54
 * @version: ${VERSION}
 * @modified By:
 */
@RestController
public class FormatController {

    @Autowired
    HelloFormatTemplate helloFormatTemplate;


    @GetMapping("/format")
    public String format() {
        User user=new User();
        user.setAge(1);
        user.setName("Leesin");
        return helloFormatTemplate.doFormat(user);
    }
}

