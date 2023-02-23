package com.sefa.todooapp.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "list")
public class Todo {

    @Id
    @SequenceGenerator(name = "seq_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_id", strategy = GenerationType.SEQUENCE)
    private int id;


    @Column(name="list_id")
    private int listId;

    @Column(name="list_name")
    private String listName;

    @Column(name="content")
    private String content;
}
