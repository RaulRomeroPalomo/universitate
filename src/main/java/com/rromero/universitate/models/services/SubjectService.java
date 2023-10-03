package com.rromero.universitate.models.services;

import org.springframework.stereotype.Service;

import com.rromero.universitate.models.documents.Subject;
import com.rromero.universitate.models.repository.SubjectRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SubjectService {

	private SubjectRepository subjectRepository;
	
	public Mono<Subject> getSubjectById(Long id) {
		return subjectRepository.findById(id);
	}
	
	public Flux<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}
	
}
