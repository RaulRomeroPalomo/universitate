package com.rromero.universitate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.models.documents.Subject;
import com.rromero.universitate.models.services.SubjectService;

import reactor.core.publisher.Mono;

@Component
public class SubjectHandler {

	@Autowired
	private SubjectService subjectService;

	public Mono<ServerResponse> getAllSubjects(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(subjectService.getAllSubjects(), Subject.class);
	}
	
	public Mono<ServerResponse> getSubjectById(ServerRequest serverRequest) {
		
		Long id = Long.parseLong(serverRequest.pathVariable("id"));
		return subjectService.getSubjectById(id).flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(s)));
	}

}
