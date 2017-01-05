package com.zcbspay.platform.business.service.pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.exception.BusinessOrderException;
import com.zcbspay.platform.business.exception.BusinessRealnameException;
import com.zcbspay.platform.business.exception.BusinessSmsException;
import com.zcbspay.platform.business.order.bean.OrderResultBean;
import com.zcbspay.platform.business.order.service.QueryOrderService;
import com.zcbspay.platform.business.pay.bean.AccountPayBean;
import com.zcbspay.platform.business.pay.bean.PayBean;
import com.zcbspay.platform.business.pay.service.AccountPayService;
import com.zcbspay.platform.business.pay.service.QuickPayService;
import com.zcbspay.platform.business.realname.bean.RealNameBean;
import com.zcbspay.platform.business.realname.service.RealnameService;
import com.zcbspay.platform.business.sms.service.SmsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class AccountpayServiceTest {
	
	@Autowired
	private AccountPayService  accountPayService;
	@Test
	public void payBySmsCode(){
	
	}
	
	@Test
	public void pay(){
		try {
			AccountPayBean account = new AccountPayBean();
			account.setMemberId("100000000001003");
			account.setTn("161122059700000656");
			account.setTxnAmt("1");
			ResultBean bean =this.accountPayService.pay(account);
			System.out.println(JSON.toJSONString(bean));
		}  catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
