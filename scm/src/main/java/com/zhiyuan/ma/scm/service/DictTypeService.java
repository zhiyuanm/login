package com.zhiyuan.ma.scm.service;

import com.zhiyuan.ma.scm.base.BaseService;
import com.zhiyuan.ma.scm.bean.dict.DictType;
import com.zhiyuan.ma.scm.mapper.DictTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictTypeService extends BaseService<DictTypeMapper, DictType> {

    public List<DictType> dictTree() {
        return this.selectAll();
    }

    public DictType dictTypeByCode(String dictTypeCode) {
        DictType dictType = new DictType();
        dictType.setDictTypeCode(dictTypeCode);
        List<DictType> dictTypes = this.selectList(dictType);
        return dictTypes.size() > 0?dictTypes.get(0): null;
    }
}
