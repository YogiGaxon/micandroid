package com.jshop.entity;

import java.sql.Timestamp;

/**
 * ElectronicMenuCartT entity. @author MyEclipse Persistence Tools
 */

public class ElectronicMenuCartT implements java.io.Serializable {

	// Fields    

	private String id;
	private String electronicMenuOrderid;
	private String goodsid;
	private String goodsname;
	private String userid;
	private String username;
	private Integer needquantity;
	private Double price;
	private Double memberprice;
	private Double changeprice;
	private Double points;
	private Double subtotal;
	private Timestamp addtime;
	private Integer quantity;
	private String picture;
	private String usersetnum;
	private Double weight;
	private String state;
	private Double deliveryprice;
	private String taste;
	private String ispackaway;
	private Integer lunchbox;
	private String cookingstate;
	private String electronicMenuCartid;
	private String tableNumber;
	private String roomName;
	private String tablestate;

	// Constructors

	/** default constructor */
	public ElectronicMenuCartT() {
	}

	/** minimal constructor */
	public ElectronicMenuCartT(String id, String goodsid, String goodsname, Integer needquantity, Double memberprice, Double points, Double subtotal, Timestamp addtime, String picture, String usersetnum, Double weight, String state, String tableNumber, String tablestate) {
		this.id = id;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.needquantity = needquantity;
		this.memberprice = memberprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.tableNumber = tableNumber;
		this.tablestate = tablestate;
	}

	/** full constructor */
	public ElectronicMenuCartT(String id, String electronicMenuOrderid, String goodsid, String goodsname, String userid, String username, Integer needquantity, Double price, Double memberprice, Double changeprice, Double points, Double subtotal, Timestamp addtime, Integer quantity, String picture, String usersetnum, Double weight, String state, Double deliveryprice, String taste, String ispackaway, Integer lunchbox, String cookingstate, String electronicMenuCartid, String tableNumber, String roomName, String tablestate) {
		this.id = id;
		this.electronicMenuOrderid = electronicMenuOrderid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.memberprice = memberprice;
		this.changeprice = changeprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.quantity = quantity;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.deliveryprice = deliveryprice;
		this.taste = taste;
		this.ispackaway = ispackaway;
		this.lunchbox = lunchbox;
		this.cookingstate = cookingstate;
		this.electronicMenuCartid = electronicMenuCartid;
		this.tableNumber = tableNumber;
		this.roomName = roomName;
		this.tablestate = tablestate;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getElectronicMenuOrderid() {
		return this.electronicMenuOrderid;
	}

	public void setElectronicMenuOrderid(String electronicMenuOrderid) {
		this.electronicMenuOrderid = electronicMenuOrderid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(Integer needquantity) {
		this.needquantity = needquantity;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	public Double getChangeprice() {
		return this.changeprice;
	}

	public void setChangeprice(Double changeprice) {
		this.changeprice = changeprice;
	}

	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getDeliveryprice() {
		return this.deliveryprice;
	}

	public void setDeliveryprice(Double deliveryprice) {
		this.deliveryprice = deliveryprice;
	}

	public String getTaste() {
		return this.taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getIspackaway() {
		return this.ispackaway;
	}

	public void setIspackaway(String ispackaway) {
		this.ispackaway = ispackaway;
	}

	public Integer getLunchbox() {
		return this.lunchbox;
	}

	public void setLunchbox(Integer lunchbox) {
		this.lunchbox = lunchbox;
	}

	public String getCookingstate() {
		return this.cookingstate;
	}

	public void setCookingstate(String cookingstate) {
		this.cookingstate = cookingstate;
	}

	public String getElectronicMenuCartid() {
		return this.electronicMenuCartid;
	}

	public void setElectronicMenuCartid(String electronicMenuCartid) {
		this.electronicMenuCartid = electronicMenuCartid;
	}

	public String getTableNumber() {
		return this.tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getTablestate() {
		return this.tablestate;
	}

	public void setTablestate(String tablestate) {
		this.tablestate = tablestate;
	}

}