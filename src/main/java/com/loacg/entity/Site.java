package com.loacg.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "site")
public class Site extends Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "base_url")
    private String baseUrl;

    /**
     * 用户站点 API KEY （这个 KEY 能由用户重置）
     */
    @Column(name = "api_key")
    private String apiKey;

    @Column(name = "notify_url")
    private String notifyUrl;

    /**
     * 通知类型配置。 0 不通知，1 收到新留言时通知
     */
    @Column(name = "notify_type")
    private Boolean notifyType;

    private Date created;

    private Boolean status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return short_name
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * @return base_url
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * @param baseUrl
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? null : baseUrl.trim();
    }

    /**
     * 获取用户站点 API KEY （这个 KEY 能由用户重置）
     *
     * @return api_key - 用户站点 API KEY （这个 KEY 能由用户重置）
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * 设置用户站点 API KEY （这个 KEY 能由用户重置）
     *
     * @param apiKey 用户站点 API KEY （这个 KEY 能由用户重置）
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? null : apiKey.trim();
    }

    /**
     * @return notify_url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * @param notifyUrl
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * 获取通知类型配置。 0 不通知，1 收到新留言时通知
     *
     * @return notify_type - 通知类型配置。 0 不通知，1 收到新留言时通知
     */
    public Boolean getNotifyType() {
        return notifyType;
    }

    /**
     * 设置通知类型配置。 0 不通知，1 收到新留言时通知
     *
     * @param notifyType 通知类型配置。 0 不通知，1 收到新留言时通知
     */
    public void setNotifyType(Boolean notifyType) {
        this.notifyType = notifyType;
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
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}