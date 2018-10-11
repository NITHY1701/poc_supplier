package com.zmast.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmast.poc.model.Supplier;



@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
