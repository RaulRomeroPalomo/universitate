package com.rromero.universitate.models.services;

import org.springframework.stereotype.Service;

import com.rromero.universitate.models.documents.University;
import com.rromero.universitate.models.repository.UniversityRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UniversityService {

	private UniversityRepository universityRepository;
	
	public Mono<University> getUniversityById(Long id) {
		return universityRepository.findById(id);
	}
	
	public Flux<University> getAllUniversities() {
		return universityRepository.findAll();
	}
	
}
