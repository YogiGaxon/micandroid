	

		createFun: function(){
			var self = this;
			var hintcall = function(btn, text) {
				if (btn != 'ok') return;

				var hdcall = function() {
					self.grid.getStore().reload();
				};
				
				var params = 'funid=sys_fun_base&cfunid='+ text +'&pagetype=editgrid&eventcode=create';
				//�������Ͳ���
				if (self.grid.treeParam) {
					var parentId = self.grid.treeParam.parentId;
					params += '&cmodid=' + parentId;
				}
				
				//��������
				Request.postRequest(params, hdcall);
			};

			//'�������¹���ID'
			Ext.MessageBox.prompt(jx.base.hint, jx.fun.newid, hintcall);
		},
			
		createNode: function(){
			//ȡѡ���¼������ֵ
			var params = 'funid='+ this.define.nodeid;
			
			//��������Ĳ���
			params += '&pagetype=grid&eventcode=createNode&projectpath=' + Jxstar.session['project_path'];

			//�����ļ����Զ����ظ��ļ�
			var hdcall = function() {
				Request.loadJS('/public/data/NodeDefine.js');
			};

			//��������
			Request.postRequest(params, hdcall);
		},

		createRule: function(){
			//ȡѡ���¼������ֵ
			var params = 'funid='+ this.define.nodeid;
			
			//��������Ĳ���
			params += '&pagetype=grid&eventcode=createRule&projectpath=' + Jxstar.session['project_path'];

			//�����ļ����Զ����ظ��ļ�
			var hdcall = function() {
				Request.loadJS('/public/data/RuleData.js');
			};

			//��������
			Request.postRequest(params, hdcall);
		},
		
		createTree: function(){
			//ȡѡ���¼������ֵ
			var params = 'funid='+ this.define.nodeid;
			
			//��������Ĳ���
			params += '&pagetype=grid&eventcode=createTree&projectpath=' + Jxstar.session['project_path'];

			//�����ļ����Զ����ظ��ļ�
			var hdcall = function() {
				Request.loadJS('/public/data/TreeData.js');
			};

			//��������
			Request.postRequest(params, hdcall);
		},

		setFunext: function(){
	
	config.initpage = function(gridNode){