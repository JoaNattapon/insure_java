package myproject.dhip_java.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "package")
public class MyPackage {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String detail;
    private Integer price;


    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "package_id", referencedColumnName = "id")
    private List<Customer> customer;



    // Constructor
    
    public MyPackage(List<Customer> customer) {
        this.customer = customer;
    }
    
    public MyPackage(String detail, Integer price) {
        this.detail = detail;
        this.price = price;
    }

    public MyPackage() {

    }

    // getter setter
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
}
