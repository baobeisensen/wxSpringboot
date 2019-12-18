package com.my.wx.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * (Banner)实体类
 *
 * @author makejava
 * @since 2019-12-12 22:20:51
 */
@Data
public class Banner implements Serializable {
    private static final long serialVersionUID = -56135697985303607L;
    
    private Integer id;
    
    private String imgUrl;
    
    private String remark;

}