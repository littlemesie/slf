package cn.mesie.service.impl;

import cn.mesie.mapper.AdminMapper;
import cn.mesie.pojo.Admin;
import cn.mesie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 2018/7/15 9:49 PM
 *
 * @author: mesie
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return this.adminMapper.findAll();
    }
}
