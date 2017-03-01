package com.mockuai.virtualwealthcenter.core.dao.impl;

import com.mockuai.virtualwealthcenter.core.domain.UsedLogDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UsedLogDODAOImpl extends SqlMapClientDaoSupport implements UsedLogDODAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public UsedLogDODAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public int deleteByPrimaryKey(Long id) {
        UsedLogDO _key = new UsedLogDO();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("used_log.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public void insert(UsedLogDO record) {
        getSqlMapClientTemplate().insert("used_log.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public void insertSelective(UsedLogDO record) {
        getSqlMapClientTemplate().insert("used_log.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public UsedLogDO selectByPrimaryKey(Long id) {
        UsedLogDO _key = new UsedLogDO();
        _key.setId(id);
        UsedLogDO record = (UsedLogDO) getSqlMapClientTemplate().queryForObject("used_log.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public int updateByPrimaryKeySelective(UsedLogDO record) {
        int rows = getSqlMapClientTemplate().update("used_log.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    public int updateByPrimaryKey(UsedLogDO record) {
        int rows = getSqlMapClientTemplate().update("used_log.updateByPrimaryKey", record);
        return rows;
    }
}