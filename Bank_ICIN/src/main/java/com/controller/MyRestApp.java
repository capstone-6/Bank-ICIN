package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.entity.Registration;
import com.service.AppService;
@RestController
public class MyRestApp {
 
    @Autowired
    private AppService service;  
    
    
    @PostMapping("/registration")
    public String userRegister(@RequestParam ("uName")String uName,@RequestParam ("uEmail") String uEmail,@RequestParam("uContact") String uContact,@RequestParam("uPan") String uPan,@RequestParam("uPass") String uPass,@RequestParam("uDOB") String uDOB){
        
   
    	
    	Registration r = new Registration(uName,uEmail,uContact,uPan,uPass,uDOB);
            boolean data = service.addUser(r);
            
            if(data){
            return "Your response has been recorded";
            }
            else{
            return "User not Added Successfully";
            }
    }
    
}