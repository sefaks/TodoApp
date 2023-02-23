package com.sefa.todooapp.service;


import com.sefa.todooapp.entity.User;
import com.sefa.todooapp.exception.UserNotFoundException;
import com.sefa.todooapp.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService{

        private final UserRepository userRepository;
    @Transactional
    public User saveUser(User user){

        final User userDb = userRepository.save(user);

        return userDb;
    }


    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        List<User> users1 = new ArrayList<>();

        users.forEach(it -> {
            User user =new User();
            user.setId(it.getId());
            user.setUserId(it.getUserId());
            user.setName(it.getName());
           user.setEmail(it.getEmail());
            user.setTodoList(it.getTodoList());


            users1.add(user);
        });
        return users1;
    }
    public User getUserById(int id) {
        return  userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " +  id));
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);

    }
}
