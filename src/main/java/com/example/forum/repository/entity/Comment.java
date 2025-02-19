package com.example.forum.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @Column
    private int id;

    @Column(name = "content")
    private String comment;

    @Column
    private int report_id;

    @Column
    private Date create_date;

    @Column
    private Date update_date;
}
