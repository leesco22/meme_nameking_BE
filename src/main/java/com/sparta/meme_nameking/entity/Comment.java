package com.sparta.meme_nameking.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sparta.meme_nameking.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    // 다대일 관계 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

//    @JsonBackReference
//    @OneToMany(mappedBy = "comment", cascade = CascadeType.REMOVE)
//    private CommentDdabong commentDdabong;


    public Comment(CommentRequestDto commentRequestDto, User user, Post post) {
//        this.content = commentRequestDto.getContent;
        this.user = user;
        this.post = post;
    }
}
