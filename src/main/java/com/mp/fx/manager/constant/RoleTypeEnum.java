package com.mp.fx.manager.constant;

import com.mp.common.info.IData;
import com.mp.common.info.IDataList;
import com.mp.common.info.imp.Data;
import com.mp.common.info.imp.DataList;
public enum RoleTypeEnum {
    MANAGER(1,"管理角色"),BUSINESS(2,"业务角色");
    int value;
    String name;
    RoleTypeEnum(int value,String name){
        this.value=value;
        this.name=name;
    }
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
    public static IDataList getList(){
        IDataList list=new DataList();
        for(RoleTypeEnum c:values()){
            IData temp=new Data();
            temp.put("name",c.getName());
            temp.put("value",c.getValue());
            list.add(temp);
        }
        return list;
    }
}
