package com.jshop.action;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;
import com.jshop.action.templates.CreateHtml;
import com.jshop.action.tools.BaseTools;
import com.jshop.action.tools.ContentTag;
import com.jshop.action.tools.Serial;
import com.jshop.action.tools.Validate;
import com.jshop.entity.ArticleCategoryT;
import com.jshop.entity.ArticleT;
import com.jshop.entity.GoodsCategoryT;
import com.jshop.entity.GoodsT;
import com.jshop.entity.JshopbasicInfoT;
import com.jshop.entity.SiteNavigationT;
import com.jshop.service.impl.ArticleCategoryTServiceImpl;
import com.jshop.service.impl.ArticleTServiceImpl;
import com.jshop.service.impl.GoodsCategoryTServiceImpl;
import com.jshop.service.impl.GoodsTServiceImpl;
import com.jshop.service.impl.JshopbasicInfoTServiceImpl;
import com.jshop.service.impl.SiteNavigationTServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import freemarker.template.TemplateException;

@ParentPackage("jshop")
@Controller("goodsCategoryTAction")
public class GoodsCategoryTAction extends ActionSupport {
	@Resource(name = "goodsCategoryTServiceImpl")
	private GoodsCategoryTServiceImpl goodsCategoryTServiceImpl;
	@Resource(name = "goodsTServiceImpl")
	private GoodsTServiceImpl goodsTServiceImpl;
	@Resource(name = "jshopbasicInfoTServiceImpl")
	private JshopbasicInfoTServiceImpl jshopbasicInfoTServiceImpl;
	@Resource(name = "siteNavigationTServiceImpl")
	private SiteNavigationTServiceImpl siteNavigationTServiceImpl;
	@Resource(name = "articleCategoryTServiceImpl")
	private ArticleCategoryTServiceImpl articleCategoryTServiceImpl;
	@Resource(name = "articleTServiceImpl")
	private ArticleTServiceImpl articleTServiceImpl;
	@Resource(name = "createHtml")
	private CreateHtml createHtml;
	@Resource(name = "serial")
	private Serial serial;

	private String goodsCategoryTid;
	private String grade;
	private String metaKeywords;
	private String metaDes;
	private String name;
	private String state;
	private String path;
	private String sort;
	private String sign;
	private String goodsTypeId;
	private String parentId;
	private String parentId1;
	private String parentName;
	private String parentName1;
	private Date createtime;
	private String creatorid;
	private String goodscategoryzero = null;
	private String goodscategorythree = null;
	private String goodscategorytwo = null;
	private String query;
	private String qtype;
	private List<GoodsCategoryT> goodstypetnav = new ArrayList<GoodsCategoryT>();
	private List<GoodsCategoryT> secondcategory = new ArrayList<GoodsCategoryT>();
	private List<GoodsCategoryT> thiredscategory = new ArrayList<GoodsCategoryT>();
	private String navidlist = null;
	private String ltypeidlist = null;
	private String stypeidlist = null;
	private GoodsCategoryT bean = new GoodsCategoryT();
	private Map<String, Object> map = new HashMap<String, Object>();
	private List rows = new ArrayList();
	private int rp;
	private int page = 1;
	private int total = 0;
	private boolean slogin;
	private boolean sucflag;
	private String usession;
	private String sortname;
	private String sortorder;

	@JSON(serialize = false)
	public GoodsCategoryTServiceImpl getGoodsCategoryTServiceImpl() {
		return goodsCategoryTServiceImpl;
	}

	public void setGoodsCategoryTServiceImpl(GoodsCategoryTServiceImpl goodsCategoryTServiceImpl) {
		this.goodsCategoryTServiceImpl = goodsCategoryTServiceImpl;
	}

	@JSON(serialize = false)
	public GoodsTServiceImpl getGoodsTServiceImpl() {
		return goodsTServiceImpl;
	}

	public void setGoodsTServiceImpl(GoodsTServiceImpl goodsTServiceImpl) {
		this.goodsTServiceImpl = goodsTServiceImpl;
	}

	@JSON(serialize = false)
	public JshopbasicInfoTServiceImpl getJshopbasicInfoTServiceImpl() {
		return jshopbasicInfoTServiceImpl;
	}

	public void setJshopbasicInfoTServiceImpl(JshopbasicInfoTServiceImpl jshopbasicInfoTServiceImpl) {
		this.jshopbasicInfoTServiceImpl = jshopbasicInfoTServiceImpl;
	}

	@JSON(serialize = false)
	public SiteNavigationTServiceImpl getSiteNavigationTServiceImpl() {
		return siteNavigationTServiceImpl;
	}

	public void setSiteNavigationTServiceImpl(SiteNavigationTServiceImpl siteNavigationTServiceImpl) {
		this.siteNavigationTServiceImpl = siteNavigationTServiceImpl;
	}

	@JSON(serialize = false)
	public ArticleCategoryTServiceImpl getArticleCategoryTServiceImpl() {
		return articleCategoryTServiceImpl;
	}

	public void setArticleCategoryTServiceImpl(ArticleCategoryTServiceImpl articleCategoryTServiceImpl) {
		this.articleCategoryTServiceImpl = articleCategoryTServiceImpl;
	}

	@JSON(serialize = false)
	public ArticleTServiceImpl getArticleTServiceImpl() {
		return articleTServiceImpl;
	}

	public void setArticleTServiceImpl(ArticleTServiceImpl articleTServiceImpl) {
		this.articleTServiceImpl = articleTServiceImpl;
	}

	@JSON(serialize = false)
	public CreateHtml getCreateHtml() {
		return createHtml;
	}

	public void setCreateHtml(CreateHtml createHtml) {
		this.createHtml = createHtml;
	}

	@JSON(serialize = false)
	public Serial getSerial() {
		return serial;
	}

	public void setSerial(Serial serial) {
		this.serial = serial;
	}

	public String getGoodsCategoryTid() {
		return goodsCategoryTid;
	}

	public void setGoodsCategoryTid(String goodsCategoryTid) {
		this.goodsCategoryTid = goodsCategoryTid;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDes() {
		return metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public boolean isSlogin() {
		return slogin;
	}

	public void setSlogin(boolean slogin) {
		this.slogin = slogin;
	}

	public boolean isSucflag() {
		return sucflag;
	}

	public void setSucflag(boolean sucflag) {
		this.sucflag = sucflag;
	}

	public String getGoodscategoryzero() {
		return goodscategoryzero;
	}

	public void setGoodscategoryzero(String goodscategoryzero) {
		this.goodscategoryzero = goodscategoryzero;
	}

	public String getGoodscategorythree() {
		return goodscategorythree;
	}

	public void setGoodscategorythree(String goodscategorythree) {
		this.goodscategorythree = goodscategorythree;
	}

	public String getGoodscategorytwo() {
		return goodscategorytwo;
	}

	public void setGoodscategorytwo(String goodscategorytwo) {
		this.goodscategorytwo = goodscategorytwo;
	}

	public String getParentId1() {
		return parentId1;
	}

	public void setParentId1(String parentId1) {
		this.parentId1 = parentId1;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentName1() {
		return parentName1;
	}

	public void setParentName1(String parentName1) {
		this.parentName1 = parentName1;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<GoodsCategoryT> getGoodstypetnav() {
		return goodstypetnav;
	}

	public void setGoodstypetnav(List<GoodsCategoryT> goodstypetnav) {
		this.goodstypetnav = goodstypetnav;
	}

	public List<GoodsCategoryT> getSecondcategory() {
		return secondcategory;
	}

	public void setSecondcategory(List<GoodsCategoryT> secondcategory) {
		this.secondcategory = secondcategory;
	}

	public List<GoodsCategoryT> getThiredscategory() {
		return thiredscategory;
	}

	public void setThiredscategory(List<GoodsCategoryT> thiredscategory) {
		this.thiredscategory = thiredscategory;
	}

	public GoodsCategoryT getBean() {
		return bean;
	}

	public void setBean(GoodsCategoryT bean) {
		this.bean = bean;
	}

	public String getNavidlist() {
		return navidlist;
	}

	public void setNavidlist(String navidlist) {
		this.navidlist = navidlist;
	}

	public String getLtypeidlist() {
		return ltypeidlist;
	}

	public void setLtypeidlist(String ltypeidlist) {
		this.ltypeidlist = ltypeidlist;
	}

	public String getStypeidlist() {
		return stypeidlist;
	}

	public void setStypeidlist(String stypeidlist) {
		this.stypeidlist = stypeidlist;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	public String getSortorder() {
		return sortorder;
	}

	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}

	public void setUsession(String usession) {
		this.usession = usession;
	}

	public String getUsession() {
		return usession;
	}

	/**
	 * 清理错误
	 */
	@Override
	public void validate() {
		this.clearErrorsAndMessages();

	}

	/**
	 * 收集生成静态页所需数据
	 */
	public void createGoodsCategory() {
		this.findIndexSiteNavigation();
		this.findGoodsCategoryT();
		this.findJshopbasicInfo();
		findFooterCateogyrT();
		findFooterArticle();
		findCategoryGoods();

	}

	/**
	 * 获取商城基本信息
	 */
	public void findJshopbasicInfo() {
		String state = "1";
		String openstate = "1";
		JshopbasicInfoT bean = this.getJshopbasicInfoTServiceImpl().findJshopbasicInfoBystateandopstate(BaseTools.adminCreateId(), state, openstate);
		if (bean != null) {
			map.put("jshopbasicinfo", bean);
		}

	}

	/**
	 * 获取导航
	 */
	public void findIndexSiteNavigation() {

		String isVisible = "1";
		List<SiteNavigationT> list = this.getSiteNavigationTServiceImpl().findSiteNavigationByisVisible(isVisible, BaseTools.adminCreateId());
		if (list != null) {
			map.put("siteNavigationList", list);
		}

	}

	/**
	 * 读取左侧主导航
	 * 
	 * @return
	 */
	public void findGoodsCategoryT() {
		List<GoodsCategoryT> list = this.getGoodsCategoryTServiceImpl().findAllGoodsCategoryBycreatorid(BaseTools.adminCreateId());
		if (list != null) {
			int gradecount = 0;
			for (Iterator it = list.iterator(); it.hasNext();) {
				GoodsCategoryT gt = (GoodsCategoryT) it.next();
				if (gt.getGrade().equals("0")) {
					gradecount++;
				}
			}
			map.put("goodsCategoryTree", list);
			map.put("goodsCategoryTreeFirstCount", gradecount);
		}
	}

	/**
	 * 获取页脚分类
	 */
	public void findFooterCateogyrT() {
		String position = "1";
		String status = "1";
		int lineSize = 5;
		List<ArticleCategoryT> list = this.getArticleCategoryTServiceImpl().findArticleCategoryByposition(lineSize, status, position, BaseTools.adminCreateId());
		if (list != null) {
			map.put("footcategory", list);
		}
	}

	/**
	 * 获取页脚文章
	 */
	public void findFooterArticle() {
		List<ArticleT> list = this.getArticleTServiceImpl().findAllArticleBycreatorid(BaseTools.adminCreateId());
		if (list != null) {
			List<ArticleT> list1 = new ArrayList<ArticleT>();
			for (Iterator it = list.iterator(); it.hasNext();) {
				ArticleT at = (ArticleT) it.next();
				if (at.getPosition() != null && at.getPosition().equals("1")) {
					list1.add(at);
				}
			}
			map.put("footerarticle", list1);
		}

	}

	/**
	 * 获取对应商品分类下得商品数据
	 */
	public void findCategoryGoods() {
		if (bean != null) {
			String salestate = "1";
			if (bean.getGrade().equals("0")) {
				String navid = this.getGoodsCategoryTid();
				List<GoodsT> list = this.getGoodsTServiceImpl().findAllGoodsBynavid(navid, salestate);
				map.put("allgoods", list);
			} else if (bean.getGrade().equals("1")) {
				String ltypeid = this.getGoodsCategoryTid();
				List<GoodsT> list = this.getGoodsTServiceImpl().findGoodsByLtypeid(ltypeid, salestate);
				map.put("allgoods", list);
			} else {
				String stypeid = this.getGoodsCategoryTid();
				List<GoodsT> list = this.getGoodsTServiceImpl().findGoodsByStypeid(stypeid, salestate);
				map.put("allgoods", list);
			}
		}
	}

	/**
	 * 获取顶级分类和一级分类
	 */
	@Action(value = "findGoodsCategoryByGradeZeroone", results = { @Result(name = "json", type = "json") })
	public String findGoodsCategoryByGradeZeroone() {
		this.setGoodscategoryzero("");
		List<GoodsCategoryT> list = this.getGoodsCategoryTServiceImpl().findGoodsCategoryByGrade("0", "1");
		if (list != null) {
			this.goodscategoryzero = "<option value='-1'>--请选择--</option><option value='0'>顶级分类</option>";
			for (Iterator it = list.iterator(); it.hasNext();) {
				GoodsCategoryT gct = (GoodsCategoryT) it.next();
				this.goodscategoryzero += "<option value='" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</option>";
			}
			this.setSucflag(true);
			return "json";
		}
		this.setSucflag(true);
		return "json";
	}

	/**
	 * 获取二级分类
	 */
	@Action(value = "findGoodsCategoryByGradeTwo", results = { @Result(name = "json", type = "json") })
	public String findGoodsCategoryByGradeTwo() {
		this.setGoodscategorytwo("");
		List<GoodsCategoryT> list = this.getGoodsCategoryTServiceImpl().findGoodsCategoryByGrade("1", "1");
		if (list != null) {
			this.goodscategorytwo = "<option value='-1'>--请选择--</option>";
			for (Iterator it = list.iterator(); it.hasNext();) {
				GoodsCategoryT gct = (GoodsCategoryT) it.next();
				this.goodscategorytwo += "<option value='" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</option>";
			}
			this.setSucflag(true);
			return "json";
		} else {
			this.setGoodscategorytwo("");
			this.goodscategorytwo = "<option value='-1'>--请选择--</option>";
		}
		this.setSucflag(true);
		return "json";
	}

	/**
	 * 增加商品分类
	 * 
	 * @return
	 */
	@Action(value = "addGoodsCategory", results = { @Result(name = "json", type = "json") })
	public String addGoodsCategory() {
		int i = this.getGoodsCategoryTServiceImpl().checkGoodscategoryName(this.getName());
		int j = this.getGoodsCategoryTServiceImpl().checkGoodscategorySign(this.getSign());
		if (i == 0 && j == 0) {
			if (Integer.parseInt(this.getGrade()) == 0) {
				GoodsCategoryT gct = new GoodsCategoryT();
				gct.setGoodsCategoryTid(this.getSerial().Serialid(Serial.GOODSCATEGORY));
				gct.setGrade(this.getGrade().trim());//顶级，一级
				gct.setMetaKeywords(this.getMetaKeywords().trim());
				gct.setMetaDes(this.getMetaDes().trim());
				gct.setName(this.getName().trim());
				gct.setState("1");
				gct.setPath(gct.getGoodsCategoryTid());
				gct.setSort(Integer.parseInt(this.getSort().trim()));
				gct.setSign(this.getSign().trim());
				gct.setGoodsTypeId(this.getGoodsTypeId());
				gct.setCreatetime(BaseTools.systemtime());
				gct.setCreatorid(BaseTools.adminCreateId());
				gct.setParentName("");
				this.getGoodsCategoryTServiceImpl().addGoodsCategory(gct);
				this.setSucflag(true);
				return "json";
			}
		} else {
			this.setSucflag(false);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}

	/**
	 * 增加二级分类
	 * 
	 * @return
	 */
	@Action(value = "addGoodsCategoryTwo", results = { @Result(name = "json", type = "json") })
	public String addGoodsCategoryTwo() {
		int i = this.getGoodsCategoryTServiceImpl().checkGoodscategoryName(this.getName());
		int j = this.getGoodsCategoryTServiceImpl().checkGoodscategorySign(this.getSign());
		if (i == 0 && j == 0) {
			if (Integer.parseInt(this.getGrade()) == 1) {
				GoodsCategoryT gct = new GoodsCategoryT();
				gct.setGoodsCategoryTid(this.getSerial().Serialid(Serial.GOODSCATEGORY));
				gct.setGrade(this.getGrade().trim());//二级
				gct.setMetaKeywords(this.getMetaKeywords().trim());
				gct.setMetaDes(this.getMetaDes().trim());
				gct.setName(this.getName().trim());
				gct.setState("1");
				gct.setPath(this.getParentId() + "," + gct.getGoodsCategoryTid());
				gct.setSort(Integer.parseInt(this.getSort().trim()));
				gct.setSign(this.getSign().trim());
				gct.setGoodsTypeId(this.getGoodsTypeId());
				gct.setCreatetime(BaseTools.systemtime());
				gct.setCreatorid(BaseTools.adminCreateId());
				gct.setParentId(this.getParentId());
				gct.setParentName(this.getParentName());
				this.getGoodsCategoryTServiceImpl().addGoodsCategory(gct);
				this.setSucflag(true);
				return "json";
			}
		} else {
			this.setSucflag(false);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}

	/**
	 * 增加三级分类
	 * 
	 * @return
	 */
	@Action(value = "addGoodsCategoryThree", results = { @Result(name = "json", type = "json") })
	public String addGoodsCategoryThree() {
		int i = this.getGoodsCategoryTServiceImpl().checkGoodscategoryName(this.getName());
		int j = this.getGoodsCategoryTServiceImpl().checkGoodscategorySign(this.getSign());
		if (i == 0 && j == 0) {
			if (Integer.parseInt(this.getGrade()) == 2) {
				GoodsCategoryT gct = new GoodsCategoryT();
				gct.setGoodsCategoryTid(this.getSerial().Serialid(Serial.GOODSCATEGORY));
				gct.setGrade(this.getGrade().trim());//三级
				gct.setMetaKeywords(this.getMetaKeywords().trim());
				gct.setMetaDes(this.getMetaDes().trim());
				gct.setName(this.getName().trim());
				gct.setState("1");
				gct.setPath(this.getParentId() + "," + this.getParentId1() + "," + gct.getGoodsCategoryTid());
				gct.setSort(Integer.parseInt(this.getSort().trim()));
				gct.setSign(this.getSign().trim());
				gct.setGoodsTypeId(this.getGoodsTypeId());
				gct.setCreatetime(BaseTools.systemtime());
				gct.setCreatorid(BaseTools.adminCreateId());
				gct.setParentId(this.getParentId1());
				gct.setParentName(this.getParentName1());
				this.getGoodsCategoryTServiceImpl().addGoodsCategory(gct);
				this.setSucflag(true);
				return "json";
			}
		} else {
			this.setSucflag(false);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}

	/**
	 * 获取所有商品分类
	 * 
	 * @return
	 */
	@Action(value = "findAllGoodsCategoryT", results = { @Result(name = "json", type = "json") })
	public String findAllGoodsCategoryT() {
		if (this.getQtype().equals("sc")) {
			this.findDefaultAllGoodsCategoryT();
		} else {
			if (Validate.StrisNull(this.getQuery())) {
				return "json";
			} else {
				return "json";
			}
		}
		return "json";
	}

	public void findDefaultAllGoodsCategoryT() {
		int currentPage = page;
		int lineSize = rp;
		String state = "1";
		total = this.getGoodsCategoryTServiceImpl().countfindAllGoodsCategoryT(state);
		if (Validate.StrNotNull(sortname) && Validate.StrNotNull(sortorder)) {
			String queryString = "from GoodsCategoryT as gt where state=:state order by " + sortname + " " + sortorder + " ";
			List<GoodsCategoryT> list = this.getGoodsCategoryTServiceImpl().sortAllGoodsCategoryT(currentPage, lineSize, state, queryString);
			if (list != null) {
				this.ProcessGoodsCategoryTList(list);
			}
		}
	}

	public void ProcessGoodsCategoryTList(List<GoodsCategoryT> list) {
		for (Iterator it = list.iterator(); it.hasNext();) {
			GoodsCategoryT gct = (GoodsCategoryT) it.next();
			if (gct.getGrade().equals("0")) {
				gct.setGrade("顶级分类");
			} else if (gct.getGrade().equals("1")) {
				gct.setGrade("二级分类");
			} else {
				gct.setGrade("三级分类");
			}
			Map<String, Object> cellMap = new HashMap<String, Object>();
			cellMap.put("id", gct.getGoodsCategoryTid());
			cellMap.put("cell", new Object[] {"<a href='addgoodscategory.jsp?session=" + this.getUsession() + "#goods&goodsCategoryTid=" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</a>", gct.getParentName(), gct.getGrade(), gct.getSign(), gct.getSort(), BaseTools.formateDbDate(gct.getCreatetime()), gct.getCreatorid(), "<a target='_blank' id='browergoodscategory' href='" + gct.getHtmlpath() + "' name='browergoodscategory'>[预览]</a>" });
			rows.add(cellMap);
		}

	}

	/**
	 * 获取商品分类
	 * 
	 * @return
	 */
	@Action(value = "findGoodscategoryBygoodscategoryId", results = { @Result(name = "json", type = "json") })
	public String findGoodscategoryBygoodscategoryId() {
		if (Validate.StrNotNull(this.getGoodsCategoryTid())) {
			bean = this.getGoodsCategoryTServiceImpl().findGoodscategoryBygoodscategoryId(this.getGoodsCategoryTid());
			if (bean != null) {
				return "json";
			}
		}
		return "json";
	}

	/**
	 * 更新商品分类
	 * 
	 * @return
	 * @throws TemplateException
	 * @throws IOException
	 */
	@Action(value = "updateGoodscategoryT", results = { @Result(name = "json", type = "json") })
	public String updateGoodscategoryT() throws IOException, TemplateException {
		int i = this.getGoodsCategoryTServiceImpl().checkGoodscategoryNamewithoutMe(this.getGoodsCategoryTid().trim(), this.getName().trim());
		int j = this.getGoodsCategoryTServiceImpl().checkGoodscategorySignwithoutMe(this.getGoodsCategoryTid().trim(), this.getSign().trim());
		if (i == 0 && j == 0) {
			GoodsCategoryT gct = new GoodsCategoryT();
			gct.setName(this.getName().trim());
			gct.setGoodsTypeId(this.getGoodsTypeId().trim());
			gct.setSign(this.getSign().trim());
			gct.setSort(Integer.parseInt(this.getSort().trim()));
			gct.setMetaKeywords(this.getMetaKeywords());
			gct.setMetaDes(this.getMetaDes());
			gct.setGoodsCategoryTid(this.getGoodsCategoryTid());
			gct.setCreatetime(BaseTools.systemtime());
			gct.setCreatorid(BaseTools.adminCreateId());
			this.getGoodsCategoryTServiceImpl().updateGoodscategoryT(gct);
			createGoodsCategory();
			map.put("goodsCategory", gct);
			//更新商品分类静态页路径
			String htmlPath = this.getCreateHtml().createGoodsCategoryT(BaseTools.getApplicationthemesig()+"_"+ContentTag.TEMPLATENAMEFORGOODSCATEGORYLIST, gct.getSign(), map);
			updateHtmlPath(gct.getGoodsCategoryTid(), htmlPath);
			this.setSucflag(true);
			return "json";
		} else {
			this.setSucflag(false);
			return "json";
		}

	}

	/**
	 * 更新商品分类静态路径
	 * 
	 * @param articleid
	 * @param htmlPath
	 */
	public void updateHtmlPath(String goodsCategoryTid, String htmlpath) {
		this.getGoodsCategoryTServiceImpl().updateHtmlPath(goodsCategoryTid, htmlpath);
	}

	/**
	 * 删除商品分类
	 * 
	 * @return
	 */
	@Action(value = "delGoodscategoryT", results = { @Result(name = "json", type = "json") })
	public String delGoodscategoryT() {
		if (Validate.StrNotNull(this.getGoodsCategoryTid())) {
			String[] strs = this.getGoodsCategoryTid().split(",");
			for (int i = 0; i < strs.length; i++) {
				bean = this.getGoodsCategoryTServiceImpl().findGoodscategoryBygoodscategoryId(strs[i]);
				if (bean != null) {
					if (bean.getGrade().equals("0")) {
						this.setSucflag(false);
						return "json";
					} else {
						int j = this.getGoodsCategoryTServiceImpl().delGoodscategoryT(strs[i], "0");
						if (j > 0) {
							this.setSucflag(true);
							return "json";
						}
					}

				}
			}

		}
		return "json";
	}

	/**
	 * 获取顶级分类一级
	 * 
	 * @return
	 */
	@Action(value = "findGoodscategoryNavid", results = { @Result(name = "json", type = "json") })
	public String findGoodscategoryNavid() {

		this.setNavidlist("");
		this.goodstypetnav = this.getGoodsCategoryTServiceImpl().findGoodscategoryByparentIdnull("1");
		if (this.goodstypetnav != null) {
			for (Iterator it = goodstypetnav.iterator(); it.hasNext();) {
				GoodsCategoryT gct = (GoodsCategoryT) it.next();
				navidlist += "<option value='" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</option>";
			}
			this.setNavidlist(navidlist);
			this.setSucflag(true);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}

	/**
	 * 获取二级分类
	 * 
	 * @return
	 */
	@Action(value = "findGoodscategoryLtypeid", results = { @Result(name = "json", type = "json") })
	public String findGoodscategoryLtypeid() {
		if (Validate.StrNotNull(this.getParentId())) {
			this.setLtypeidlist("");
			this.secondcategory = this.getGoodsCategoryTServiceImpl().findGoodscategoryByparentId("1", this.getParentId().trim());
			if (this.secondcategory != null) {
				this.ltypeidlist = "<option value='0'>--请选择--</option>";
				for (Iterator it = this.secondcategory.iterator(); it.hasNext();) {
					GoodsCategoryT gct = (GoodsCategoryT) it.next();
					ltypeidlist += "<option value='" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</option>";
				}
				this.setLtypeidlist(ltypeidlist);
				this.setSucflag(true);
				return "json";
			}
			this.setLtypeidlist("");
			this.setSucflag(true);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}

	/**
	 * 获取三级分类
	 * 
	 * @return
	 */
	@Action(value = "findGoodscategoryStypeid", results = { @Result(name = "json", type = "json") })
	public String findGoodscategoryStypeid() {

		if (Validate.StrNotNull(this.getParentId())) {
			this.setLtypeidlist("");
			this.thiredscategory = this.getGoodsCategoryTServiceImpl().findGoodscategoryByparentId("1", this.getParentId().trim());
			if (this.thiredscategory != null) {
				this.stypeidlist = "<option value='0'>--请选择--</option>";
				for (Iterator it = this.thiredscategory.iterator(); it.hasNext();) {
					GoodsCategoryT gct = (GoodsCategoryT) it.next();
					stypeidlist += "<option value='" + gct.getGoodsCategoryTid() + "'>" + gct.getName() + "</option>";
				}
				this.setStypeidlist(stypeidlist);
				this.setSucflag(true);
				return "json";
			}
			this.setStypeidlist("");
			this.setSucflag(true);
			return "json";
		}
		this.setSucflag(false);
		return "json";
	}
}
