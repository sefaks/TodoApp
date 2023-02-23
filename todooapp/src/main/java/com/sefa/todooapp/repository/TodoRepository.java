package com.sefa.todooapp.repository;

import com.sefa.todooapp.entity.Todo;
import com.sefa.todooapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Todo,Integer> {
}
