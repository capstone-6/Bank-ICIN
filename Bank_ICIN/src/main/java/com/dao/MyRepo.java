package com.dao;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.entity.Employee;
import com.entity.Registration;

@Repository
public interface MyRepo extends CrudRepository<Registration, Integer> {

}
