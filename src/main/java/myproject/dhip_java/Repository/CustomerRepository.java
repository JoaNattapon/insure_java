package myproject.dhip_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myproject.dhip_java.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>  {
    
}
