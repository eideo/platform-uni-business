package com.zcbspay.platform.business.memberCard.service;

import com.zcbspay.platform.business.memberCard.bean.CardBinResultBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCardBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCardResultBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCashBankResultBean;
import com.zcbspay.platform.business.memberCard.bean.QuerySupporedCardBean;
import com.zcbspay.platform.business.memberCard.bean.QuerySupportedCardResultBean;
import com.zcbspay.platform.business.commons.bean.PageVo;
import com.zcbspay.platform.business.exception.BusinessCardException;

/***
 * 查询卡相关
 * @author liusm
 *
 */
public interface QueryCardService {
	/****
	 * 根据卡号查询卡BIN信息
	 * @param cardNo
	 * @return
	 */
    public CardBinResultBean queryCardBin(String cardNo) throws BusinessCardException;
    /***
     * 查询支持的银行卡
     * @param query
     * @param page
     * @param pageSize
     * @return
     */
    public PageVo<QuerySupportedCardResultBean> querySupportedCardList(QuerySupporedCardBean query,int page,int pageSize)throws BusinessCardException;
    /****
     * 查询已绑卡列表
     * @param query
     * @param page
     * @param pageSize
     * @return
     */
    public PageVo<QueryCardResultBean> queryBindCardList(QueryCardBean query,int page,int pageSize)throws BusinessCardException;
    /***
     * 根据卡号查询ICON
     * @param bankCode
     * @return
     */
    public QueryCashBankResultBean getBankIcon(String bankCode) throws BusinessCardException;
}
