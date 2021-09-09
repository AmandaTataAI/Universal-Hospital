package com.UH.UniversalHospital.repository;

import com.UH.UniversalHospital.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<com.UH.UniversalHospital.model.User, Long> {
    User findByEmail(String email);
}
