package com.hendisantika.springbooti18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-i18n
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/11/17
 * Time: 06.19
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class InternationalController {
    @RequestMapping(value = "/international", method= RequestMethod.GET)
    public String international() {
        return "international";
    }

    //redirect to demo if user hits the root
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:international";
    }
}
