package com.ochabmateusz.partridge.partridgeregisteruser.serviceInterface;

import com.ochabmateusz.partridge.partridgeregisteruser.entity.User;
import com.ochabmateusz.partridge.partridgeregisteruser.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

    private final UserMongoRepository userMongoRepository;

    @Autowired
    public UserRegisterService(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }




    public void RegisterNewUser(User user){

        userMongoRepository.save(user);
    }






}
