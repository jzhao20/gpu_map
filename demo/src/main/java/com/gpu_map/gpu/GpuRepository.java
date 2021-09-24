package com.gpu_map.gpu;

import org.springframework.data.repository.CrudRepository;

import com.gpu_map.gpu.Gpu;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GpuRepository extends CrudRepository<Gpu, Integer> {

}