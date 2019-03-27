package com.example.demo.service.impl;

import com.example.demo.dto.CommonDto;
import com.example.demo.entity.CommonDo;
import com.example.demo.query.CommonQuery;
import com.example.demo.service.intf.CommonService;
import com.eyas.service.service.impl.EyasBaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Created by yixuan on 2019/3/27.
 */
@Service
public class CommonServiceImpl extends EyasBaseServiceImpl<CommonDto, CommonDo, CommonQuery> implements CommonService {

    public CommonDto getInfoByIdFromRedis(String id){
        // 从redis获取数据
        CommonDto commonDto = this.getInfoById(id);
        return null;
    }
}
