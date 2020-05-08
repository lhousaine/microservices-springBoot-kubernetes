package com.sqli.servicemysqlkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sqli.servicemysqlkubernetes.data.User;
import com.sqli.servicemysqlkubernetes.repository.UserRepository;

@SpringBootApplication
public class ServiceMysqlKubernetesApplication implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(ServiceMysqlKubernetesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(User.builder().name("lhoussaine").email("lh@gmail.com").password("1234").build());
        userRepository.save(User.builder().name("lahcen").email("lah@gmail.com").password("1234").build());
        userRepository.save(User.builder().name("brahim").email("br@gmail.com").password("1234").build());
        userRepository.save(User.builder().name("youssef").email("you@gmail.com").password("1234").build());
    }
}
