package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/**
 * <p>Title:ItemsController</p>
 * <p>Description:注解开发Handler</p>
 * @author xb
 * @data 2016年9月25日 下午3:20:15
 * @version 1.0
 */
@Controller
public class ItemsController3{

	/**
	 * 商品查询列表
	 * @RequestMapping实现对queryItems方法和url进行映射，一个方法对应一个url
	 * 一般建议将url与方法名写成一样
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryItems123")
	public ModelAndView queryItems() throws Exception{
		// 调用service查找数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		
		//向list中填充静态数据
		Items items_1 = new Items(1l, "联想笔记本", 6000f, "ThinkPad T430联想笔记本电脑", new Date());
		Items items_2 = new Items(2l, "苹果手机", 5000f, "iphone6s苹果手机", new Date());	
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//相当于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return modelAndView;
	}
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		// 调用service查找数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		
		//向list中填充静态数据
		Items items_1 = new Items(1l, "联想笔记本", 6000f, "ThinkPad T430联想笔记本电脑", new Date());
		Items items_2 = new Items(2l, "苹果手机", 5000f, "iphone6s苹果手机", new Date());	
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//相当于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return modelAndView;
	}*/

}
