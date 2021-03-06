package com.pramod.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	UserRepository myUserRepository;
	
	@Autowired
	private MongoTemplate myMongoTemplate;

   public User insert(User usr){

	   myMongoTemplate.insert(usr);
	   return usr;
  }

	public User save(User usr){

		myMongoTemplate.save(usr);
		return usr;
	}
    public User getUserById(int id){

		return myMongoTemplate.findById(id, com.pramod.user.User.class);
	}




}

