package com.mounika.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mounika.entity.TechnicianEntity;

public interface TechnicianRepo extends JpaRepository<TechnicianEntity, String> {

}
