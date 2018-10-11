package com.zmast.poc.service;

import java.util.List;

import com.zmast.poc.model.Supplier;



public interface SupplierService {
	void save(Supplier supplier);
	Supplier findById(Long id);
	List<Supplier> getAllSupplier();

}
