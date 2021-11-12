package com.sparta.test.repository;

import com.sparta.test.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment, Long>{
}
