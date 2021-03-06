package com.dqsy.sparkproject.dao;

import com.dqsy.sparkproject.domain.SessionAggrStat;

/**
 * session聚合统计模块DAO接口
 *
 * @author liusinan
 */
public interface ISessionAggrStatDAO {

    /**
     * 插入session聚合统计结果
     *
     * @param sessionAggrStat
     */
    void insert(SessionAggrStat sessionAggrStat);

}
