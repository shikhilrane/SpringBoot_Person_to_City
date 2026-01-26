package com.shikhilrane.personCity.personToCity.repositories;

import com.shikhilrane.personCity.personToCity.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByCityId(Long cityId);

}