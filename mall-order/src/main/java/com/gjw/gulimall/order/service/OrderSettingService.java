package com.gjw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjw.common.utils.PageUtils;
import com.gjw.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 21:00:57
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

