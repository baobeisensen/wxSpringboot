package com.my.wx.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface QiniuService {
    String upload(MultipartFile file, String remark);

    Map<String, Object> QiniuUpToken(String suffix);
}
