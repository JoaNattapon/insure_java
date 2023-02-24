package myproject.dhip_java.Entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @DateTimeFormat
    private Date dateRegist;

    private String nametitle;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String identitycard;

    @DateTimeFormat
    private Date startdate;

    @ManyToOne(targetEntity = AgentRegister.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "agent_id", referencedColumnName = "id")
    private List<AgentRegister> agent;


    @ManyToOne(targetEntity = MyPackage.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "package_id", referencedColumnName = "id")
    private List<MyPackage> packages;
    
    
    // Constructor

    public Customer(List<AgentRegister> agent) {
        this.agent = agent;
    }

    public Customer(Date dateRegist, String nametitle, String firstname, String lastname, String identitycard,
            String address, String email, Date startdate) {
        this.dateRegist = dateRegist;
        this.nametitle = nametitle;
        this.firstname = firstname;
        this.lastname = lastname;
        this.identitycard = identitycard;
        this.address = address;
        this.email = email;
        this.startdate = startdate;
    }

    public Customer() {

    }

    // getter setter

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateRegist() {
        return dateRegist;
    }
    public void setDateRegist(Date dateRegist) {
        this.dateRegist = dateRegist;
    }

    public String getNameTitle() {
        return nametitle;
    }
    public void setNameTitle(String nametitle) {
        this.nametitle = nametitle;
    }

    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentityCard() {
        return identitycard;
    }
    public void setIdentityCard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStartDate() {
        return startdate;
    }
    public void setStartDate(Date startdate) {
        this.startdate = startdate;
    }

    public List<AgentRegister> getAgent() {
        return agent;
    }
    public void setAgent(List<AgentRegister> agent) {
        this.agent = agent;
    }

    public List<MyPackage> getPackages() {
        return packages;
    }
    public void setPackages(List<MyPackage> packages) {
        this.packages = packages;
    }
}
