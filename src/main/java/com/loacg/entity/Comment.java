package com.loacg.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "comment")
public class Comment extends Entity {
    /**
     * 评论 id
     */
    @Id
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 站点 id
     */
    @Id
    @Column(name = "site_id")
    private Integer siteId;

    /**
     * 评论上级 id
     */
    @Column(name = "comment_parent_id")
    private Long commentParentId;

    /**
     * 评论文章 id
     */
    @Column(name = "comment_thread_id")
    private Long commentThreadId;

    /**
     * 评论文章 KEY
     */
    @Column(name = "comment_thread_key")
    private String commentThreadKey;

    @Column(name = "comment_author")
    private String commentAuthor;

    @Column(name = "comment_author_email")
    private String commentAuthorEmail;

    @Column(name = "comment_author_url")
    private String commentAuthorUrl;

    @Column(name = "comment_author_id")
    private String commentAuthorId;

    @Column(name = "comment_date")
    private Date commentDate;

    @Column(name = "comment_date_gmt")
    private Date commentDateGmt;

    private String status;

    private String type;

    @Column(name = "comment_content")
    private String commentContent;

    /**
     * 获取评论 id
     *
     * @return comment_id - 评论 id
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置评论 id
     *
     * @param commentId 评论 id
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取站点 id
     *
     * @return site_id - 站点 id
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 设置站点 id
     *
     * @param siteId 站点 id
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * 获取评论上级 id
     *
     * @return comment_parent_id - 评论上级 id
     */
    public Long getCommentParentId() {
        return commentParentId;
    }

    /**
     * 设置评论上级 id
     *
     * @param commentParentId 评论上级 id
     */
    public void setCommentParentId(Long commentParentId) {
        this.commentParentId = commentParentId;
    }

    /**
     * 获取评论文章 id
     *
     * @return comment_thread_id - 评论文章 id
     */
    public Long getCommentThreadId() {
        return commentThreadId;
    }

    /**
     * 设置评论文章 id
     *
     * @param commentThreadId 评论文章 id
     */
    public void setCommentThreadId(Long commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    /**
     * 获取评论文章 KEY
     *
     * @return comment_thread_key - 评论文章 KEY
     */
    public String getCommentThreadKey() {
        return commentThreadKey;
    }

    /**
     * 设置评论文章 KEY
     *
     * @param commentThreadKey 评论文章 KEY
     */
    public void setCommentThreadKey(String commentThreadKey) {
        this.commentThreadKey = commentThreadKey == null ? null : commentThreadKey.trim();
    }

    /**
     * @return comment_author
     */
    public String getCommentAuthor() {
        return commentAuthor;
    }

    /**
     * @param commentAuthor
     */
    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor == null ? null : commentAuthor.trim();
    }

    /**
     * @return comment_author_email
     */
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    /**
     * @param commentAuthorEmail
     */
    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail == null ? null : commentAuthorEmail.trim();
    }

    /**
     * @return comment_author_url
     */
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    /**
     * @param commentAuthorUrl
     */
    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl == null ? null : commentAuthorUrl.trim();
    }

    /**
     * @return comment_author_id
     */
    public String getCommentAuthorId() {
        return commentAuthorId;
    }

    /**
     * @param commentAuthorId
     */
    public void setCommentAuthorId(String commentAuthorId) {
        this.commentAuthorId = commentAuthorId == null ? null : commentAuthorId.trim();
    }

    /**
     * @return comment_date
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * @param commentDate
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * @return comment_date_gmt
     */
    public Date getCommentDateGmt() {
        return commentDateGmt;
    }

    /**
     * @param commentDateGmt
     */
    public void setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return comment_content
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * @param commentContent
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}