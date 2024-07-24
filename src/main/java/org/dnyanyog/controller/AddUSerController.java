package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AddUSerController {   
	 @Autowired 
	  private AddUserService addUserService  ; 
	  @PostMapping (path = " /AddUser")  
	   public AddUserResponse addUser(@RequestBody AddUserRequest request )  {
		   System.out.println(request) ;  
		    return addUserService.addUser(request) ; 
		    
	  }
	   
	 
	  
	  

}
