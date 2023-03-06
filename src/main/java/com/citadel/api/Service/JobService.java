package com.citadel.api.Service;

import com.citadel.api.Domain.JobInfo;

import java.util.List;

public interface JobService {
    List<JobInfo> getJobList();
}
