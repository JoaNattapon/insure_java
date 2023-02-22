package myproject.dhip_java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myproject.dhip_java.Entity.AgentRegister;
import myproject.dhip_java.Repository.AgentRegisterRepository;
import myproject.dhip_java.Services.AgentRegisterService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RegisterController {

    @Autowired
    AgentRegisterService agentRegisterService;

    @Autowired
    AgentRegisterRepository agentRegisterRepository;
    
    // Test
    @GetMapping("/hithere")
    public String sayHi() {
        return agentRegisterService.helloWorld();
    }

    @GetMapping("/allagents")
    public List<AgentRegister> getAgents() {
        return agentRegisterService.getAgents();
    }

    // @CrossOrigin(origins = "http://localhost:8080/agent-register", allowCredentials = "true")
    @PostMapping("/agent-register")
    public ResponseEntity <String> register(@RequestBody AgentRegister agentRegister) {
        
        agentRegisterService.addAgent(agentRegister);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}