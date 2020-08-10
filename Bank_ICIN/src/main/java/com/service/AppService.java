package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.entity.Registration;
@Service
public class AppService {
	@Autowired
	private MyRepo myRepo;
    
    public boolean addUser(Registration e){
    	myRepo.save(e);
		return true;
    
    }
    
    
   
}