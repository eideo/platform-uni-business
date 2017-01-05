package com.zcbspay.platform.business.enterprise.service;

import com.zcbspay.platform.business.enterprise.bean.EnterpriseBean;
import com.zcbspay.platform.business.exception.BusinessEnterpriseException;

/***
 * 查询企业相关
 * @author SunXiaoshi
 *
 */
public interface QueryEnterpriseService {
	/**
	 * 查询企业信息
	 * @param memberId
	 * @return
	 */
	public EnterpriseBean queryEnterpriseByMemberId(String memberId)throws BusinessEnterpriseException;
}
