package com.rromero.universitate.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "weighings")
public class Weighing {

	@Id
	private Long id;
	
	@Field("subject_id")
	private Long subjectId;
	
	@Field("degree_id")
	private Long degreeId;
	
	private Double weight;

	public Long getId() {
		return id;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
}
