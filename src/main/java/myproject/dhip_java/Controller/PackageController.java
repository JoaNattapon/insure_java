package myproject.dhip_java.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import myproject.dhip_java.Entity.MyPackage;
import myproject.dhip_java.Services.PackageService;



@RestController
public class PackageController {

    @Autowired PackageService packageService;

    @GetMapping("/all-packages")
    public List<MyPackage> getAllPacks() {
        return packageService.getAllPackages();
    }
    
}
