package com.zpark.pojo;

import java.util.List;

public class Permission {
    private Integer pId;

    private String pName;

    private String pSource;

    private Byte pIsparent;

    private Integer pParentid;
    //子菜单集合
    private List<Permission> psons;
    
    
    public List<Permission> getPsons() {
		return psons;
	}

	public void setPsons(List<Permission> psons) {
		this.psons = psons;
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSource() {
        return pSource;
    }

    public void setpSource(String pSource) {
        this.pSource = pSource == null ? null : pSource.trim();
    }

    public Byte getpIsparent() {
        return pIsparent;
    }

    public void setpIsparent(Byte pIsparent) {
        this.pIsparent = pIsparent;
    }

    public Integer getpParentid() {
        return pParentid;
    }

    public void setpParentid(Integer pParentid) {
        this.pParentid = pParentid;
    }
}