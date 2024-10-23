package com.suryanshupareek.rest_CRUD.controller;

import com.suryanshupareek.rest_CRUD.model.CloudVendor;
import com.suryanshupareek.rest_CRUD.service.service.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //read specific cloud vendor details from DB
    @GetMapping("{vendorId}")
    public Object getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
{
    return cloudVendorService.getCloudVendor(vendorId);

}

  //read all cloud vendor details from BD
    @GetMapping()
    public List <CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping ("{}vendorId")
    public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor((vendorId));
        return "Cloud Vendor Deleted Successfully";
    }
}
