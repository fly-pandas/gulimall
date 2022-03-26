package com.gjw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjw.common.utils.PageUtils;
import com.gjw.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:33:22
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

