package com.my.wx.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("qiniu")
public class QiniuController {
    /**
     * 后台上传（暂不使用）
     * @param file
     * @param remark
     * @return
     */
    @PostMapping("upload")
    public String upload(MultipartFile file, String remark) {
        return this..upload(file,remark);
    }
    /**
     * 获取七牛云上传的token
     */
    public Map<String, Object> QiniuUpToken(@RequestParam String suffix) throws Exception{
        return this.bannerService.QiniuUpToken(suffix);
    }
}
