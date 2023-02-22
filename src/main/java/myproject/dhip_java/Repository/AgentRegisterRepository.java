package myproject.dhip_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.dhip_java.Entity.AgentRegister;



public interface AgentRegisterRepository extends JpaRepository<AgentRegister, Integer> {
    
}
