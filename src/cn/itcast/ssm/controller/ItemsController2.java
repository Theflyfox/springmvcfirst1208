package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.itcast.ssm.po.Items;

/**
 * <p>Title:ItemsController</p>
 * <p>Description:实现HttpRequestHandler接口的处理器</p>
 * @author xb
 * @data 2016年9月25日 下午3:20:15
 * @version 1.0
 */
public class ItemsController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// 调用service查找数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		
		//向list中填充静态数据
		Items items_1 = new Items(1l, "联想笔记本2", 6000f, "2、ThinkPad T430联想笔记本电脑", new Date());
		Items items_2 = new Items(2l, "苹果手机2", 5000f, "2、iphone6s苹果手机", new Date());	
		itemsList.add(items_1);
		itemsList.add(items_2);
		//设置模型数据
		request.setAttribute("itemsList", itemsList);
		//设置转发的视图
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
		
		//使用此方法可以通过修改response，设置响应的数据格式，比如响应json数据
		/*response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json数据");*/
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
