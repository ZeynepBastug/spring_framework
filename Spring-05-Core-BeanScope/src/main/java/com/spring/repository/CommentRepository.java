package com.spring.repository;

import com.spring.model.Comment;
import org.springframework.stereotype.Component;

@Component
public interface CommentRepository {
    void storeComment(Comment comment);
}
