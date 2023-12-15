package com.kitchen.story.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kitchen.story.entity.UserClass;

import jakarta.transaction.Transactional;
@Repository
public interface UserRepository extends JpaRepository<UserClass, Integer>{
@Transactional
@Modifying
@Query(value="update UserClass u set u.password=:password where u.userName=:admin")
public void updatePassword(@Param("password") String password,@Param("admin") String admin);
}
