package com.xxl.job.admin.core.model;

public class XxlJobLogExtension extends XxlJobLog{

    private int handleStatus;

    public XxlJobLogExtension(XxlJobLog xxlJobLog) {
        super(xxlJobLog);
    }

    public int getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(int handleStatus) {
        this.handleStatus = handleStatus;
    }
}
