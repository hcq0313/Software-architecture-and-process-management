package com.dlmn.hcq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hcq
 * @since 2021-06-27
 */
@ApiModel(value="University对象", description="")
public class University implements Serializable {

    private static final long serialVersionUID=1L;

    private String lineid;

    private String code;

    private String schoolname;

    private String province;

    private String city;

    private String department;

    private String level;

    private String type;

    private String link;


    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "University{" +
        "lineid=" + lineid +
        ", code=" + code +
        ", schoolname=" + schoolname +
        ", province=" + province +
        ", city=" + city +
        ", department=" + department +
        ", level=" + level +
        ", type=" + type +
        ", link=" + link +
        "}";
    }
}
