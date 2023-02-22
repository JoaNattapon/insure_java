package myproject.dhip_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import myproject.dhip_java.Entity.Customer;


public interface CustomerRepository extends JpaRepository <Customer, Long>  {
    
}
