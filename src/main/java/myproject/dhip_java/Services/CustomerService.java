package myproject.dhip_java.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.dhip_java.Entity.Customer;
import myproject.dhip_java.Repository.CustomerRepository;


@Service
public class CustomerService {
    
    @Autowired CustomerRepository customerRepository;

    public CustomerService() {

    }

    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    public Optional <Customer> getOneCustomer(Long id) {
        return customerRepository.findById(id);
    }

    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Added Customer Successfully";
    }

}
