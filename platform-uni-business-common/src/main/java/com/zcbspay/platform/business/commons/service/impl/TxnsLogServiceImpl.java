package com.zcbspay.platform.business.commons.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.business.commons.dao.TxncodeDefDAO;
import com.zcbspay.platform.business.commons.service.TxnsLogService;
import com.zcbspay.platform.business.commons.service.base.BaseServiceImpl;
import com.zcbspay.platform.business.pojo.TxnsLogModel;
@Service("txnsLogService")
public class TxnsLogServiceImpl extends BaseServiceImpl<TxnsLogModel, String> implements TxnsLogService {
	@Autowired
	private TxncodeDefDAO txncodeDefDAO;
	@Override
	public Session getSession() {
		return this.txncodeDefDAO.getSession();
	}

}
