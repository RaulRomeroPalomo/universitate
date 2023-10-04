package com.rromero.universitate.models.services;

import org.springframework.stereotype.Service;

import com.rromero.universitate.models.documents.Weighing;
import com.rromero.universitate.models.repository.WeighingRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WeighingService {

	private WeighingRepository weighingRepository;
	
	public Mono<Weighing> getWeighingById(Long id) {
		return weighingRepository.findById(id);
	}
	
	public Flux<Weighing> getAllWeighings() {
		return weighingRepository.findAll();
	}
	
}
