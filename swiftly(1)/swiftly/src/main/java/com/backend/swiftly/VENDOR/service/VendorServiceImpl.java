//package com.backend.swiftly.VENDOR.service;
//
//import com.backend.swiftly.VENDOR.common.APIResponse;
//import com.backend.swiftly.VENDOR.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//public class VendorServiceImpl {
//}
package com.backend.swiftly.VENDOR.service;

import com.backend.swiftly.VENDOR.common.APIResponse;
import com.backend.swiftly.VENDOR.common.CustomVendor;
import com.backend.swiftly.VENDOR.entity.Vendor;
import com.backend.swiftly.VENDOR.repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {


    @Autowired
    private VendorRepo repo;

    @Override
    public APIResponse saveVendor(Vendor vendor) {

        Vendor result=repo.save(vendor);
        APIResponse response = new APIResponse(200,result,null);
        response.setStatus(200);
        response.setData(vendor);
        response.setError(null);
        return response;



    }

    @Override
    public APIResponse getAllVendors() {

        List<Vendor> vendors =  repo.findAll();
        APIResponse response = new APIResponse(200,vendors,null);
        return response;
    }

//    public User getUserByid(int id){
//
//        return repo.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
//
//    }
//

    @Override
    public APIResponse Authentication(CustomVendor customVendor){
        APIResponse response = new APIResponse(201,null,null);

        List<Vendor> vendors = repo.findAll();

        for (Vendor vendor : vendors) {
            if (vendor.getEmail().equals(customVendor.getEmail()) && vendor.getPassword().equals(customVendor.getPassword())) {
                response.setData(vendor);
                response.setStatus(200);

                break;

            }
        }
        return response;
    }
}
