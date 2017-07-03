package userendpoints.restapi.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import userendpoints.restapi.domain.Users;

@Repository
public class UserRepository implements FeatureRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Users> findAll() {
		TypedQuery<Users> query = em.createNamedQuery("Users.findAll",Users.class);
		return query.getResultList();
	}

	@Override
	public Users findOne(int id) {
		return em.find(Users.class, id);
	}

	@Override
	public Users createOne(Users u) {
		em.persist(u);
		return u;
	}

	@Override
	public Users updateOne( Users u) {
		em.merge(u);
		return u;
	}

	@Override
	public Users findByPhoneNumber(String phone) {
		TypedQuery<Users> query = em.createNamedQuery("Users.findWithPhoneNumber",Users.class).setParameter("phone", phone);
		List<Users> userList = query.getResultList();
		if((!userList.isEmpty())) {
			return userList.get(0);
		}
		return null;
	}

}
