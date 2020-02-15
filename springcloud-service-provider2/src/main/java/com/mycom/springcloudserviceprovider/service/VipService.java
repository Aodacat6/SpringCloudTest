package com.mycom.springcloudserviceprovider.service;

import com.mycom.springcloudserviceprovider.entity.VipInfo;

import java.util.Map;

public interface VipService {
    VipInfo queryById(int id);
    int insertVip(Map<String, Object> paras);
}
