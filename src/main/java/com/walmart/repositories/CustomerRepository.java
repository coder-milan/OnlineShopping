package com.walmart.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.walmart.entities.CustomerEntity;
import com.walmart.repositories.AbstractRepository;

@Repository
@Transactional
public class CustomerRepository extends AbstractRepository {

	public void save(CustomerEntity customerEntity) {
		entityManager.persist(customerEntity);
	}

}
