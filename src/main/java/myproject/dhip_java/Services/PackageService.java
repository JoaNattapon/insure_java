package myproject.dhip_java.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myproject.dhip_java.Repository.MyPackageRepository;
import java.util.List;

import myproject.dhip_java.Entity.MyPackage;


@Service
public class PackageService {
    
    @Autowired MyPackageRepository packageRepository;

    public PackageService() {

    }

    public List<MyPackage> getAllPackages() {
        return packageRepository.findAll();
    }
    
}
