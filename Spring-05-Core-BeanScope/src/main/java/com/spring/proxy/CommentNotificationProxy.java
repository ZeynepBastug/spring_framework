package com.spring.proxy;

import com.spring.model.Comment;

import org.springframework.stereotype.Component;

@Component
public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
