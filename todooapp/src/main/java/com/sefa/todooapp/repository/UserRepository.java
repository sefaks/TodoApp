package com.sefa.todooapp.repository;

import com.sefa.todooapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
