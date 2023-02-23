package myproject.dhip_java.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import myproject.dhip_java.Entity.AgentRegister;


@Repository
public interface AgentRegisterRepository extends JpaRepository<AgentRegister, Integer> {

    @Query(value = "SELECT * FROM agent WHERE email = ?1", nativeQuery = true)
    Optional<AgentRegister> findByEmail(String email);


}
