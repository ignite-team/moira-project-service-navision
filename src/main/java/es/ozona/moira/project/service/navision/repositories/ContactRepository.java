package es.ozona.moira.project.service.navision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ozona.moira.project.service.navision.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String>{

}
