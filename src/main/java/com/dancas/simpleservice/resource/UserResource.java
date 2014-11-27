package com.dancas.simpleservice.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dancas.simpleservice.dto.UserDTO;

@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	@POST
	public UserDTO createUser(UserDTO userDto){
		userDto.setId(777);
		return userDto;
	}
	
}
