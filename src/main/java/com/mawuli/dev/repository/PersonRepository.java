package com.mawuli.dev.repository;

import com.mawuli.dev.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
