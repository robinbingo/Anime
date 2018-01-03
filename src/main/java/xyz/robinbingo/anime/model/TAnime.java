package xyz.robinbingo.anime.model;

import java.math.BigDecimal;
import java.util.Date;

public class TAnime {
    private Integer id;

    private String foreignName;

    private String chineseName;

    private Integer episode;

    private String broadcastStart;

    private String broadcastEnd;

    private String isFinished;

    private String broadcastWeek;

    private String isIncluded;

    private String isWatched;

    private String watchTime;

    private BigDecimal star;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName == null ? null : foreignName.trim();
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getBroadcastStart() {
        return broadcastStart;
    }

    public void setBroadcastStart(String broadcastStart) {
        this.broadcastStart = broadcastStart == null ? null : broadcastStart.trim();
    }

    public String getBroadcastEnd() {
        return broadcastEnd;
    }

    public void setBroadcastEnd(String broadcastEnd) {
        this.broadcastEnd = broadcastEnd == null ? null : broadcastEnd.trim();
    }

    public String getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(String isFinished) {
        this.isFinished = isFinished == null ? null : isFinished.trim();
    }

    public String getBroadcastWeek() {
        return broadcastWeek;
    }

    public void setBroadcastWeek(String broadcastWeek) {
        this.broadcastWeek = broadcastWeek == null ? null : broadcastWeek.trim();
    }

    public String getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(String isIncluded) {
        this.isIncluded = isIncluded == null ? null : isIncluded.trim();
    }

    public String getIsWatched() {
        return isWatched;
    }

    public void setIsWatched(String isWatched) {
        this.isWatched = isWatched == null ? null : isWatched.trim();
    }

    public String getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(String watchTime) {
        this.watchTime = watchTime == null ? null : watchTime.trim();
    }

    public BigDecimal getStar() {
        return star;
    }

    public void setStar(BigDecimal star) {
        this.star = star;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}