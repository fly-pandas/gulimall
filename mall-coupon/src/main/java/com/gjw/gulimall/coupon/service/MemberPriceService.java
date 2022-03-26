package com.gjw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjw.common.utils.PageUtils;
import com.gjw.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:33:22
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

