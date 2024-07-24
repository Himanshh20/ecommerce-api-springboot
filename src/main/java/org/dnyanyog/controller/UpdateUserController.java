package org.dnyanyog.controller; 
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UpdateUserController { 
	 @Autowired 
	  private UpdateUserService updateUserService  ; 
	  @PostMapping (path = " /UpdateUser")  
	   public UpdateUserResponse UpdateUser(@RequestBody UpdateUserRequest request )  {
		   System.out.println(request) ;  
		    return updateUserService.UpdateUser(request) ; 
		    
	  }


}
