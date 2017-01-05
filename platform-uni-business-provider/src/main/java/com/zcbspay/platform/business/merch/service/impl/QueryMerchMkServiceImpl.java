package com.zcbspay.platform.business.merch.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.business.exception.BusinessMerchException;
import com.zcbspay.platform.business.merch.bean.MerchMkBean;
import com.zcbspay.platform.business.merch.service.QueryMerchMkService;
import com.zlebank.zplatform.member.commons.utils.BeanCopyUtil;
import com.zlebank.zplatform.member.merchant.bean.MerchMK;
import com.zlebank.zplatform.member.merchant.service.MerchMKService;

@Service("busQueryMerchMkService")
public class QueryMerchMkServiceImpl implements QueryMerchMkService {
	@Autowired
	private MerchMKService merchMkService;

	@Override
	public MerchMkBean queryMerchMkByMemberId(String memberId)
			throws BusinessMerchException {
		if (StringUtils.isEmpty(memberId)) {
			throw new BusinessMerchException("BT0000");
		}
		MerchMK merchMk = this.merchMkService.get(memberId);
		if (merchMk == null)
			return null;
		MerchMkBean result = BeanCopyUtil.copyBean(MerchMkBean.class, merchMk);
		return result;
	}

	@Override
	public MerchMkBean getByMerchType(String memberId, String merchType)
			throws BusinessMerchException {
		if (StringUtils.isEmpty(memberId) || StringUtils.isEmpty(merchType)) {
			throw new BusinessMerchException("BT0000");
		}
		MerchMK merchMk;

		merchMk = this.merchMkService.get(memberId);
		if (merchMk == null){
			return null;
		}
		MerchMkBean result = BeanCopyUtil.copyBean(MerchMkBean.class, merchMk);
		return result;

	}

}
