package com.zcbspay.platform.business.merch.service;

import com.zcbspay.platform.business.exception.BusinessMerchException;
import com.zcbspay.platform.business.merch.bean.MerchWhiteBean;

public interface WhiteListService {
	/**
	 * 保存白名单信息
	 * @param merchWhiteList
	 * @return
	 */
	public boolean saveWhiteList(MerchWhiteBean merchWhiteList)  throws BusinessMerchException;
	
	/**
	 * 更新白名单
	 * @param merchWhiteList
	 * @return
	 */
	public boolean updateWhiteList(MerchWhiteBean merchWhiteList)  throws BusinessMerchException;
	
	/**
	 * 删除白名单
	 * @param id
	 * @return
	 */
	public boolean deleteWhiteList(Long id)  throws BusinessMerchException;
}
