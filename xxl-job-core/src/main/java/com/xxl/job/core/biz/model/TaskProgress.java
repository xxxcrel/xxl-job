package com.xxl.job.core.biz.model;

import java.io.Serializable;

public class TaskProgress implements Serializable {

    private static final long serialVersionUID = 43L;

    private long jobId;
    private int total;

    private int current;

    public TaskProgress(long jobId, int total, int current) {
        this.jobId = jobId;
        this.total = total;
        this.current = current;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
