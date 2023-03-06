package com.citadel.api.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
// @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Job {
    private int no;
    private String name;
    private String skill;

    public Job(int no, String name, String description) {
        this.setNo(no);
        this.setName(name);
        this.setSkill(description);
    }
}
