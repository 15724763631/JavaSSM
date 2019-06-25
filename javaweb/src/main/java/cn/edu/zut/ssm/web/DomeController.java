package cn.edu.zut.ssm.web;

import cn.edu.zut.ssm.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DomeController {
    @Autowired
    private DomeService domeService;
    @RequestMapping(value ="/index.html")
    public ModelAndView index(){
        List list= domeService.index();
        ModelAndView mav =new ModelAndView();
        mav.setViewName("index");
        mav.addObject("userList",list);
        return mav;
    }
}
