package com.smart.service;

import com.smart.dao.DomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomeService {
    @Autowired
    private DomeMapper domeMapper;
    public List index(){
        return domeMapper.selectAll();
    }
}
