package com.suryanshupareek.rest_CRUD.service.service.service.impl;

import com.suryanshupareek.rest_CRUD.model.CloudVendor;
import com.suryanshupareek.rest_CRUD.repository.CloudVendorRepository;
import com.suryanshupareek.rest_CRUD.service.service.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
       cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
