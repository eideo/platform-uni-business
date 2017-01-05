package com.zcbspay.platform.business.insteadPay.service;

import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.commons.enums.InsteadPayImportTypeEnum;
import com.zcbspay.platform.business.insteadPay.bean.InsteadPayInterfaceParamBean;
import com.zcbspay.platform.business.insteadPay.bean.InsteadPay_Request;
/***
 * 代付相关功能
 * @author liusm
 *
 */
public interface InsteadPayService {
	/***
	 * 批量代付
	 * @param request
	 * @param type
	 * @param param
	 * @return
	 */
	public ResultBean batchInsteadPay(InsteadPay_Request request,InsteadPayImportTypeEnum type,InsteadPayInterfaceParamBean param);
        
}
