package com.zcbspay.platform.business.insteadPay.service;

import com.zcbspay.platform.business.exception.BusinessInsteadPayException;
import com.zcbspay.platform.business.insteadPay.bean.InsteadPayQuery_Request;
import com.zcbspay.platform.business.insteadPay.bean.InsteadPayQuery_Response;
/***
 * 批量代付查询
 * @author liusm
 *
 */
public interface QueryInsteadPayService {
	
	/***
	 * 批量代付查询
	 * @param requestBean
	 * @return
	 * @throws BusinessInsteadPayException
	 */
	InsteadPayQuery_Response  batchInsteadPayQuery(InsteadPayQuery_Request requestBean) throws BusinessInsteadPayException ;
}
