package myproject.dhip_java.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "agent")
public class AgentRegister {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private Integer registNumber;
    private String password;
    private Date registDate;
    private Boolean isAgent;
    private String titleName;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private String email;
    private Integer licenseNumber;
    private Date expireDate;

    @OneToMany(mappedBy = "agent")
    private List<Insurance_Policy> insurance_policy;

    

    // Constructor

    public AgentRegister(List<Insurance_Policy> insurance_policy) {
        this.insurance_policy = insurance_policy;
    }


    public AgentRegister(Integer registNumber, String password, Date registDate, Boolean isAgent, String titleName, String firstname,
            String lastname, String address, String phone, String email, Integer licenseNumber, Date expireDate) {
        

        this.password = password;
        this.registNumber = registNumber;
        this.registDate = registDate;
        this.isAgent = isAgent;
        this.titleName = titleName;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.licenseNumber = licenseNumber;
        this.expireDate = expireDate;
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
        return registNumber;
    }
    public void setRegistNumber(Integer registNumber) {
        this.registNumber = registNumber;
    }
    
    public Date getRegistDate() {
        return registDate;
    }
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Boolean getIsAgent() {
        return isAgent;
    }
    public void setIsAgent(Boolean isAgent) {
        this.isAgent = isAgent;
    }    
    
    public String getTitleName() {
        return titleName;
    }
    public void setTitleName(String titleName) {
        this.titleName = titleName;
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
        return licenseNumber;
    }
    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
