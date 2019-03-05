package com.ochabmateusz.partridge.partridgeregisteruser.repository;

import com.ochabmateusz.partridge.partridgeregisteruser.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMongoRepository extends MongoRepository<User, String> {
}
