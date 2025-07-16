package com.xuecheng.base.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageParams {

    private Long pageNo = 1L;
    private Long pageSize = 10L;

    public PageParams() {
    }

    public PageParams(long pageNo, long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
