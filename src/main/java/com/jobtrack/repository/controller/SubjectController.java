
package com.jobtrack.jobtrack.controller;

import com.jobtrack.jobtrack.model.Subject;
import com.jobtrack.jobtrack.repository.SubjectRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    private final SubjectRepository subjectRepository;

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    
@GetMapping("/{id}")
public Subject getSubjectById(@PathVariable Integer id) {
    return subjectRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Subject not found with id: " + id));
}

}

