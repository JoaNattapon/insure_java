package myproject.dhip_java.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "insurance_policy")
public class Insurance_Policy {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentRegister agentRegister;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    

    @ManyToOne
    @JoinColumn(name = "package_id")
    private Package package1;


}
