package com.zhazhapan.efo.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhazhapan.efo.annotation.AuthInterceptor;
import com.zhazhapan.efo.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pantao
 * @date 2018/1/29
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileServiceImpl fileService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    JSONObject jsonObject;

    @AuthInterceptor
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload() {
        jsonObject.put("status", "success");
        return jsonObject.toString();
    }
}