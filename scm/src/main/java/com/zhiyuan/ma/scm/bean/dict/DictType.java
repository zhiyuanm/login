package com.zhiyuan.ma.scm.bean.dict;

import com.zhiyuan.ma.scm.base.BaseBean;
import com.zhiyuan.ma.scm.conf.UUIdGenId;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "dict_type")
public class DictType extends BaseBean implements Serializable {
    @Id
    @KeySql(genId = UUIdGenId.class)
    @Column(name = "dict_type_id")
    private String dictTypeId;
    @Column(name = "dict_type_code")
    private String dictTypeCode;
    @Column(name = "dict_type_name")
    private String dictTypeName;
    @Column(name = "parent_id")
    private String parentId;
    @Transient
    private List<DictType> childrenList = new ArrayList<>();
    @Transient
    private List<DictValue> dictTypeValueList;
}
