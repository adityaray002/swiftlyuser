package com.backend.swiftly.VENDOR.controllers;

import com.backend.swiftly.VENDOR.common.APIResponse;
import com.backend.swiftly.VENDOR.common.CustomVendor;
import com.backend.swiftly.VENDOR.entity.Vendor;
import com.backend.swiftly.VENDOR.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@CrossOrigin
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @PostMapping("/register")
    public APIResponse register(@RequestBody Vendor vendor){

        return vendorService.saveVendor(vendor);


    }

    @GetMapping("/getvendors")
    public APIResponse getAllVendors(){
        return vendorService.getAllVendors();
    }

    @PostMapping("/sign-in")
    public APIResponse signin(@RequestBody CustomVendor customVendor){
        return  vendorService.Authentication(customVendor);
//        HashMap<String,String> map = new  HashMap<String,String>();
//        if (result != null && !result.isEmpty()) {
//            map.put("result",result);
//        } else {
//            map.put("result",null);
//        }
//
//        return map;
    }

    @PostMapping("/home")
    public void home(){

    }

}
