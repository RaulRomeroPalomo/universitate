package com.rromero.universitate.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rromero.universitate.models.documents.Degree;

public interface DegreeRepository extends ReactiveMongoRepository<Degree, Long> {

}
