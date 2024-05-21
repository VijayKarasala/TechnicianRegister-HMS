package com.mounika.service;

import java.util.List;

import com.mounika.entity.TechnicianEntity;

public interface TechnicianService {
	
	public TechnicianEntity saveTechnician(TechnicianEntity technician);
	public TechnicianEntity getById(String techid);
	public List<TechnicianEntity> getall();

}
