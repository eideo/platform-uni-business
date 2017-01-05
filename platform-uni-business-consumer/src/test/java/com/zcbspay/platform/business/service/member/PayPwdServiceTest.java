package com.zcbspay.platform.business.service.member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.exception.BusinessMemberException;
import com.zcbspay.platform.business.member.bean.MemberBean;
import com.zcbspay.platform.business.member.service.LoginPwdService;
import com.zcbspay.platform.business.member.service.PayPwdService;
import com.zcbspay.platform.business.member.service.QueryMemberService;
import com.zcbspay.platform.business.sms.bean.SmsBean;
import com.zcbspay.platform.business.sms.service.SmsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class PayPwdServiceTest {
	@Autowired
	private PayPwdService payPwdService;
	@Autowired
	private SmsService smsService;
	@Test
	public void vaildatePwd(){
		try {
			ResultBean  bean =payPwdService.vaildatePayPwd("100000000001003", "123456");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void setPayPwd(){
		try {
			ResultBean  bean =payPwdService.modifyPayPwd("100000000001003", null, "123456");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void modifyPwd(){
		try {
			ResultBean  bean =payPwdService.modifyPayPwd("100000000001003", "123456", "123456");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void resetPwd(){
		try {
			ResultBean  bean =payPwdService.resetPayPwd("100000000000640", "123456", "123456");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void sendSms(){
		SmsBean bean= new SmsBean();
		bean.setMobile("18210457410");
		bean.setModuleType("1004");
		ResultBean  result =smsService.sendSmsCode(bean);
		System.out.println(JSON.toJSONString(result));
	}
	
	public void vaildateBankCardForResetPwd(){
		try {
			ResultBean  bean =payPwdService.vaildateBankCardForResetPwd("100000000000640", "18210457410", "123456", 124, "111");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
