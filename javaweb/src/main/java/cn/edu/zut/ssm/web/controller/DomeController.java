package cn.edu.zut.ssm.web.controller;

import cn.edu.zut.ssm.service.DomeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("test")
//@Slf4j
public class DomeController {
    private static final Logger log = LoggerFactory.getLogger(DomeController.class);

    @Autowired
    private DomeService domeService;

    @RequestMapping(value = "/index.html")
    public ModelAndView index() {
        List list = domeService.index();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("userList", list);
        return mav;
    }

    @RequestMapping(value ="/hellow.html")
    @ResponseBody
    public List hellow(){
        List list = null;
        try {
            list = domeService.index();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("控制台输出");
        log.info("打印日志");
        return  list;
    }
}
