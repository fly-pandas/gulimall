package com.gjw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjw.common.utils.PageUtils;
import com.gjw.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 21:00:57
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

