package com.ggomjae.project.controller;

import com.ggomjae.project.service.PerformanceTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PerformanceTestController {

    private final PerformanceTestService performanceTestService;

    @GetMapping("/test/{pno}")
    public void testPerformanceMethod(@PathVariable Long pno) throws Exception {
        performanceTestService.testPerformanceMethod(pno);
    }
}