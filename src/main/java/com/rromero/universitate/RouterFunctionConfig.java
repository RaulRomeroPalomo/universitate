package com.rromero.universitate;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rromero.universitate.handlers.CutOffMarkHandler;
import com.rromero.universitate.handlers.DegreeHandler;
import com.rromero.universitate.handlers.SubjectHandler;
import com.rromero.universitate.handlers.UniversityHandler;
import com.rromero.universitate.handlers.WeighingHandler;

@Configuration
public class RouterFunctionConfig {

    @Bean
    RouterFunction<ServerResponse> routes(SubjectHandler handler){
		return route(GET("/subjects"), handler::getAllSubjects)
				.andRoute(GET("/subject/{id}"), handler::getSubjectById);
	}
    
    @Bean
    RouterFunction<ServerResponse> routes(DegreeHandler handler){
		return route(GET("/degrees"), handler::getAllDegrees)
				.andRoute(GET("/degree/{id}"), handler::getDegreeById);
	}
    
    @Bean
    RouterFunction<ServerResponse> routes(UniversityHandler handler){
		return route(GET("/universities"), handler::getAllUniversities)
				.andRoute(GET("/university/{id}"), handler::getUniversityById);
	}
    
    @Bean
    RouterFunction<ServerResponse> routes(CutOffMarkHandler handler){
		return route(GET("/cutoffmarks"), handler::getAllCutOffMarks)
				.andRoute(GET("/cutoffmark/{id}"), handler::getCutOffMarkById);
	}
    
    @Bean
    RouterFunction<ServerResponse> routes(WeighingHandler handler){
		return route(GET("/weighings"), handler::getAllWeighings)
				.andRoute(GET("/weighing/{id}"), handler::getWeighingById);
	}

}
