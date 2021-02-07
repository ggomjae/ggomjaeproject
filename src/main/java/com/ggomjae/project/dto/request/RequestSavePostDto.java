package com.ggomjae.project.dto.request;

import com.ggomjae.project.entity.post.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestSavePostDto {

    private String title;

    @Builder
    public RequestSavePostDto(String title){
        this.title = title;
    }

    public Post toPost(){
        return Post.builder()
                .title(this.title)
                .build();
    }
}