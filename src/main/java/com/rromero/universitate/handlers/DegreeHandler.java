package com.rromero.universitate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.models.documents.Degree;
import com.rromero.universitate.models.services.DegreeService;

import reactor.core.publisher.Mono;

@Component
public class DegreeHandler {

	@Autowired
	private DegreeService degreeService;

	public Mono<ServerResponse> getAllDegrees(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(degreeService.getAllDegrees(), Degree.class);
	}
	
	public Mono<ServerResponse> getDegreeById(ServerRequest serverRequest) {
		
		Long id = Long.parseLong(serverRequest.pathVariable("id"));
		return degreeService.getDegreeById(id).flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(s)));
	}

}
