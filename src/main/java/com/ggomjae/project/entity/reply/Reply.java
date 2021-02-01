package com.ggomjae.project.entity.reply;

import com.ggomjae.project.entity.post.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Reply{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private Long rno;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Column(columnDefinition = "Text", length = 1000)
    private String content;

    @Builder
    private Reply(Post post, Long uno, String content){
        this.post = post;
        this.content = content;
    }
}