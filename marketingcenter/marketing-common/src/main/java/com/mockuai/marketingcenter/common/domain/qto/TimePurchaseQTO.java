package com.mockuai.marketingcenter.common.domain.qto;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by huangsiqian on 2016/10/8.
 */
public class TimePurchaseQTO extends PageQTO implements Serializable {
    private Long id;
    private String activityName;
    private Date startTime;
    private Date endTime;
    private String activityTag;
    private Integer voucherType;
    //发布状态
    private Integer issueStatus;
    //活动进行状态
    private Integer runStatus;

    private List<TimePurchaseGoodsQTO> goodsInfo;


    public List<TimePurchaseGoodsQTO> getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(List<TimePurchaseGoodsQTO> goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getActivityTag() {
        return activityTag;
    }

    public void setActivityTag(String activityTag) {
        this.activityTag = activityTag;
    }

    public Integer getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(Integer voucherType) {
        this.voucherType = voucherType;
    }

    public Integer getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(Integer issueStatus) {
        this.issueStatus = issueStatus;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }
}
