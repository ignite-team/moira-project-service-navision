package es.ozona.moira.project.service.navision.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ozona.moira.project.service.navision.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String>{
	public List<Contact> findBySearchName(String name);
}
