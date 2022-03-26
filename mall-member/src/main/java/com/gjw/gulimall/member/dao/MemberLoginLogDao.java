package com.gjw.gulimall.member.dao;

import com.gjw.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:50:28
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
