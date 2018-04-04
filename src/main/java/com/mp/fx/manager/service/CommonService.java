package com.mp.fx.manager.service;

import com.mp.common.info.IData;
import com.mp.common.info.IDataList;
import com.mp.fx.manager.dao.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    /**
     * 获取常量列表
     * @param param
     * @return
     * @throws Exception
     */
    public IDataList getConstantList(IData param) throws Exception{
        return commonDao.getConstantList(param);
    }
    @Autowired
    CommonDao commonDao;
}
