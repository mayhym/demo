package com.example.demo.dao;

import com.example.demo.entity.CommonDo;
import com.example.demo.query.CommonQuery;
import com.eyas.service.dao.EyasBaseDao;
import org.springframework.stereotype.Repository;

/**
 * @author Created by yixuan on 2019/3/27.
 */
@Repository
public interface CommonDao extends EyasBaseDao<CommonDo, CommonQuery> {
}
