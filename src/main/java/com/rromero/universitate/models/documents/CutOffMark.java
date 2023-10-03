package com.rromero.universitate.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class CutOffMark {

	@Id
	private Long id;
	
	@Field("degree_id")
	private Long degreeId;
	
	@Field("university_id")
	private Long universityId;
	
	private Double mark;

	public Long getId() {
		return id;
	}
	
	public Long getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(Long degreeId) {
		this.degreeId = degreeId;
	}

	public Long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}
	
	
}
