package com.sparta.test.model;

import com.sparta.test.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String content;

    public Comment(CommentRequestDto requestDto) {
        this.content = requestDto.getContent();
    }

}
