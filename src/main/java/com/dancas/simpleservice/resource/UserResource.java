package com.dancas.simpleservice.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dancas.simpleservice.dto.UserDTO;
import com.dancas.simpleservice.persistence.BaseStrategy;
import com.dancas.simpleservice.persistence.GenericGenerator;
import com.dancas.simpleservice.persistence.Identificator;
import com.dancas.simpleservice.persistence.SequenceStrategy;

@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	@POST
	public UserDTO createUser(UserDTO userDto){
		return userDto;
	}
	
	@GET
	public UserDTO getUser(){
		UserDTO userDto = new UserDTO(1l, "nombre", "apellido");
		GenericGenerator generator = userDto.getClass().getAnnotation(GenericGenerator.class);
		BaseStrategy baseStrategy = null;
		if(generator!=null){
			try {
				baseStrategy = (BaseStrategy) generator.strategy().newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Identificator l = baseStrategy.getValue();
			System.out.println("El valor de l es : " + l);
		}
		
		return userDto;
	}
	
	
}
