package com.rromero.universitate.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rromero.universitate.models.documents.University;

public interface UniversityRepository extends ReactiveMongoRepository<University, Long> {

}
