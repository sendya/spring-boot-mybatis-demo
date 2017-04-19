package com.loacg.service;

import com.github.pagehelper.PageHelper;
import com.loacg.entity.Site;
import com.loacg.mapper.SiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 16:18
 */
@Service
public class SiteService {

    private final SiteMapper siteMapper;

    @Autowired
    public SiteService(SiteMapper siteMapper) {
        this.siteMapper = siteMapper;
    }

    public List<Site> getAll(Site site) {
        if (site.getPage() != null && site.getRows() != null) {
            PageHelper.startPage(site.getPage(), site.getRows());
        }
        return siteMapper.selectAll();
    }

    public Site getById(Integer id) {
        return siteMapper.selectByPrimaryKey(id);
    }
}
