/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class VemployeeDepartmentId implements Serializable {

    private Integer businessEntityId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String jobTitle;
    private String department;
    private String groupName;
    private Date startDate;

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VemployeeDepartment)) return false;
        final VemployeeDepartment vemployeeDepartment = (VemployeeDepartment) o;
        return Objects.equals(getBusinessEntityId(), vemployeeDepartment.getBusinessEntityId()) &&
                Objects.equals(getTitle(), vemployeeDepartment.getTitle()) &&
                Objects.equals(getFirstName(), vemployeeDepartment.getFirstName()) &&
                Objects.equals(getMiddleName(), vemployeeDepartment.getMiddleName()) &&
                Objects.equals(getLastName(), vemployeeDepartment.getLastName()) &&
                Objects.equals(getSuffix(), vemployeeDepartment.getSuffix()) &&
                Objects.equals(getJobTitle(), vemployeeDepartment.getJobTitle()) &&
                Objects.equals(getDepartment(), vemployeeDepartment.getDepartment()) &&
                Objects.equals(getGroupName(), vemployeeDepartment.getGroupName()) &&
                Objects.equals(getStartDate(), vemployeeDepartment.getStartDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getTitle(),
                getFirstName(),
                getMiddleName(),
                getLastName(),
                getSuffix(),
                getJobTitle(),
                getDepartment(),
                getGroupName(),
                getStartDate());
    }
}
