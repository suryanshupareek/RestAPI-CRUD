package com.suryanshupareek.rest_CRUD.service.service.service;

import com.suryanshupareek.rest_CRUD.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
        public String createCloudVendor(CloudVendor cloudVendor);
        public String updateCloudVendor(CloudVendor cloudVendor);
        public String deleteCloudVendor(String cloudVendorId);
        public Object getCloudVendor(String cloudVendorId);
        public List<CloudVendor> getAllCloudVendors();


}
