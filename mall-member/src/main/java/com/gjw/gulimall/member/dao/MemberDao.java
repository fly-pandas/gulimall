package com.gjw.gulimall.member.dao;

import com.gjw.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author guojiwei
 * @email guojiwei00@gmail.com
 * @date 2022-03-25 20:50:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
