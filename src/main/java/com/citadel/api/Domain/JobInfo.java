package com.citadel.api.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
// @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobInfo {
    private int no;
    private String name;
    private String skill;

    public JobInfo(int no, String name, String description) {
        this.setNo(no);
        this.setName(name);
        this.setSkill(description);
    }
}
