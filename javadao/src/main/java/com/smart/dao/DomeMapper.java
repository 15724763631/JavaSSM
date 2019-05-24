package com.smart.dao;

import com.smart.pojo.Dome;

import java.util.List;

public interface DomeMapper {
    List<Dome> selectAll();
    int insertdome(Dome dome);
}
