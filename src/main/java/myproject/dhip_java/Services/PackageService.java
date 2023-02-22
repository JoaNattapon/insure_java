package myproject.dhip_java.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myproject.dhip_java.Repository.MyPackageRepository;


@Service
public class PackageService {
    
    @Autowired MyPackageRepository packageRepository;



    public PackageService() {

    }
}
