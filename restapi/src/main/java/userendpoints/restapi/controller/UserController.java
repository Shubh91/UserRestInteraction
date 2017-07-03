package userendpoints.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userendpoints.restapi.domain.Users;
import userendpoints.restapi.service.FeatureService;
import userendpoints.restapi.service.UsersService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired FeatureService service;

	@RequestMapping(method = RequestMethod.GET, value ="/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Users> getALlUsers() {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Users getOneUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public Users createNewUser(@RequestBody Users u){
		return service.createUser(u);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public Users updateUser (@PathVariable String id, @RequestBody Users u) {
		return service.updateUser(id,u);
	}
	
	
	
	
}
