package com.zhiyuan.ma.scm.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

public class TableResultResponse<T> extends BaseResponse {
    protected TableData data;
    public TableResultResponse(long total,List<T> rows){
        this.data = new TableData(total,rows);
    }
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
    class TableData implements Serializable {
        long total;
        List<T> rows;
        public TableData(long total,List<T> rows){
            this.total =  total;
            this.rows = rows;
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }

    public TableData getData() {
        return data;
    }

    public void setData(TableData data) {
        this.data = data;
    }
}
