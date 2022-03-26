package com.gjw.gulimall.coupon.dao;

import com.gjw.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:33:22
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
