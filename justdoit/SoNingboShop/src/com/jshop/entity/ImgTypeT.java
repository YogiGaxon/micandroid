package com.jshop.entity;
// Generated 2011-12-21 20:50:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ImgTypeT generated by hbm2java
 */
public class ImgTypeT  implements java.io.Serializable {


     private String imgTypeId;
     private String imgTypeName;
     private Date createtime;
     private String creatorid;

    public ImgTypeT() {
    }

    public ImgTypeT(String imgTypeId, String imgTypeName, Date createtime, String creatorid) {
       this.imgTypeId = imgTypeId;
       this.imgTypeName = imgTypeName;
       this.createtime = createtime;
       this.creatorid = creatorid;
    }
   
    public String getImgTypeId() {
        return this.imgTypeId;
    }
    
    public void setImgTypeId(String imgTypeId) {
        this.imgTypeId = imgTypeId;
    }
    public String getImgTypeName() {
        return this.imgTypeName;
    }
    
    public void setImgTypeName(String imgTypeName) {
        this.imgTypeName = imgTypeName;
    }
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public String getCreatorid() {
        return this.creatorid;
    }
    
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }




}


