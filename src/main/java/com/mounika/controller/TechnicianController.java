package com.mounika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mounika.entity.TechnicianEntity;
import com.mounika.service.TechnicianService;

@CrossOrigin("*")
@RestController
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @PostMapping("/saveTechnician")
    public ResponseEntity<TechnicianEntity> saveTechnician(@RequestBody TechnicianEntity technician) {
        TechnicianEntity savedTechnician = technicianService.saveTechnician(technician);

        if (savedTechnician == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(savedTechnician, HttpStatus.CREATED);
    }
    @GetMapping("/get/{techid}")
	public TechnicianEntity getById(@PathVariable String techid) {
		return technicianService.getById(techid);
	}
    @GetMapping("/all")
    public List<TechnicianEntity> getall() {
		return technicianService.getall();
}
}