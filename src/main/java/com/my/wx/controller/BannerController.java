package com.my.wx.controller;

import com.my.wx.entity.Banner;
import com.my.wx.service.BannerService;
import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * (Banner)表控制层
 *
 * @author makejava
 * @since 2019-12-12 22:20:54
 */
@RestController
@RequestMapping("banner")
public class BannerController {
    /**
     * 服务对象
     */
    @Resource
    private BannerService bannerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Banner selectOne(Integer id) {
        return this.bannerService.queryById(id);
    }
    /**
     * 后台上传（暂不使用）
     * @param file
     * @param remark
     * @return
     */
    @PostMapping("upload")
    public String upload(MultipartFile file,String remark) {
        return this.bannerService.upload(file,remark);
    }
    /**
     * 获取七牛云上传的token
     */
    public Map<String, Object> QiniuUpToken(@RequestParam String suffix) throws Exception{
        return this.bannerService.QiniuUpToken(suffix);
    }


}