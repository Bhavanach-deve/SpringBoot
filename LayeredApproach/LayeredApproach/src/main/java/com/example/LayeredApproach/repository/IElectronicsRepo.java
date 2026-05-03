package com.example.LayeredApproach.repository;

import com.example.LayeredApproach.entity.Electronics;
import org.springframework.data.repository.CrudRepository;

public interface IElectronicsRepo extends CrudRepository<Electronics,Integer> {
}
