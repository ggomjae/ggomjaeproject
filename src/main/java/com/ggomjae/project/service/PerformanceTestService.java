package com.ggomjae.project.service;

import com.ggomjae.project.entity.post.Post;
import com.ggomjae.project.entity.post.PostRepository;
import com.ggomjae.project.entity.reply.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PerformanceTestService {

    private final PostRepository postRepository;
    private final ReplyRepository replyRepository;

    @Transactional(readOnly = true)
    public void testPerformanceMethod(Long pno) throws Exception {
        Post post = postRepository.findById(pno).orElseThrow(()->
            new Exception("Not found Post"));
        System.out.println(post);
    }
}
