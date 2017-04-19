package com.loacg.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "content")
public class Content extends Entity {
    @Id
    @Column(name = "thread_id")
    private Long threadId;

    @Column(name = "site_id")
    private Integer siteId;

    @Column(name = "thread_key")
    private String threadKey;

    @Column(name = "thread_title")
    private String threadTitle;

    @Column(name = "thread_url")
    private String threadUrl;

    private Date created;

    /**
     * 1 正常 ， -1 删除
     */
    private Boolean status;

    @Column(name = "comment_count")
    private Integer commentCount;

    /**
     * 是否允许评论 0 允许，1 不允许但显示之前的留言，2 不允许且不显示之前的留言 。 默认 0
     */
    @Column(name = "comment_allow")
    private Boolean commentAllow;

    /**
     * @return thread_id
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return site_id
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * @return thread_key
     */
    public String getThreadKey() {
        return threadKey;
    }

    /**
     * @param threadKey
     */
    public void setThreadKey(String threadKey) {
        this.threadKey = threadKey == null ? null : threadKey.trim();
    }

    /**
     * @return thread_title
     */
    public String getThreadTitle() {
        return threadTitle;
    }

    /**
     * @param threadTitle
     */
    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle == null ? null : threadTitle.trim();
    }

    /**
     * @return thread_url
     */
    public String getThreadUrl() {
        return threadUrl;
    }

    /**
     * @param threadUrl
     */
    public void setThreadUrl(String threadUrl) {
        this.threadUrl = threadUrl == null ? null : threadUrl.trim();
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取1 正常 ， -1 删除
     *
     * @return status - 1 正常 ， -1 删除
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置1 正常 ， -1 删除
     *
     * @param status 1 正常 ， -1 删除
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return comment_count
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取是否允许评论 0 允许，1 不允许但显示之前的留言，2 不允许且不显示之前的留言 。 默认 0
     *
     * @return comment_allow - 是否允许评论 0 允许，1 不允许但显示之前的留言，2 不允许且不显示之前的留言 。 默认 0
     */
    public Boolean getCommentAllow() {
        return commentAllow;
    }

    /**
     * 设置是否允许评论 0 允许，1 不允许但显示之前的留言，2 不允许且不显示之前的留言 。 默认 0
     *
     * @param commentAllow 是否允许评论 0 允许，1 不允许但显示之前的留言，2 不允许且不显示之前的留言 。 默认 0
     */
    public void setCommentAllow(Boolean commentAllow) {
        this.commentAllow = commentAllow;
    }
}