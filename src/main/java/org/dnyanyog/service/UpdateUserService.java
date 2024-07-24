package org.dnyanyog.service;

import org.dnyanyog.dao.UserDao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateUserService { 
	 @Autowired 
	 UserDao userDao ; 

	public UpdateUserResponse UpdateUser(UpdateUserRequest request) { 
		  
		   User userTable  = new User () ;   
		   userTable.setFirstName(request.getFirstName()); 
		   userTable.setLastName(request.getLastName()); 
		   userTable.setLoginName(request.getUser()); 
		   userTable.setPassword(request.getPassword()); 
		   userTable.setUser_id(request.getUser_id());
		    
		     
		   userDao.save(userTable) ;  
		    
		   UpdateUserResponse  response = new UpdateUserResponse  () ; 
		    
		   response.setResponseCode("0000"); 
		   response.setMessage("User Updated Sucessfully "); 
		   response.setRequest(request); 
		   
		    
		       return  response ;
	}


}


