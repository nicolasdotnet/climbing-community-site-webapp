package org.amisescalade.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author nicolasdotnet
 */
@Named
@SessionScoped
public class Login implements Serializable{
	
	
    private String login = "James";
    private String password = "007";
	
	@Autowired
	private IUserController iUController;
	
	
	public String displayFirstName () {
		
		String firstName = ("nicolas");
		
//		org.amisescalade.entity.User user = userRepository.getOne(2L);
		
//		System.out.println(">>>>>>>>>>>>>>>>>>><>><"+user);
		
		//iUserService.displayOne(user);
		
//		return user.getFirstname();
		
		return firstName;
		
		
	}
	
	public String displayLastName () {
		
		String firstName = ("nicolas");
		
//		org.amisescalade.entity.User user = userRepository.getOne(2L);
		
		//iUserService.displayOne(user);
		
//		return user.getLastname();
		
		return firstName;
		
		
	}
	
	  public String showGreeting() {
		  
//		  org.amisescalade.entity.User user = userRepository.getOne(2L);
		  
		  
//		    return "Hello " + user.getFirstname() + " " + user.getLastname()+ "!";
		  
		  return "hello";
		  }
	  
	    public String returnAction() {
	        System.out.println( "in returnAction" );
	        return password.equals( "007" ) ? "success" : "failure";
	    }
}
