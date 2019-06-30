package com.itlanma.service.impl;

import com.itlanma.domain.Log;
import com.itlanma.mapper.AopMapper;
import com.itlanma.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张生祥
 * @date 2019/06/28 16:28
 */
@Service
public class AopServiceImpl implements AopService {
    @Autowired
    private AopMapper aopMapper;
    @Override
    public void insertLog(Log log) {
        aopMapper.insertLog(log);
    }
}
