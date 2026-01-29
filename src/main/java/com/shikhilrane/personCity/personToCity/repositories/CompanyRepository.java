package com.shikhilrane.personCity.personToCity.repositories;

import com.shikhilrane.personCity.personToCity.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}