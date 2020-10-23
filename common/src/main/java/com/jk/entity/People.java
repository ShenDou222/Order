package com.jk.entity;

import java.util.Date;

public class People {
    private Integer id;

    private String name;

    private Integer deptid;

    private Date rudate;

    private String gw;

    private String zz;

    private String deptname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getRudate() {
        return rudate;
    }

    public void setRudate(Date rudate) {
        this.rudate = rudate;
    }

    public String getGw() {
        return gw;
    }

    public void setGw(String gw) {
        this.gw = gw == null ? null : gw.trim();
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz == null ? null : zz.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}