package com.UH.UniversalHospital.service;

import com.UH.UniversalHospital.model.Role;
import com.UH.UniversalHospital.model.User;
import com.UH.UniversalHospital.repository.UserRepository;
import com.UH.UniversalHospital.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;



    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public com.UH.UniversalHospital.model.User save(UserRegistrationDto registrationDto) {
       com.UH.UniversalHospital.model.User user = new com.UH.UniversalHospital.model.User(registrationDto.getFname(),
               registrationDto.getLname(), registrationDto.getPhone(),
               registrationDto.getEmail(), passwordEncoder.encode(registrationDto.getPassword()),
               passwordEncoder.encode(registrationDto.getCpassword()), registrationDto.getAddress(),
               registrationDto.getHname(), registrationDto.getHaddress(),
               registrationDto.getProfession(), registrationDto.getYears(), Arrays.asList(new Role("ROLE_USER")));
       return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      User user = userRepository.findByEmail(username);
      if (user == null){
          throw new UsernameNotFoundException("Invalid username or password");
      }
      return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
