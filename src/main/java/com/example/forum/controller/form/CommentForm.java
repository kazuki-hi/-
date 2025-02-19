package com.example.forum.controller.form;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CommentForm {
    private int id;
    private String comment;
    private int report_id;
    private Date create_date;
    private Date update_date;
}
