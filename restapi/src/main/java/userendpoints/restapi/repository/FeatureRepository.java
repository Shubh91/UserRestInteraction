package userendpoints.restapi.repository;

import java.util.List;

import userendpoints.restapi.domain.Users;

public interface FeatureRepository {
	
	public List<Users> findAll();
	public Users findOne(int id);
	public Users createOne(Users u);
	public Users updateOne(Users u);
	public Users findByPhoneNumber(String name);
	
}
