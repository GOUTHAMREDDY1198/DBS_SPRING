package com.goutham.Insurance.repository;

import org.springframework.data.repository.CrudRepository;
import com.goutham.Insurance.model.InsuranceData;

public interface InsuranceRepository extends CrudRepository<InsuranceData,Integer> {

}
