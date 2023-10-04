package com.rromero.universitate.models.services;

import org.springframework.stereotype.Service;

import com.rromero.universitate.models.documents.CutOffMark;
import com.rromero.universitate.models.repository.CutOffMarkRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CutOffMarkService {

	private CutOffMarkRepository cutOffMarkRepository;
	
	public Mono<CutOffMark> getCutOffMarkById(Long id) {
		return cutOffMarkRepository.findById(id);
	}
	
	public Flux<CutOffMark> getAllCutOffMarks() {
		return cutOffMarkRepository.findAll();
	}
	
}
