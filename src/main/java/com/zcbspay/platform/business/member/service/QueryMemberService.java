package com.zcbspay.platform.business.member.service;

import com.zcbspay.platform.business.member.bean.MemberBean;
import com.zcbspay.platform.business.exception.BusinessMemberException;

public interface QueryMemberService {
	/**
	 * 会员信息查询
	 * @param loginName 登录名
	 * @param coopInstiCode 合作机构代码
	 * @return
	 */
	public MemberBean queryMember(String loginName,String coopInstiCode)throws BusinessMemberException;
	
	/**
	 * 查询会员信息（个人会员）
	 * @param memberId
	 * @return
	 * @throws CommonException
	 */
	public MemberBean queryPersonMember(String memberId)throws BusinessMemberException;
}
