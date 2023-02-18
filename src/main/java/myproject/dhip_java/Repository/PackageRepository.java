package myproject.dhip_java.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PackageRepository extends JpaRepository <Package, Integer> {
    
}
