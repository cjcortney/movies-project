package cale.spring.Movies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateController {

    @GetMapping("/update")
    public ModelAndView update(ModelAndView mav){
        mav.setViewName("update");
        mav.addObject("pageTitle", "Update database");
        return mav;
    }

    @PostMapping("/update")
    public void updatePost(@RequestParam("movieAdd") String string, ModelAndView mav){
        System.out.println(string);
        mav.setViewName("success");
//        return mav;
    }

}
