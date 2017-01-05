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
import com.zcbspay.platform.business.pay.bean.PayBean;
import com.zcbspay.platform.business.pay.service.QuickPayService;
import com.zcbspay.platform.business.realname.bean.RealNameBean;
import com.zcbspay.platform.business.realname.service.RealnameService;
import com.zcbspay.platform.business.sms.service.SmsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class QuickpayServiceTest {
	
	@Autowired
	private QuickPayService  quickPayService;
	@Test
	public void payBySmsCode(){
		try {
			PayBean pay= new PayBean();
			pay.setPhone("18210457410");
			pay.setCardNo("6217730706921466");
			pay.setCardType("1");
			pay.setCertNo("41072198001032452");
			pay.setCardKeeper("刘玉");
			pay.setTn("161118061500000595");
			pay.setTxnAmt("1");
			ResultBean bean =this.quickPayService.payBySmsCode(pay, "867147");
			System.out.println(JSON.toJSONString(bean));
		}  catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void pay(){
		try {
			PayBean pay= new PayBean();
			pay.setPhone("18210457410");
			pay.setCardNo("6217730706921466");
			pay.setCardType("1");
			pay.setCertNo("41072198001032452");
			pay.setCardKeeper("刘玉");
			pay.setTn("161125101400000679");
			pay.setTxnAmt("251");
			ResultBean bean =this.quickPayService.pay(pay);
			System.out.println(JSON.toJSONString(bean));
		}  catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void payByBindIdExt(){
		try {
			PayBean pay= new PayBean();
			pay.setTn("161118061500000597");
			pay.setBindId("219");
			pay.setTxnAmt("1");
			ResultBean bean =this.quickPayService.pay(pay, "100000000001003", "666962", "123456");
			System.out.println(JSON.toJSONString(bean));
		}  catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void payByBindId(){
		try {
			PayBean pay= new PayBean();
			pay.setTn("161122061500000654");
			pay.setBindId("221");
			pay.setTxnAmt("251");
			ResultBean bean =this.quickPayService.pay(pay);
			System.out.println(JSON.toJSONString(bean));
		}  catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}
