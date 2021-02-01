package com.ggomjae.project.entity.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long pno;

    @Column(length = 500, nullable = false)
    private String title;

    @Builder
    public Post(String title){
        this.title = title;
    }
}