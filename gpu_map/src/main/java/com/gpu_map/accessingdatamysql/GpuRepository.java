package com.gpu_map.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.gpu_map.accessingdatamysql.Gpu;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GpuRepository extends CrudRepository<Gpu, Integer> {

}