package com.mycom.springcloudserviceprovider.mapper;

import com.mycom.springcloudserviceprovider.entity.VipInfo;

import java.util.List;

public interface VipInfoMapper {
    int insertVip(VipInfo vipInfo);
    VipInfo queryById(int id);
    int updateById(int id);
    List<VipInfo> getAllVip();
}
