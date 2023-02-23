package myproject.dhip_java.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "agent")
public class AgentRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    private Integer registnumber;
    private Date registdate;
    private Boolean isagent;
    private String titlename;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private Integer licensenumber;
    private Date expiredate;

    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "agent_id", referencedColumnName = "id")
    private List<Customer> customer;

    

    // Constructor

    public AgentRegister(List<Customer> customer) {
        this.customer = customer;
    }

    public AgentRegister() {

    }

    public AgentRegister(Integer registnumber, String password, Date registdate, Boolean isagent, String titlename, String firstname,
            String lastname, String address, String phone, String email, Integer licensenumber, Date expiredate) {
        

        this.password = password;
        this.registnumber = registnumber;
        this.registdate = registdate;
        this.isagent = isagent;
        this.titlename = titlename;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.licensenumber = licensenumber;
        this.expiredate = expiredate;
    }


    // getter setter

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getRegistNumber() {
        return registnumber;
    }
    public void setRegistNumber(Integer registNumber) {
        this.registnumber = registNumber;
    }
    
    public Date getRegistDate() {
        return registdate;
    }
    public void setRegistDate(Date registDate) {
        this.registdate = registDate;
    }

    public Boolean getIsAgent() {
        return isagent;
    }
    public void setIsAgent(Boolean isAgent) {
        this.isagent = isAgent;
    }    
    
    public String getTitleName() {
        return titlename;
    }
    public void setTitleName(String titleName) {
        this.titlename = titleName;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLicenseNumber() {
        return licensenumber;
    }
    public void setLicenseNumber(Integer licenseNumber) {
        this.licensenumber = licenseNumber;
    }

    public Date getExpireDate() {
        return expiredate;
    }
    public void setExpireDate(Date expireDate) {
        this.expiredate = expireDate;
    }
}
