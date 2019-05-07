package com.dubbo.controller;

import com.dubbo.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Description:</p>
 * <p>com.dubbo.controller</p>
 *
 * @author smartdt
 * @version 1.0
 * @date 2018/5/21
 */

@Controller
@RequestMapping("/dubbo")
public class ConsumerController {

    @Autowired
    private IProviderService iProviderService;

    @RequestMapping("/hi.do")
    public String hi() {
        System.out.println("22222222222222222222222");
        String str = iProviderService.getString();
        System.out.println("服务方：" + str);
        return "dubbo";
    }
}
