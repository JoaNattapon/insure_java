package myproject.dhip_java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import myproject.dhip_java.Entity.AgentRegister;
import myproject.dhip_java.Services.AgentRegisterService;



@RestController
public class Register {

    @Autowired
    AgentRegisterService agentRegisterService;
    
    @GetMapping("allagents")
    public List<AgentRegister> getAgents() {
        return agentRegisterService.getAgents();
    }

}