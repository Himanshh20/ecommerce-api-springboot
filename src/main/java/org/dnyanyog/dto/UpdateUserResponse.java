package org.dnyanyog.dto;

public class UpdateUserResponse { 
	 private  String responseCode ; 
	 private  String message ; 
	 private  UpdateUserRequest  request  ;  
	  private Integer user_id ; 
	  
		public String getResponseCode() {
			return responseCode;
		}
		public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public UpdateUserRequest getRequest() {
			return request;
		}
		public void setRequest(UpdateUserRequest request) {
			this.request = request;
		}   
		public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	    
	     
	     
}



