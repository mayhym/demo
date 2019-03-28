package com.example.demo.controller;

import com.example.demo.dto.CommonDto;
import com.example.demo.query.CommonQuery;
import com.example.demo.service.intf.CommonService;
import com.eyas.parent.dto.EyasResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Created by yixuan on 2019/3/27.
 */

@RestController
@Slf4j
public class CommonController {

    @Autowired
    private CommonService commonService;

    @RequestMapping("/query")
    @ResponseBody
    EyasResult query(CommonQuery commonQuery) {
        List<CommonDto> commonDtoList = this.commonService.query(commonQuery);
        log.info("commonDtoList" + commonDtoList);
        return EyasResult.ok(commonDtoList);
    }

    @RequestMapping("/getInfoById/{id}")
    @ResponseBody
    EyasResult getInfoById(@PathVariable String id) {
        CommonDto commonDto = this.commonService.getInfoById(id);
        return EyasResult.ok(commonDto);
    }
}
