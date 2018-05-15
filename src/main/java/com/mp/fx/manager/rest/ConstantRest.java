package com.mp.fx.manager.rest;

import com.mp.common.info.IData;
import com.mp.common.info.IDataList;
import com.mp.common.info.imp.Data;
import com.mp.fx.manager.constant.Constants;
import com.mp.fx.manager.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/constant")
public class ConstantRest {



    @RequestMapping("/userType")
    public IDataList getUserTypeList() throws Exception{
        return getList(Constants.USER_TYPE);
    }
    public IDataList getList(String fieldCode) throws Exception{
        IData param =new Data();
        param.put("fieldCode",fieldCode);
        return commonService.getConstantList(param);
    }
    @Autowired
    CommonService commonService;
}
