package com.citadel.api.Controller;

import com.citadel.api.Domain.Job;
import com.citadel.api.Service.JobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("/")
    public ResponseEntity<List<Job>> getJobList() {
        return ResponseEntity.ok(jobService.getJobList());
    }
}
