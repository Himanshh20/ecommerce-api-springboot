package org.dnyanyog.service;

import org.dnyanyog.dao.UserDao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class AddUserService {  
	 @Autowired 
	 UserDao userDao ; 

	public AddUserResponse addUser(AddUserRequest request) { 
		  
		   User userTable  = new User () ;   
		   userTable.setFirstName(request.getFirstName()); 
		   userTable.setLastName(request.getLastName()); 
		   userTable.setLoginName(request.getUser()); 
		   userTable.setPassword(request.getPassword()); 
		    
		     
		   userDao.save(userTable) ;  
		    
		   AddUserResponse  response = new AddUserResponse  () ; 
		    
		   response.setResponseCode("0000"); 
		   response.setMessage("User Updates  Sucessfully "); 
		   response.setRequest(request); 
		    
		    
		    
	      
		return  response ;
	}

}
