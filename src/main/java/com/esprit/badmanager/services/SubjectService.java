package com.esprit.badmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.badmanager.entities.Subject;
import com.esprit.badmanager.repositories.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepo;
	
	public Subject getById(long id) {
		return subjectRepo.findById(id).orElse(null);
	}
	
	public Subject getByName(String name) {
		return subjectRepo.findSubjectByName(name).orElse(null);
	}
	
	public Subject getByTitle(String title) {
		return subjectRepo.findSubjectByTitle(title).orElse(null);
	}
}
