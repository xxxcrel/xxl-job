package com.xxl.job.core.biz.model;

import java.io.Serializable;
import java.util.List;

public class ProgressResult implements Serializable {

    private static final long serialVersionUID = 43L;

    private List<TaskProgress> progressList;

    public ProgressResult(List<TaskProgress> progressList) {
        this.progressList = progressList;
    }

    public List<TaskProgress> getProgressList() {
        return progressList;
    }

    public void setProgressList(List<TaskProgress> progressList) {
        this.progressList = progressList;
    }
}
