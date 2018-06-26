package com.cloud.demo.sys.organization.domain.event.impl;

import com.cloud.demo.common.domain.annotation.Event;
import com.cloud.demo.sys.organization.domain.dao.SysOrgDeptRepository;
import com.cloud.demo.sys.organization.domain.entity.SysOrgDept;
import com.cloud.demo.sys.organization.domain.event.ISysOrgDeptEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:50
 * @modified
 */
@Event
public class SysOrgDeptEventImpl extends SysOrgElementEventImpl<SysOrgDeptRepository, SysOrgDept>
        implements ISysOrgDeptEvent {

    @Autowired
    @Override
    public void setBaseRepository(SysOrgDeptRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
}
