package org.learning.springboot.oracle.repositories;

import org.learning.springboot.oracle.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {



}
