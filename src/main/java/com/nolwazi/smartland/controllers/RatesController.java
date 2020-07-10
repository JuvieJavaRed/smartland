/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nolwazi.smartland.controllers;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell 7
 */

@Controller
public class RatesController {
    
    @RequestMapping(value = "/rates", method = RequestMethod.GET)
    public ModelAndView load_rates(ModelAndView model, HttpServletRequest request) throws IOException {
        
       
        model.setViewName("rates");
        return model;
    }
}
