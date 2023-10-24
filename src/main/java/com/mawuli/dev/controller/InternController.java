package com.mawuli.dev.controller;

import com.mawuli.dev.entity.Intern;
import com.mawuli.dev.repository.InternRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interns")
public class InternController {

    @GetMapping
    public List<Intern> getAllInterns() {
        List<Intern> interns = internRepository.findAll();

        return interns;
    }


    private final InternRepository internRepository;

    public InternController(InternRepository internRepository) {
        this.internRepository = internRepository;
    }


    @PostMapping
    public Intern createIntern(@RequestBody Intern intern) {
        Intern savedIntern = internRepository.save(intern);

        return savedIntern;
    }

    @DeleteMapping("/{id}")
    public String deleteIntern(@PathVariable Long id) {
        Optional<Intern> existingInternOptional = internRepository.findById(id);

        if (existingInternOptional.isPresent()) {
            internRepository.deleteById(id);

            return String.valueOf(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } else {
            return "Intern not found with ID: " + id;
        }
    }

    @PatchMapping("/{id}")
    public String update(@RequestBody Intern interns, @PathVariable Long id) {
        Optional<Intern> intern = internRepository.findById(id);



        intern.get().setFirstName(interns.getFirstName());
        intern.get().setSchool(interns.getSchool());
        intern.get().setLastName(interns.getLastName());
        intern.get().setDateOfBirth(interns.getDateOfBirth());

        Intern data =  internRepository.save(interns);
        return "no record found";

    }
}
