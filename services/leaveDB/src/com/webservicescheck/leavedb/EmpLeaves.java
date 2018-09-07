/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.webservicescheck.leavedb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * EmpLeaves generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`empLeaves`")
public class EmpLeaves implements Serializable {

    private Integer empId;
    private Integer totalLeaves;
    private Integer remainLeaves;
    private EmpDetails empDetails;

    @Id
    @Column(name = "`empID`", nullable = false, scale = 0, precision = 10)
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Column(name = "`totalLeaves`", nullable = true, scale = 0, precision = 10)
    public Integer getTotalLeaves() {
        return this.totalLeaves;
    }

    public void setTotalLeaves(Integer totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    @Column(name = "`remainLeaves`", nullable = true, scale = 0, precision = 10)
    public Integer getRemainLeaves() {
        return this.remainLeaves;
    }

    public void setRemainLeaves(Integer remainLeaves) {
        this.remainLeaves = remainLeaves;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`empID`", referencedColumnName = "`empID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_60tkqoaas8uwoe24x3y1j3jub`"))
    @Fetch(FetchMode.JOIN)
    public EmpDetails getEmpDetails() {
        return this.empDetails;
    }

    public void setEmpDetails(EmpDetails empDetails) {
        if(empDetails != null) {
            this.empId = empDetails.getEmpId();
        }

        this.empDetails = empDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpLeaves)) return false;
        final EmpLeaves empLeaves = (EmpLeaves) o;
        return Objects.equals(getEmpId(), empLeaves.getEmpId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId());
    }
}