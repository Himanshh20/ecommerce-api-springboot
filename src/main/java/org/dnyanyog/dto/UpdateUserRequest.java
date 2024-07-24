package org.dnyanyog.dto;

public class UpdateUserRequest { 
	 private String firstName ; 
	  private String lastName ;  
	   public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String mobile ;  
	    private String user ; 
	     private String password ;  
	      private Integer user_id ;
		public Integer getUser_id() {
			return user_id;
		}
		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		} 
	      
	    


	}


