package com.controlpersonalbancolombia.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.controlpersonalbancolombia.model.Users;

@Repository("repositorio")
public interface IUserRepository extends JpaRepository<Users, Long> {
	
	

}
