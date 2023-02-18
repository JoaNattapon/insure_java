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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Date dateRegist;
    private String nameTitle;
    private String firstName;
    private String lastName;
    private String identityCard;
    private String address;
    private String email;
    private Date startDate;
    
    
    @OneToMany(mappedBy = "customer")
    private List<Insurance_Policy> insurance_policy;
    
    
    
    // Constructor
    
    public Customer(Date dateRegist, String nameTitle, String firstName, String lastName, String identityCard,
            String address, String email, Date startDate, List<Insurance_Policy> insurance_policy) {
        this.dateRegist = dateRegist;
        this.nameTitle = nameTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.address = address;
        this.email = email;
        this.startDate = startDate;
        this.insurance_policy = insurance_policy;
    }

    // getter setter

    public List<Insurance_Policy> getInsurance_policy() {
        return insurance_policy;
    }
    public void setInsurance_policy(List<Insurance_Policy> insurance_policy) {
        this.insurance_policy = insurance_policy;
    }

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
        return nameTitle;
    }
    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
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
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
