package com.virakvoan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virakvoan.demo.model.position;
import com.virakvoan.demo.repository.PositionRepository;

@Service
public class PositionService {

	@Autowired
		PositionRepository posRepository;
	
	// CREATE 
	public position createposition(position pos) {
	    return posRepository.save(pos);
	}

	// READ
	public List<position> getpositions() {
	    return posRepository.findAll();
	}

	// DELETE
	public void deleteposition(Long ID) {
		posRepository.deleteById(ID);
	}
	
}
