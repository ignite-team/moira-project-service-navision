package es.ozona.moira.project.service.navision.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ozona.moira.project.service.navision.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

	public List<Customer> findByVATRegistrationNo(String vatRegistrationNo);
}
