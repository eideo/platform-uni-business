package com.zcbspay.platform.business.realname.service;

import com.zcbspay.platform.business.realname.bean.RealNameBean;
import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.exception.BusinessRealnameException;

/****
 * 实名认证相关
 * @author liusm
 *
 */
public interface RealnameService {
	/****
	 * 实名认证
	 * @param bean
	 * @return
	 */
	public ResultBean realname (RealNameBean bean)throws BusinessRealnameException ;
}
