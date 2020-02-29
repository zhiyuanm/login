package com.zhiyuan.ma.scm.service;

import com.zhiyuan.ma.scm.base.BaseService;
import com.zhiyuan.ma.scm.bean.dict.DictValue;
import com.zhiyuan.ma.scm.mapper.DictValueMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictValueService extends BaseService<DictValueMapper, DictValue> {

    public List<DictValue> dictValueByDictTypeId(String dictTypeId) {
        DictValue dictValue = new DictValue();
        dictValue.setDictTypeId(dictTypeId);
        return this.selectList(dictValue);
    }

    public DictValue dictValueByCode(String dictValueCode) {
        DictValue dictValue = new DictValue();
        dictValue.setDictValueCode(dictValueCode);
        List<DictValue> dictValues = this.selectList(dictValue);
        return dictValues.size()>0?dictValues.get(0):null;
    }
}
