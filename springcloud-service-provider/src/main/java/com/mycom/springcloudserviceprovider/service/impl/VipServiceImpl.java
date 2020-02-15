package com.mycom.springcloudserviceprovider.service.impl;


import com.mycom.springcloudserviceprovider.entity.VipInfo;
import com.mycom.springcloudserviceprovider.mapper.VipInfoMapper;
import com.mycom.springcloudserviceprovider.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;

/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-11 下午 04:28
 * @description：ceshilei
 * @modified By：
 * @version: 1.0$
 */
@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipInfoMapper vipInfoMapper;
    @Override
    public VipInfo queryById(int id) {
        return vipInfoMapper.queryById(id);
    }

    @Override
    public int insertVip(Map<String,Object> params) {
        String name = params.getOrDefault("name","").toString();
        String sex = params.getOrDefault("sex","").toString();

        VipInfo vipInfo = new VipInfo();
        vipInfo.setName(name);
        vipInfo.setSex(sex);
        return vipInfoMapper.insertVip(vipInfo);
    }
}
