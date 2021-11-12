package com.sparta.test.controller;

import com.sparta.test.dto.CommentRequestDto;
import com.sparta.test.model.Comment;
import com.sparta.test.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository repository;

    @GetMapping("/api/comments")
    public List<Comment> getComment() {
        return repository.findAll();
    }

    @PostMapping("/api/comments")
    public Comment createComment(@RequestBody CommentRequestDto requestDto) {
        Comment comment = new Comment(requestDto);
        return repository.save(comment);
    }
}
