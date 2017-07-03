package userendpoints.restapi.service;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import userendpoints.restapi.domain.Users;
import userendpoints.restapi.exceptions.BadRequestException;
import userendpoints.restapi.repository.FeatureRepository;
import userendpoints.restapi.repository.UserRepository;

@Service
public class UsersService implements FeatureService {

	@Autowired FeatureRepository repo;
	
//	public UsersService(FeatureRepository repo) {
//		this.repo = repo;
//	}
	
	@Override
	@Transactional(readOnly = true)	
	public List<Users> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)	
	public Users findOne(int id) {
		Users u = repo.findOne(id);
		if(u == null) {
			throw new BadRequestException("Missing User");
		}
		return u;
		}

	@Override
	@Transactional
	public Users createUser(Users u) {
		
		Users exists = repo.findByPhoneNumber(u.getPhone());
		
		if(exists != null) {
			throw new BadRequestException("User already present");
		}
		
		return repo.createOne(u);
	}

	@Override
	@Transactional
	public Users updateUser(String id, Users u) {
		Users exists = repo.findByPhoneNumber(u.getPhone());
		if(exists == null) {
			throw new BadRequestException("User not found");
		}
		return repo.updateOne(u);
	}

}
