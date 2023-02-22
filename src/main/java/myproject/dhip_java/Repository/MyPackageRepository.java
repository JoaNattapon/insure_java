package myproject.dhip_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.dhip_java.Entity.MyPackage;


public interface MyPackageRepository extends JpaRepository <MyPackage, Integer> {
    
}
