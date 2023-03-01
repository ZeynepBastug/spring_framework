package com.spring_example.repository;

import com.spring_example.model.Comment;
import org.springframework.stereotype.Component;

@Component
public interface CommentRepository {
    void storeComment(Comment comment);
}
