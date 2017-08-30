package com.oa.dao;

import com.oa.model.Model;
import com.oa.model.Page;

import java.util.List;

public interface ModelMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);

    int selectCount();

    List<Model> selectPageSplit(Page page);

    int selectId();

}