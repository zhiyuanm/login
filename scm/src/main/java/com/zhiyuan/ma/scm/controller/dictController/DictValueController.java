package com.zhiyuan.ma.scm.controller.dictController;

import com.zhiyuan.ma.scm.base.BaseController;
import com.zhiyuan.ma.scm.base.ObjectResponse;
import com.zhiyuan.ma.scm.bean.dict.DictValue;
import com.zhiyuan.ma.scm.service.DictValueService;
import com.zhiyuan.ma.scm.utils.ObjectResponseSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(name = "/dictValue")
public class DictValueController extends BaseController<DictValueService, DictValue> {
    @Autowired
    private DictValueService dictValueService;
    @ResponseBody
    @RequestMapping("/{dictTypeId}")
    public ObjectResponse dictValueByDictTypeId(@PathVariable(value = "dictTypeId") String dictTypeId){
        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
        try{
            List<DictValue> list = dictValueService.dictValueByDictTypeId(dictTypeId);
            objectResponse.setData(list);
        }catch(Exception e) {
            e.printStackTrace();
            objectResponse.setSuccess(false);
        }
        return objectResponse;
    }
    @RequestMapping("/dictValueByCode/{dictValueCode}")
    @ResponseBody
    public ObjectResponse dictValueByCode(@PathVariable("dictValueCode") String dictValueCode){
        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
        try{
            DictValue dictValue = dictValueService.dictValueByCode(dictValueCode);
            objectResponse.setData(dictValue);
        }catch(Exception e) {
            objectResponse.setSuccess(false);
            e.printStackTrace();
        }
        return objectResponse;
    }
}
