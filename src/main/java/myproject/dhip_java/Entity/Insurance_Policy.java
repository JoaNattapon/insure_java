package myproject.dhip_java.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "insurance_policy")
public class Insurance_Policy {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    
    
    // Constructor
    
    public Insurance_Policy() {
        
    }

    // getter setter

    
    
}
