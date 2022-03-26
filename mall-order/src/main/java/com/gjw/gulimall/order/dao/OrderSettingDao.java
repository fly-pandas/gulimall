package com.gjw.gulimall.order.dao;

import com.gjw.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 21:00:57
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
