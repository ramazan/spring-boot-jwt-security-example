package com.ramazan.security.repository;

import com.ramazan.security.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsername(String username);
}
