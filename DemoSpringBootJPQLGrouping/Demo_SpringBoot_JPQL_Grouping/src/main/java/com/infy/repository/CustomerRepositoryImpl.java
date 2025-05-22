package com.infy.repository;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Object[]> getCustomerCountForCities() {

		String queryString1 = "SELECT c.city, COUNT(c) FROM Customer c GROUP BY c.city";

		String queryString2 = "SELECT c.city, COUNT(c) FROM Customer c GROUP BY c.city HAVING c.city IN ('Seattle','Vancouver')";

		Query query = entityManager.createQuery(queryString2);
		
		Query query1=entityManager.createQuery(queryString1);
		
		List<Object[]> result_1= query1.getResultList();


		List<Object[]> result = query.getResultList();
		

		return result_1;
		

	}

}
