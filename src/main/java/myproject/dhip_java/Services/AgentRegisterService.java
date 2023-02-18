package myproject.dhip_java.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.dhip_java.Entity.AgentRegister;
import myproject.dhip_java.Repository.AgentRegisterRepository;


@Service
public class AgentRegisterService {
    
    @Autowired AgentRegisterRepository agentRegisterRepository;

    public AgentRegisterService() {

    }

    public List<AgentRegister> getAgents() {
        return agentRegisterRepository.findAll();
    }
}
