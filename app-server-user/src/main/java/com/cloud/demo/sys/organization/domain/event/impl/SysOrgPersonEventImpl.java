package com.cloud.demo.sys.organization.domain.event.impl;

import com.cloud.demo.common.domain.annotation.Event;
import com.cloud.demo.sys.organization.domain.dao.SysOrgPersonRepository;
import com.cloud.demo.sys.organization.domain.entity.SysOrgPerson;
import com.cloud.demo.sys.organization.domain.event.ISysOrgPersonEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:31
 * @modified
 */
@Event
public class SysOrgPersonEventImpl extends SysOrgElementEventImpl<SysOrgPersonRepository, SysOrgPerson>
        implements ISysOrgPersonEvent {

    @Override
    public SysOrgPerson findByLoginName(String fdLoginName) {
        return this.baseRepository.findByFdLoginName(fdLoginName);
    }

    @Autowired
    @Override
    public void setBaseRepository(SysOrgPersonRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
}
