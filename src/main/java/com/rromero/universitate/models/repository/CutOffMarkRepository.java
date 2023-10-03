package com.rromero.universitate.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rromero.universitate.models.documents.CutOffMark;

import reactor.core.publisher.Flux;

public interface CutOffMarkRepository extends ReactiveMongoRepository<CutOffMark, Long> {

	Flux<CutOffMark> findByDegreeId(Long degreeId);
    Flux<CutOffMark> findByUniversityId(Long universityId);
	
}
