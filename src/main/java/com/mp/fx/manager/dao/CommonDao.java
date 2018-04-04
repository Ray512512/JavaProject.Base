package com.mp.fx.manager.dao;

import com.mp.common.dao.BaseDao;
import com.mp.common.info.IData;
import com.mp.common.info.IDataList;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao extends BaseDao{
    /**
     * 获取常量列表
     * @param param
     * @return
     * @throws Exception
     */
    public IDataList getConstantList(IData param) throws Exception{
        String sql="select code_value value,code_name name from fx_constant where field_code=:fieldCode and enabled='1' order by sort ";
        return queryForIDataList(sql,param);
    }
}
