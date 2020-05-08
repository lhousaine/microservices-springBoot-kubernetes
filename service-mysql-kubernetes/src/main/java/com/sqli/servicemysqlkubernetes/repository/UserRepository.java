package com.sqli.servicemysqlkubernetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sqli.servicemysqlkubernetes.data.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
