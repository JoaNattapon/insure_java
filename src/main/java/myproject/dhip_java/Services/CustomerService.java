package myproject.dhip_java.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myproject.dhip_java.Repository.CustomerRepository;


@Service
public class CustomerService {
    
    @Autowired CustomerRepository customerRepository;

    public CustomerService() {

    }

    

}
