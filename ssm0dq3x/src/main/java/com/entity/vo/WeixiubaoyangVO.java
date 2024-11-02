package com.entity.vo;

import com.entity.WeixiubaoyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 维修保养
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-11 22:25:25
 */
public class WeixiubaoyangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 维修日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weixiuriqi;
		
	/**
	 * 维修问题
	 */
	
	private String weixiuwenti;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：维修日期
	 */
	 
	public void setWeixiuriqi(Date weixiuriqi) {
		this.weixiuriqi = weixiuriqi;
	}
	
	/**
	 * 获取：维修日期
	 */
	public Date getWeixiuriqi() {
		return weixiuriqi;
	}
				
	
	/**
	 * 设置：维修问题
	 */
	 
	public void setWeixiuwenti(String weixiuwenti) {
		this.weixiuwenti = weixiuwenti;
	}
	
	/**
	 * 获取：维修问题
	 */
	public String getWeixiuwenti() {
		return weixiuwenti;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
