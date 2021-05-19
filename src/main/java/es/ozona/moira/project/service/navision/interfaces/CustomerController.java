package es.ozona.moira.project.service.navision.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.ozona.moira.project.service.navision.entities.Customer;
import es.ozona.moira.project.service.navision.repositories.CustomerRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("api/v1")
@Api(value = "Customer service API", tags = "API de customers")
@SwaggerDefinition(tags = {@Tag(name = "API de customers", description = "Operaciones de consulta de customers")})
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer/{cif}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	@ApiOperation(value = "Consulta un cliente por su cif")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 404, message = "NOT_FOUND"), @ApiResponse(code = 400, message = "BAD_REQUEST")})
	public ResponseEntity<Customer> get(@ApiParam(name="cif", required = true, example = "A36600740") @PathVariable String cif) {
		List<Customer> customer = customerRepository.findByVATRegistrationNo(cif);
		
		if(customer.isEmpty())
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(customer.get(0));
	}
}
