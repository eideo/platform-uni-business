package com.zcbspay.platform.business.service.realname;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zcbspay.platform.business.commons.bean.ResultBean;
import com.zcbspay.platform.business.exception.BusinessOrderException;
import com.zcbspay.platform.business.exception.BusinessRealnameException;
import com.zcbspay.platform.business.order.bean.OrderResultBean;
import com.zcbspay.platform.business.order.service.QueryOrderService;
import com.zcbspay.platform.business.realname.bean.RealNameBean;
import com.zcbspay.platform.business.realname.service.RealnameService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/*.xml")
public class RealnameServiceTest {
	
	@Autowired
	private RealnameService realnameService;
	@Test
	public void realname(){
		try {
			RealNameBean realname= new RealNameBean();
			realname.setPhone("18210457410");
			realname.setCardNo("6217730706921466");
			realname.setCardType("1");
			realname.setCertNo("41072198001032452");
			realname.setCardKeeper("刘玉");
			ResultBean bean =this.realnameService.realname(realname);
			System.out.println(JSON.toJSONString(bean));
		} catch (BusinessRealnameException e) {
			System.out.println(e.getCode()+""+e.getMessage());
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}
