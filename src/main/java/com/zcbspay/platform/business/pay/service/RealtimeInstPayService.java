package com.zcbspay.platform.business.pay.service;

import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.pay.bean.RealTimeInstPayBean;

public interface RealtimeInstPayService {
	/****
	 * 单笔支付(无短信验证、无支付密码)
	 * @param bean
	 * @return
	 */
     public ResultBean pay (RealTimeInstPayBean bean);
}
