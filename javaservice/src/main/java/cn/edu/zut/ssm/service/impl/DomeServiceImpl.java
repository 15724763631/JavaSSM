package cn.edu.zut.ssm.service.impl;

import cn.edu.zut.ssm.dao.mapper.DomeMapper;
import cn.edu.zut.ssm.service.DomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DomeServiceImpl implements DomeService {
    @Resource
    private DomeMapper domeMapper;

    @Override
    public List index(){
        return domeMapper.selectAll();
    }
}
