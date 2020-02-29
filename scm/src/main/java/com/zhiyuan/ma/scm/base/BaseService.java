package com.zhiyuan.ma.scm.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyuan.ma.scm.utils.ObjectResponseSingleton;
import com.zhiyuan.ma.scm.utils.SetInfoFields;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract  class BaseService<M extends CommonMapper<T>,T> {
    @Autowired
    protected M mapper;

    protected T t;
    public void setMapper(M mapper) {
        this.mapper = mapper;
    }
    public List<T> selectByExample(Example example){
        return mapper.selectByExample(example);
    }
    public void insertSelective(T entity) {
        SetInfoFields.setCreateFiled(entity);
        mapper.insertSelective(entity);
    }
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }
    public List<T> selectList(T entity) {
        return mapper.select(entity);
    }
    public T selectById(Object id){
        return mapper.selectByPrimaryKey(id);
    }
    public void delete(T entity){
        mapper.delete(entity);
    }
    public void deleteById(Object id) {
        mapper.deleteByPrimaryKey(id);
    }
    public int updateById(T entity){
        SetInfoFields.setUpdFiled(entity);
        return mapper.updateByPrimaryKey(entity);

    }
    public int updateByIdSelective(T entity){
        return mapper.updateByPrimaryKeySelective(entity);
    }
    public int selectCount(T entity) {
        return mapper.selectCount(entity);
    }
    public List<T> selectAll(){
        return mapper.selectAll();
    }
    public TableResultResponse<T> selectByPageQuery(PageQuery<T> pageQuery){
        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
        Class<T> clazz = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        PageExample example = new PageExample(clazz,pageQuery.getData());
        Page<T> result = PageHelper.startPage(pageQuery.getPage(), pageQuery.getLimit());
        List<T> list = this.selectByExample(example);
        PageInfo<T> pageInfo = new PageInfo<>(list);
        return new TableResultResponse<>(pageInfo.getTotal(), list);
    }
}
