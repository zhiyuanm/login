package com.zhiyuan.ma.scm.bean.dict;

import com.zhiyuan.ma.scm.base.BaseBean;
import com.zhiyuan.ma.scm.conf.UUIdGenId;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "dict_value")
public class DictValue extends BaseBean implements Serializable {
    @Id
    @KeySql(genId = UUIdGenId.class)
    @Column(name = "dict_value_id")
    private String dictValueId;
    @Column(name="dict_type_id")
    private String dictTypeId;
    @Column(name = "dict_value_code")
    private String dictValueCode;
    @Column(name = "dict_value_name")
    private String dictValueName;
    @Column(name="value")
    private Integer value;
    @Column(name = "dict_value_sort")
    private String dictValueSort;
}
