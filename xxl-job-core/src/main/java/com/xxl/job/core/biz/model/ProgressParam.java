package com.xxl.job.core.biz.model;

import java.io.Serializable;
import java.util.List;

public class ProgressParam implements Serializable {
    private static final long serialVersionUID = 49L;

    private List<Long> jobIds;

    public List<Long> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<Long> jobIds) {
        this.jobIds = jobIds;
    }
}
