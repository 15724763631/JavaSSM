package cn.edu.zut.ssm.dao.mapper;

import cn.edu.zut.ssm.domain.Dome;

import java.util.List;

public interface DomeMapper {
    List<Dome> selectAll();
    int insertdome(Dome dome);
}
