﻿Jxstar.currentPage = function() {
	var config = {param:{},initpage:function(page, define){},eventcfg:{}};

	var cols = [
	{col:{header:'控件代号', width:128, sortable:true}, field:{name:'v_combo_control__control_code',type:'string'}},
	{col:{header:'控件名称', width:156, sortable:true}, field:{name:'v_combo_control__control_name',type:'string'}}
	];
	
	config.param = {
		cols: cols,
		sorts: null,
		hasQuery: '0',
		isedit: '0',
		isshow: '1',
		funid: 'sel_combo'
	};
	
	//添加自定义查询按钮
		
	return new Jxstar.GridNode(config);
}