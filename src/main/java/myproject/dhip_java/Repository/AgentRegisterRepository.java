package myproject.dhip_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myproject.dhip_java.Entity.AgentRegister;

@Repository
public interface AgentRegisterRepository extends JpaRepository<AgentRegister, Integer> {
    
}
