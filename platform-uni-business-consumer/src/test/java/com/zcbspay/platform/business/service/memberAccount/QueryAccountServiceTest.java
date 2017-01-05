package com.zcbspay.platform.business.service.memberAccount;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.commons.bean.PageVo;
import com.zcbspay.platform.business.exception.BusinessAccountException;
import com.zcbspay.platform.business.memberAccount.bean.MemInAndExDetailBean;
import com.zcbspay.platform.business.memberAccount.bean.MemberAccountBean;
import com.zcbspay.platform.business.memberAccount.service.QueryAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class QueryAccountServiceTest {
	@Autowired
	private QueryAccountService queryAccountService;
	@Test
	public void queryMemberFuns(){
		try {
			MemberAccountBean bean =this.queryAccountService.queryMemberFuns("100000000001003");
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryAccInAndExDetail(){
		try {
			 PageVo<MemInAndExDetailBean> bean =this.queryAccountService.queryAccInAndExDetail("100000000001003", 0, Integer.MAX_VALUE);
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
