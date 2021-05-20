package es.ozona.moira.project.service.customer;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import es.ozona.moira.project.service.navision.MoiraProjectServiceCustomerApplication;
import es.ozona.moira.project.service.navision.entities.Customer;
import es.ozona.moira.project.service.navision.interfaces.CustomerController;
import es.ozona.moira.project.service.navision.repositories.CustomerRepository;

@SpringBootTest(classes= MoiraProjectServiceCustomerApplication.class)
public class CustomerControllerTest {
	
	@Autowired
	CustomerController controller;
	
	@MockBean
	CustomerRepository repository;
	
	@BeforeEach
	public void setUp() {
		Customer c = new Customer();
		c.setName("Juan Gutierrez");
		c.setAddress("Calle arriba");
		c.setEmail("juangutierrez@gmail.com");
		c.setPhoneNo("666666666");
		
		when(repository.findByVATRegistrationNo("A11111111")).thenReturn(List.of(c));
	}
	
	@Test
	public void getCustomerOk() {
		ResponseEntity<Customer> result = controller.get("A11111111");
		
		Assertions.assertEquals(result.getStatusCode(), HttpStatus.OK);	
		Assertions.assertEquals(result.getBody().getName(), "Juan Gutierrez");
		Assertions.assertEquals(result.getBody().getAddress(), "Calle arriba");
		Assertions.assertEquals(result.getBody().getEmail(), "juangutierrez@gmail.com");
		Assertions.assertEquals(result.getBody().getPhoneNo(), "666666666");
	}
	
	@Test
	public void getCustomerNotFound() {
		ResponseEntity<Customer> result = controller.get("A22222222");
		
		Assertions.assertEquals(result.getStatusCode(), HttpStatus.NOT_FOUND);
	}
}
