package com.mp.fx.manager;

import com.mp.common.info.IDataList;
import com.mp.fx.manager.constant.RoleTypeEnum;
import org.junit.Test;

public class TestA {
    @Test
    public void test1(){
        IDataList list=RoleTypeEnum.getList();
        System.out.println(list.toString());
    }
}
