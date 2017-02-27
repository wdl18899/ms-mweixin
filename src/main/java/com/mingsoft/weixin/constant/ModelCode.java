package com.mingsoft.weixin.constant;

import com.mingsoft.base.constant.e.BaseEnum;

/**
 * 模块编号<br/>
 * 模块编号说明：八位整型数据<br/>
 *          项目编号(2位)+模块编号(2位)+功能编号(2位)+子功能编号(2位)<br/>
 *          如：01(微信项目编号)01(微页面模块编号)01(模版管理编号)01(添加模版)<br/>
 *          若为：01010100则代表整个模块管理功能模块<br/>
 * @author 王天培QQ:78750478
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2012-03-15<br/>
 * 历史修订：<br/>
 */
public enum ModelCode implements BaseEnum{

	
	/**
	 * 微信图文素材
	 */
	WEIXIN_NEWS("05030100"),

	/**
	 * 微信图片素材
	 */
	WEIXIN_NEWS_IMAGE("05030200"),
	
	/**
	 * 微信文本素材
	 */
	WEIXIN_NEWS_TEXT("05030300"),
	
	/**
	 * 微信消息模块
	 */
	WEIXIN_MESSAGE("05050000"),
	
	/**
	 * 微信网页2.0授权管理
	 */
	WEIXIN_OAUTH("05070000");
	

	
	/**
	 * 设置modelCode的常量
	 * @param code 常量
	 */
	ModelCode(String code) {
		this.code = code;
	}

	private String code;

	/**
	 * 返回该modelCode常量的字符串表示
	 * @return 字符串
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return code;
	}

	/**
	 * 返回该modelCode常量的整型表示
	 * @return 整型
	 */
	public int toInt() {
		// TODO Auto-generated method stub
		return Integer.parseInt(code);
	}
}