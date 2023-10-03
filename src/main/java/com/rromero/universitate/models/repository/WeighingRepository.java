package com.rromero.universitate.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rromero.universitate.models.documents.CutOffMark;
import com.rromero.universitate.models.documents.Weighing;

import reactor.core.publisher.Flux;

public interface WeighingRepository extends ReactiveMongoRepository<Weighing, Long> {

	Flux<Weighing> findByDegreeId(Long degreeId);
    Flux<Weighing> findBySubjectId(Long subjectId);
	
}
