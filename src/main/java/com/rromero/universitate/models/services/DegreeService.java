package com.rromero.universitate.models.services;

import org.springframework.stereotype.Service;

import com.rromero.universitate.models.documents.Degree;
import com.rromero.universitate.models.repository.DegreeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DegreeService {

	private DegreeRepository degreeRepository;
	
	public Mono<Degree> getDegreeById(Long id) {
		return degreeRepository.findById(id);
	}
	
	public Flux<Degree> getAllDegrees() {
		return degreeRepository.findAll();
	}
	
}
