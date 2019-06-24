package com.smart.web;

import com.smart.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**测试,没变化啊，再来一次
 * 哈哈,66,777
 * 开启group分支
 */
@Controller
public class DomeController {
    @Autowired
    private DomeService domeService;
    @RequestMapping(value ="/index.html")
    public ModelAndView index(){
        List list=domeService.index();
        ModelAndView mav =new ModelAndView();
        mav.setViewName("index");
        mav.addObject("userList",list);
        return mav;
    }
}
