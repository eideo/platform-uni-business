package com.zcbspay.platform.business.service.member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.exception.BusinessMemberException;
import com.zcbspay.platform.business.member.bean.MemberBean;
import com.zcbspay.platform.business.member.service.QueryMemberService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class QueryMemberServiceTest {
	@Autowired
	private QueryMemberService queryMemberService;
	@Test
	public void queryMember(){
		try {
			MemberBean bean =queryMemberService.queryMember("liushoumei", "300000000000020");
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessMemberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryPersonMember(){
		try {
			MemberBean bean =queryMemberService.queryPersonMember("100000000000640");
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessMemberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
