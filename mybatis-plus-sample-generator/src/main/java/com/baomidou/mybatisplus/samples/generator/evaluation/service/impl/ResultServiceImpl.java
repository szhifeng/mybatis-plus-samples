package com.baomidou.mybatisplus.samples.generator.evaluation.service.impl;

import com.baomidou.mybatisplus.samples.generator.evaluation.entity.Result;
import com.baomidou.mybatisplus.samples.generator.evaluation.mapper.ResultMapper;
import com.baomidou.mybatisplus.samples.generator.evaluation.service.IResultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 班子或干部测评结果 服务实现类
 * </p>
 *
 * @author szf
 * @since 2020-12-18
 */
@Service
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements IResultService {

}
