package com.ggomjae.project.controller;

import com.ggomjae.project.dto.request.RequestSavePostDto;
import com.ggomjae.project.service.PerformanceTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PerformanceTestController {

    private final PerformanceTestService performanceTestService;

    @GetMapping("/test/{pno}")
    public void testPerformanceMethod(@PathVariable Long pno) throws Exception {
        performanceTestService.testPerformanceMethod(pno);
    }

    @PostMapping("/posts")
    public void savePost(@RequestBody RequestSavePostDto requestSavePostDto){
        performanceTestService.savePost(requestSavePostDto);
    }
}