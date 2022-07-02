package com.xxl.job.core.progress;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.xxl.job.core.biz.model.TaskProgress;

public class ProgressRepository {

    private static ConcurrentHashMap<Long, TaskProgress> progressCache = new ConcurrentHashMap<>();

    public static void setProgress(Long jobId, int total, int current) {
        if (progressCache.contains(jobId)) {
            TaskProgress tuple = progressCache.get(jobId);
            tuple.setTotal(total);
            tuple.setCurrent(current);
        } else {
            TaskProgress tuple = new TaskProgress(jobId, total, current);
            progressCache.put(jobId, tuple);
        }
    }

    public static List<TaskProgress> getProgress(List<Long> jobIds) {
        List<TaskProgress> progressList = new ArrayList<>();
        for (Long jobId : jobIds) {
            if (progressCache.containsKey(jobId)) {
                progressList.add(progressCache.get(jobId));
            }
        }
        return progressList;
    }
}
