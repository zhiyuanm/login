package com.zhiyuan.ma.scm.controller.dictController;

import com.zhiyuan.ma.scm.base.BaseController;
import com.zhiyuan.ma.scm.base.ObjectResponse;
import com.zhiyuan.ma.scm.bean.dict.DictType;
import com.zhiyuan.ma.scm.service.DictTypeService;
import com.zhiyuan.ma.scm.utils.ObjectResponseSingleton;
import com.zhiyuan.ma.scm.utils.TreeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/dictType")
public class DictTypeController extends BaseController<DictTypeService, DictType> {

    @Autowired
    private DictTypeService dictTypeService;

    @RequestMapping(value="/dictTree")
    @ResponseBody
    public ObjectResponse dictTypeTree(){
        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
        try{
            List<DictType> list = dictTypeService.dictTree();
            List<DictType> dictTypes = new TreeUtils(list).buildTree();
            objectResponse.setData(dictTypes);
        }catch (Exception e) {
            objectResponse.setSuccess(false);
            e.printStackTrace();
        }
        return objectResponse;
    }
    @RequestMapping("/dictTypeByCode/{dictTypeCode}")
    @ResponseBody
    public ObjectResponse dictTypeByCode(@PathVariable("dictTypeCode") String dictTypeCode){
        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
        try{
            DictType dictType = dictTypeService.dictTypeByCode(dictTypeCode);
            objectResponse.setData(dictType);
        }catch(Exception e) {
            objectResponse.setSuccess(false);
            e.printStackTrace();
        }
        return objectResponse;
    }
}
