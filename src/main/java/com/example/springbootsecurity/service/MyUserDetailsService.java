package com.example.springbootsecurity.service;

import com.example.springbootsecurity.model.User;
import com.example.springbootsecurity.repository.myrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private myrepo Myrepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = Myrepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user);
    }
}
