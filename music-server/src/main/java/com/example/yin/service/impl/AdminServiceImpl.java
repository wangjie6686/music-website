package com.example.yin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yin.dao.AdminDao;
import com.example.yin.entity.Admin;
import com.example.yin.entity.Consumer;
import com.example.yin.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminDao,Admin> implements  AdminService {


}
