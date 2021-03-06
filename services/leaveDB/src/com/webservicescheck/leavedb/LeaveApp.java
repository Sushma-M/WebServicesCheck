/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.webservicescheck.leavedb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LeaveApp generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`LeaveApp`")
public class LeaveApp implements Serializable {

    private Integer leaveId;
    private String reason;
    private Integer appliedDays;
    private Boolean status;
    private String dates;
    private String empId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`LeaveID`", nullable = false, scale = 0, precision = 10)
    public Integer getLeaveId() {
        return this.leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    @Column(name = "`reason`", nullable = true, length = 255)
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Column(name = "`appliedDays`", nullable = true, scale = 0, precision = 10)
    public Integer getAppliedDays() {
        return this.appliedDays;
    }

    public void setAppliedDays(Integer appliedDays) {
        this.appliedDays = appliedDays;
    }

    @Column(name = "`status`", nullable = true)
    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Column(name = "`dates`", nullable = true, length = 255)
    public String getDates() {
        return this.dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Column(name = "`empID`", nullable = true, length = 255)
    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeaveApp)) return false;
        final LeaveApp leaveApp = (LeaveApp) o;
        return Objects.equals(getLeaveId(), leaveApp.getLeaveId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeaveId());
    }
}