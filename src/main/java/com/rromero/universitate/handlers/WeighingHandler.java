package com.rromero.universitate.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.models.documents.Weighing;
import com.rromero.universitate.models.services.WeighingService;

import reactor.core.publisher.Mono;

@Component
public class WeighingHandler {

	@Autowired
	private WeighingService weighingService;

	public Mono<ServerResponse> getAllWeighings(ServerRequest serverRequest) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(weighingService.getAllWeighings(), Weighing.class);
	}
	
	public Mono<ServerResponse> getWeighingById(ServerRequest serverRequest) {
		
		Long id = Long.parseLong(serverRequest.pathVariable("id"));
		return weighingService.getWeighingById(id).flatMap(s -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(s)));
	}

}
