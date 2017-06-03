package cn.itcast.ssm.po;

import java.util.Date;

/**
 * 
 * <p>Title:Items</p>
 * <p>Description:商品信息类po</p>
 * @author xb
 * @data 2016年9月25日 下午3:50:28
 */
public class Items {
	
	private Long id;//商品id
	
	private String name;//商品名称
	
	private Float price;//商品价格
	
	private String detail;//商品介绍
	
	private Date createtime;//创建时间
	
	public Items() {
		
	}
	
	public Items(Long id, String name, Float price, String detail, Date createtime) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.createtime = createtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
