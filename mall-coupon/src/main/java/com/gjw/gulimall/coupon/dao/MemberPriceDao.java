package com.gjw.gulimall.coupon.dao;

import com.gjw.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:33:22
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
