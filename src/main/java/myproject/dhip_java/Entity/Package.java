package myproject.dhip_java.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "package")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String detail;
    private Integer price;


    @OneToMany(mappedBy = "package")
    private List<Insurance_Policy> insurance_Policies;



    // Constructor
    
    public Package(List<Insurance_Policy> insurance_Policies) {
        this.insurance_Policies = insurance_Policies;
    }

    public Package(String detail, Integer price) {
        this.detail = detail;
        this.price = price;
    }

    // getter setter

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
