package com.goutham.withdatabase.repository;

import org.springframework.data.repository.CrudRepository;

import com.goutham.withdatabase.Model.InsuranceData;

public interface InsuranceRepository extends CrudRepository<InsuranceData,Integer> {

}
