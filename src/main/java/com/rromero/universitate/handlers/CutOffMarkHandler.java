package com.rromero.universitate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.models.documents.CutOffMark;
import com.rromero.universitate.models.services.CutOffMarkService;

import reactor.core.publisher.Mono;

@Component
public class CutOffMarkHandler {

	@Autowired
	private CutOffMarkService cutOffMarkService;

	public Mono<ServerResponse> getAllCutOffMarks(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(cutOffMarkService.getAllCutOffMarks(), CutOffMark.class);
	}
	
	public Mono<ServerResponse> getCutOffMarkById(ServerRequest serverRequest) {
		
		Long id = Long.parseLong(serverRequest.pathVariable("id"));
		return cutOffMarkService.getCutOffMarkById(id).flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(s)));
	}

}
