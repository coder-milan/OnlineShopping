package com.walmart.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.walmart.entities.CustomerLoginEntity;

@Repository
@Transactional
public class CustomerLoginRepository extends AbstractRepository {

	public void save(CustomerLoginEntity customerLoginEntity) {
		entityManager.persist(customerLoginEntity);
	}
}
