package myproject.dhip_java.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myproject.dhip_java.Repository.CustomerRepository;
import myproject.dhip_java.Repository.MyPackageRepository;
import myproject.dhip_java.Services.CustomerService;
import myproject.dhip_java.Entity.Customer;
import myproject.dhip_java.Entity.MyPackage;



@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    MyPackageRepository myPackageRepository;

    @GetMapping("/all-customers")
    public List<Customer> getAllCustomers() {
        return customerService.getCustomer();
    }


    @GetMapping("/one-customer/{id}")
    public ResponseEntity<Customer> getOne(@PathVariable("id") long id) {
        Optional <Customer> opt = customerRepository.findById(id);
        if (opt.isPresent()) 
            return new ResponseEntity<Customer>(opt.get(), HttpStatus.OK);
        else 
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
    }

    // @CrossOrigin
    // @PostMapping("/customer-buy")
    // public ResponseEntity <String> buy(@RequestBody Customer customer) {

    //     customerService.addCustomer(customer);
    //     return new ResponseEntity<>(null, HttpStatus.OK);
    // }

    @CrossOrigin
    @PostMapping("/customer-buy")
    public ResponseEntity <String> buy(@RequestBody Customer customer, @RequestParam String package_id) {

        Optional<MyPackage> pack = myPackageRepository.findById(Integer.valueOf(package_id));
        List list = new ArrayList<MyPackage>();
        list.add(pack.get());
        customer.setMyPackage(pack.get());
        customerService.addCustomer(customer);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
