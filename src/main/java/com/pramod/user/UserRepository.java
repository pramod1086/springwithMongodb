package com.pramod.user;


import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

@Component
//@Repository
public interface UserRepository {
	
    User save(User persisted);



}
