package com.my.wx.service.impl;

import com.my.wx.service.QiniuService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class QiniuServiceImpl implements QiniuService {
    @Override
    public String upload(MultipartFile file, String remark) {
        return null;
    }

    @Override
    public Map<String, Object> QiniuUpToken(String suffix) {
        return null;
    }
}
