package com.gjw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjw.common.utils.PageUtils;
import com.gjw.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:33:22
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

