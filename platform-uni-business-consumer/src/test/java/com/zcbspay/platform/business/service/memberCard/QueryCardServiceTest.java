package com.zcbspay.platform.business.service.memberCard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.commons.bean.PageVo;
import com.zcbspay.platform.business.exception.BusinessCardException;
import com.zcbspay.platform.business.memberCard.bean.CardBinResultBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCardBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCardResultBean;
import com.zcbspay.platform.business.memberCard.bean.QueryCashBankResultBean;
import com.zcbspay.platform.business.memberCard.bean.QuerySupporedCardBean;
import com.zcbspay.platform.business.memberCard.bean.QuerySupportedCardResultBean;
import com.zcbspay.platform.business.memberCard.service.QueryCardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class QueryCardServiceTest {
	
	@Autowired
	private QueryCardService quryCardService;
	@Test
	public void queryCardBin(){
		try {
			CardBinResultBean bean =this.quryCardService.queryCardBin("6225768749734008");
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void querySupportedCardList(){
		try {
			QuerySupporedCardBean query = new QuerySupporedCardBean();
			PageVo<QuerySupportedCardResultBean> querySupportedCardList =
					this.quryCardService.querySupportedCardList(query, 0, Integer.MAX_VALUE);
			System.out.println(JSON.toJSONString(querySupportedCardList));
		} catch (BusinessCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryBindCardList(){
		try {
			QueryCardBean query =new QueryCardBean();
			query.setMemberId("100000000001003");
			PageVo<QueryCardResultBean> bean =this.quryCardService.queryBindCardList(query, 0, Integer.MAX_VALUE);
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getBankIcon(){
		try {
			QueryCashBankResultBean bean =this.quryCardService.getBankIcon("03080000");
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
