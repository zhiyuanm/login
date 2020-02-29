package com.zhiyuan.ma.scm.base;

import java.util.LinkedHashMap;
import java.util.Map;

public class Query extends LinkedHashMap<String,Object> {
    private int page = 1;
    private int limit = 10;
    public Query(Map<String,Object> params) {
        this.putAll(params);
        if(params.get("page") != null) {
            this.page = Integer.parseInt(params.get("page").toString());
        }
        if(params.get("limit") != null) {
            this.limit = Integer.parseInt(params.get("limit").toString());
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
