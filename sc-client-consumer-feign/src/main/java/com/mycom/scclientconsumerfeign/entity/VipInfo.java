package com.mycom.scclientconsumerfeign.entity;



/**
 * @author ：damiaokuaipao
 * @date ：Created in 2020-02-15 下午 04:52
 * @description：
 * @modified By：
 * @version: $
 */
public class VipInfo {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String name;
    private String sex;
}
