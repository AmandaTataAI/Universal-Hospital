package com.UH.UniversalHospital.service;

import com.UH.UniversalHospital.model.User;
import com.UH.UniversalHospital.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    @Override
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
