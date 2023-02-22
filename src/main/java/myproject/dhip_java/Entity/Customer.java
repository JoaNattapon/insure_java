package myproject.dhip_java.Entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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


    
    
    // Constructor

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
}
