package com.gjw.gulimall.order.dao;

import com.gjw.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 21:00:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
