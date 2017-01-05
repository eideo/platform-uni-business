package com.zcbspay.platform.business.commons.dao;

import org.hibernate.Session;

import com.zcbspay.platform.business.pojo.PojoTxncodeDef;

public interface TxncodeDefDAO extends BaseDAO<PojoTxncodeDef>{
	/***
	 * 获得session
	 * @return
	 */
	public Session getSession();
	/***
	 * 获得业务代码
	 * @param txntype
	 * @param txnsubtype
	 * @param biztype
	 * @return
	 */
	public PojoTxncodeDef getBusiCode(String txntype,String txnsubtype,String biztype);
	
}
