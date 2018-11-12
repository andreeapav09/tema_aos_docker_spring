package com.unitbv.aos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitbv.aos.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
