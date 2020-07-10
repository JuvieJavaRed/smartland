/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nolwazi.smartland.controllers;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nolwazi.smartland.dao.RatesRepository;
import com.nolwazi.smartland.entities.Rates;

/**
 *
 * @author Dell 7
 */

@Controller
public class RatesController {
	
	@Autowired
	RatesRepository ratesrepository;
    
    @RequestMapping(value = "/rates")
    public ModelAndView load_rates(ModelAndView model, HttpServletRequest request) throws IOException {
        
       List <Rates> rateslist = ratesrepository.findAll();
       model.addObject("ratelist", rateslist);
       model.setViewName("rates");
       return model;
    }
    
    @RequestMapping(value = "/ratesdeposit")
    public ModelAndView createrates(ModelAndView model, HttpServletRequest request) throws IOException {
    	
    	String amount = request.getParameter("amount");
    	String date = request.getParameter("date");
    	String deedno = request.getParameter("deedno");
    	
    	Rates rates = new Rates();
    	rates.setAmount(amount);
    	rates.setDeedno(deedno);
    	rates.setAmount(amount);
    	
    	ratesrepository.save(rates);
    	
    	List <Rates> rateslist = ratesrepository.findAll();
        model.addObject("ratelist", rateslist);
        model.setViewName("rates");
        
    	
    	return model;
    }
    
    @RequestMapping(value = "/ratesdeposit")
    public ModelAndView loadratespage(ModelAndView model) {
    	model.setViewName("create_rates");
    	return model;
    }
}
