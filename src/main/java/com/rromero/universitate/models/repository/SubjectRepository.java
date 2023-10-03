package com.rromero.universitate.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rromero.universitate.models.documents.Subject;

public interface SubjectRepository extends ReactiveMongoRepository<Subject, Long> {

}
