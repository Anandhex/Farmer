package com.farmer.services;

import java.util.List;

import com.farmer.model.TractorDetails;

public interface TractorDataDao {
	public List<TractorDetails> findAll();
	public TractorDetails findOne(String id);
	public TractorDetails findOneByName(String name);
	public void addTractor(TractorDetails tractorDetails);
}
