package com.sefa.todooapp.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @SequenceGenerator(name = "seqq_id", allocationSize = 1)
    @GeneratedValue(generator = "seqq_id", strategy = GenerationType.SEQUENCE)
    private int id;


    @Column(name="user_id")
    private int userId;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Todo> todoList;


}
