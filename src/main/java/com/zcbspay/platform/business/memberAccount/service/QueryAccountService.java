package com.zcbspay.platform.business.memberAccount.service;

import com.zcbspay.platform.business.memberAccount.bean.MemInAndExDetailBean;
import com.zcbspay.platform.business.memberAccount.bean.MemberAccountBean;
import com.zcbspay.platform.business.commons.bean.PageVo;
import com.zcbspay.platform.business.exception.BusinessAccountException;

public interface QueryAccountService {
  /***
   * 查询会员基本账户余额
   * @param memberId
   * @return
   * @throws CommonException
   */
   public MemberAccountBean queryMemberFuns(String memberId)
            throws BusinessAccountException;
    /**
     * 查询账户明细
     * 
     * @param memberId
     * @param page
     * @param pageSize
     * @return
     * @throws AbstractTradeDescribeException
     * @throws IllegalAccessException
     */
    public PageVo<MemInAndExDetailBean> queryAccInAndExDetail(String memberId,int page,int pageSize) throws BusinessAccountException;
}
