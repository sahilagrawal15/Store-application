package com.store.buysmart.repository;

import com.store.buysmart.model.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Registration,Integer> {
}
