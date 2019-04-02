package com.nacos.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : WangRui
 * Time : 2019-04-02 12:04
 * Description:
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value(value = "${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

}
