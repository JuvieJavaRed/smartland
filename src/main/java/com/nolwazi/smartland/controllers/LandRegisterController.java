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
import org.springframework.web.servlet.ModelAndView;

import com.nolwazi.smartland.dao.LandOwnerRepository;
import com.nolwazi.smartland.entities.LandOwner;

/**
 *
 * @author Dell 7
 */
@Controller
public class LandRegisterController {
	
	@Autowired
	LandOwnerRepository landownerrepository;

    @RequestMapping(value = "/landowner")
    public ModelAndView load_rates(ModelAndView model, HttpServletRequest request) throws IOException {
       
    	List <LandOwner> students = landownerrepository.findAll();
        model.addObject("students", students);
        model.setViewName("landregister");

        return model;
    }
    
    @RequestMapping(value = "/createrates")
    public ModelAndView createLand(ModelAndView model) throws IOException{
    	model.setViewName("create_land");
    	return model;
    }
    
    @RequestMapping(value = "/deedsearch")
    public ModelAndView searchByDeedNo(ModelAndView model,HttpServletRequest request) throws IOException {
    	String deedno = request.getParameter("deedno");
    	List <LandOwner> students = landownerrepository.findByDeedno(deedno);
    	model.addObject("students", students);
        model.setViewName("landregister");
    	return model;
    }
    
    @RequestMapping(value = "/landdeposit")
    public ModelAndView landDeposit(ModelAndView model, HttpServletRequest request) throws IOException {
    	String name = request.getParameter("name");
    	String surname = request.getParameter("surname");
    	String deedno = request.getParameter("deedno");
    	String address = request.getParameter("address");
    	
    	LandOwner landowner = new LandOwner();
    	landowner.setAddress(address);
    	landowner.setDeedno(deedno);
    	landowner.setName(name);
    	landowner.setSurname(surname);
    	
    	landownerrepository.save(landowner);
    	
    	List <LandOwner> students = landownerrepository.findAll();
        model.addObject("students", students);
        model.setViewName("landregister");

        return model;
    	
    }
}
