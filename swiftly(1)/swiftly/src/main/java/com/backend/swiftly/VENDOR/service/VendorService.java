package com.backend.swiftly.VENDOR.service;

import com.backend.swiftly.VENDOR.common.APIResponse;
import com.backend.swiftly.VENDOR.common.CustomVendor;
import com.backend.swiftly.VENDOR.entity.Vendor;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {
      public APIResponse saveVendor(Vendor vendor);
     public APIResponse getAllVendors();

    public APIResponse Authentication(CustomVendor customVendor);


  //   public User getVendorByid(int id);
}
