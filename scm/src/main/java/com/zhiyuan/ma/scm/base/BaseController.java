package com.zhiyuan.ma.scm.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public class BaseController<Service extends BaseService,Entity> {
    @Autowired
    protected Service service;
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        System.out.println("开始绑定值------------------------");
    }

    @PostMapping(value = "")
    @ResponseBody
    protected ObjectResponse<Entity> add(Entity entity){
        ObjectResponse<Entity> objectResponse = new ObjectResponse();
        service.insertSelective(entity);
        objectResponse.setData(entity);
        return objectResponse;
    }
    @GetMapping(value = "/{id}")
    @ResponseBody
    protected ObjectResponse<Entity> get(@PathVariable Object id ) {
        ObjectResponse<Entity> objectResponse = new ObjectResponse();
        Object o = service.selectById(id);
        objectResponse.setData((Entity)o);
        return objectResponse;
    }
    @PutMapping
    @ResponseBody
    public ObjectResponse<Entity> update(@RequestBody Entity entity){
        service.updateByIdSelective(entity);
        return new ObjectResponse<Entity>().data(entity);
    }

    @DeleteMapping
    @ResponseBody
    public ObjectResponse delete(@RequestBody Entity entity){
        service.delete(entity);
        return new ObjectResponse<Entity>();
    }
    @PostMapping("/pageQuery")
    @ResponseBody
    public TableResultResponse<Entity> pageQuery(@RequestBody Map<String,Object> params){
        PageQuery<Entity> pageQuery = new PageQuery(params,params);
        return service.selectByPageQuery(pageQuery);
    }
}
