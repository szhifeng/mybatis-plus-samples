package com.baomidou.mybatisplus.samples.generator.evaluation.service.impl;

import com.baomidou.mybatisplus.samples.generator.evaluation.entity.User;
import com.baomidou.mybatisplus.samples.generator.evaluation.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.generator.evaluation.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author szf
 * @since 2020-12-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
