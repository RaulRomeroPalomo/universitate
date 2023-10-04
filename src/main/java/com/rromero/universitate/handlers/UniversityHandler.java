package com.rromero.universitate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.models.documents.University;
import com.rromero.universitate.models.services.UniversityService;

import reactor.core.publisher.Mono;

@Component
public class UniversityHandler {

	@Autowired
	private UniversityService universityService;

	public Mono<ServerResponse> getAllUniversities(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(universityService.getAllUniversities(), University.class);
	}
	
	public Mono<ServerResponse> getUniversityById(ServerRequest serverRequest) {
		
		Long id = Long.parseLong(serverRequest.pathVariable("id"));
		return universityService.getUniversityById(id).flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(s)));
	}

}
