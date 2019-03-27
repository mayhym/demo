package com.example.demo.service.intf;

import com.example.demo.dto.CommonDto;
import com.example.demo.query.CommonQuery;

import java.util.List;

/**
 * @author Created by yixuan on 2019/3/27.
 */
public interface CommonService {

    /**
     *
     * @return
     */
    List<CommonDto> query(CommonQuery commonQuery);

    /**
     *
     * @param id
     * @return
     */
    CommonDto getInfoById(String id);
}
