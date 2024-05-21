package com.mounika.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mounika.entity.TechnicianEntity;
import com.mounika.repo.TechnicianRepo;
import com.mounika.utility.IdGenerator;

@Service
public class TechnicianServiceImpl implements TechnicianService {

	@Autowired
	public TechnicianRepo technicianRepo;

	@Autowired
	public IdGenerator idGenerator;

	@Override
	public TechnicianEntity saveTechnician(TechnicianEntity technician) {
		if (technician == null) {
			return null;
		}
		String uniqueId = idGenerator.generateUniqueId("technician");
		technician.setTechid(uniqueId);
		return technicianRepo.save(technician);
	}

	@Override
	public TechnicianEntity getById(String techid) {
		Optional<TechnicianEntity> entity = technicianRepo.findById(techid);
		if(entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	@Override
	public List<TechnicianEntity> getall() {
		return technicianRepo.findAll();
	}

}
