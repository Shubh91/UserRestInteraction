package userendpoints.restapi.service;

import java.util.List;

import userendpoints.restapi.domain.Users;

public interface FeatureService {
	
	public List<Users> findAll();
	public Users findOne(int id);
	public Users createUser(Users u);
	public Users updateUser(String id, Users u);

}
