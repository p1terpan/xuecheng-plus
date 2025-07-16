package com.xuecheng.base.model;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data

public class PageResult<T> implements Serializable{
        private List<T> items;
        private long counts;
        private long page;
        private long pageSize;

        public PageResult(List<T> items, long counts, long page, long pageSize){
            this.items = items;
            this.counts = counts;
            this.page = page;
            this.pageSize = pageSize;
        }
    }
