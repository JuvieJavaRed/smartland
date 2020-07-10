/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nolwazi.smartland.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.nolwazi.smartland.dao.LandOwnerRepository;
import com.nolwazi.smartland.entities.LandOwner;

/**
 *
 * @author Dell 7
 */

@Controller
public class LoginController {
	
	@Autowired
	LandOwnerRepository landownerrepository;
    
    @RequestMapping(value = "/")
     public ModelAndView LoadIndex(ModelAndView model) throws IOException {
       model.setViewName("index");
       return model;
    }
     
    
     @RequestMapping(value = "/authenticate")
    public ModelAndView login_web(ModelAndView model, HttpServletRequest request) throws IOException{
        HttpSession session = request.getSession();
       
        String username = request.getParameter("username"); 
        String password = request.getParameter("password");
        List <LandOwner> students = landownerrepository.findAll();
        model.addObject("students", students);
        model.setViewName("landregister");
        return model;
    } 
}
