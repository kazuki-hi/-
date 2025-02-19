package com.example.forum.service;

import com.example.forum.controller.form.CommentForm;
import com.example.forum.repository.CommentRepository;
import com.example.forum.repository.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;


public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    /*
     * コメント追加
     */
    public void saveComment(CommentForm reqComment){
        Comment saveComment = SetCommentEntity(reqComment);
        commentRepository.save(saveComment);
    }

    /*
     * エンティティにセット
     */
    private Comment SetCommentEntity(CommentForm ReqComment){
        Comment comment = new Comment();
        comment.setId(comment.getId());
        comment.setReport_id(comment.getReport_id());
        comment.setComment(comment.getComment());
        return comment;
    }
}
