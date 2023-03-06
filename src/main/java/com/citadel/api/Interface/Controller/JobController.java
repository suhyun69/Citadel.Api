package com.citadel.api.Interface.Controller;

import com.citadel.api.Domain.Job.Model.Job;
import com.citadel.api.Domain.Job.Service.JobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
