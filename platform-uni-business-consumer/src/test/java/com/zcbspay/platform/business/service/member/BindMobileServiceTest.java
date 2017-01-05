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
import com.zcbspay.platform.business.member.service.BindMobileService;
import com.zcbspay.platform.business.member.service.QueryMemberService;
import com.zcbspay.platform.business.sms.bean.SmsBean;
import com.zcbspay.platform.business.sms.service.SmsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class BindMobileServiceTest {
	@Autowired
	private BindMobileService bindMobileService;
	@Autowired
	private SmsService smsService;
	@Test
	public void sendSms(){
		SmsBean bean= new SmsBean();
		bean.setMobile("18210457413");
		bean.setModuleType("1012");
		ResultBean  result =smsService.sendSmsCode(bean);
		System.out.println(JSON.toJSONString(result));
	}
	@Test
	public void vaildateUnbindPhone(){
		try {
			ResultBean bean=this.bindMobileService.vaildateUnbindPhone("100000000001003","18210457413", "123456", "384786");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void sendSmsBind(){
		SmsBean bean= new SmsBean();
		bean.setMobile("18210457413");
		bean.setModuleType("1007");
		ResultBean  result =smsService.sendSmsCode(bean);
		System.out.println(JSON.toJSONString(result));
	}
	@Test
	public void modifyPhone(){
		try {
			ResultBean bean=this.bindMobileService.modifyPhone("100000000001003", "18210457414", "653985");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void sendSmsunBind(){
		SmsBean bean= new SmsBean();
		bean.setMobile("18210457414");
		bean.setModuleType("1012");
		ResultBean  result =smsService.sendSmsCode(bean);
		System.out.println(JSON.toJSONString(result));
	}
	@Test
	public void vaildateBankCardForModifyPhone(){
		try {
			ResultBean bean=this.bindMobileService.vaildateUnbindPhone("100000000001003","18210457414", "123456", "427139");
			System.out.println(JSON.toJSONString(bean));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
