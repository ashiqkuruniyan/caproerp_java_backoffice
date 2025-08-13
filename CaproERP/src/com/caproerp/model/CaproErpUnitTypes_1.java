/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 *
 * @author DELL
 */
@Entity
@Table(name = "capro_erp_unit_types")
@NamedQueries({
    @NamedQuery(name = "CaproErpUnitTypes_1.findAll", query = "SELECT c FROM CaproErpUnitTypes_1 c"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeId = :unitTypeId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeCode", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeCode = :unitTypeCode"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeName", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeName = :unitTypeName"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeNameLocal", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeNameLocal = :unitTypeNameLocal"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeShortName", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeShortName = :unitTypeShortName"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUnitTypeStatus", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.unitTypeStatus = :unitTypeStatus"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAdminId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.adminId = :adminId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAdminName", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByBranchId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.branchId = :branchId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByBranchName", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByEmployeeId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.employeeId = :employeeId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAddedUserId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByKeywords", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAddedIpAddress", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAddedLatitude", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAddedLongitude", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByAddedDateTime", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpUnitTypes_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpUnitTypes_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpUnitTypes_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "unit_type_id")
    private Integer unitTypeId;
    @Column(name = "unit_type_code")
    private String unitTypeCode;
    @Basic(optional = false)
    @Column(name = "unit_type_name")
    private String unitTypeName;
    @Column(name = "unit_type_name_local")
    private String unitTypeNameLocal;
    @Column(name = "unit_type_short_name")
    private String unitTypeShortName;
    @Column(name = "unit_type_status")
    private Short unitTypeStatus;
    @Column(name = "admin_id")
    private Integer adminId;
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "employee_id")
    private Integer employeeId;
    @Lob
    @Column(name = "employee_name")
    private byte[] employeeName;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "added_ip_address")
    private String addedIpAddress;
    @Column(name = "added_latitude")
    private String addedLatitude;
    @Column(name = "added_longitude")
    private String addedLongitude;
    @Column(name = "added_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDateTime;
    @Column(name = "updated_ip_address")
    private String updatedIpAddress;
    @Column(name = "updated_latitude")
    private String updatedLatitude;
    @Column(name = "updated_longitude")
    private String updatedLongitude;
    @Column(name = "updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDateTime;

    public CaproErpUnitTypes_1() {
    }

    public CaproErpUnitTypes_1(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public CaproErpUnitTypes_1(Integer unitTypeId, String unitTypeName) {
        this.unitTypeId = unitTypeId;
        this.unitTypeName = unitTypeName;
    }

    public Integer getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitTypeCode() {
        return unitTypeCode;
    }

    public void setUnitTypeCode(String unitTypeCode) {
        this.unitTypeCode = unitTypeCode;
    }

    public String getUnitTypeName() {
        return unitTypeName;
    }

    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }

    public String getUnitTypeNameLocal() {
        return unitTypeNameLocal;
    }

    public void setUnitTypeNameLocal(String unitTypeNameLocal) {
        this.unitTypeNameLocal = unitTypeNameLocal;
    }

    public String getUnitTypeShortName() {
        return unitTypeShortName;
    }

    public void setUnitTypeShortName(String unitTypeShortName) {
        this.unitTypeShortName = unitTypeShortName;
    }

    public Short getUnitTypeStatus() {
        return unitTypeStatus;
    }

    public void setUnitTypeStatus(Short unitTypeStatus) {
        this.unitTypeStatus = unitTypeStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public byte[] getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(byte[] employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(Integer addedUserId) {
        this.addedUserId = addedUserId;
    }

    public Integer getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAddedIpAddress() {
        return addedIpAddress;
    }

    public void setAddedIpAddress(String addedIpAddress) {
        this.addedIpAddress = addedIpAddress;
    }

    public String getAddedLatitude() {
        return addedLatitude;
    }

    public void setAddedLatitude(String addedLatitude) {
        this.addedLatitude = addedLatitude;
    }

    public String getAddedLongitude() {
        return addedLongitude;
    }

    public void setAddedLongitude(String addedLongitude) {
        this.addedLongitude = addedLongitude;
    }

    public Date getAddedDateTime() {
        return addedDateTime;
    }

    public void setAddedDateTime(Date addedDateTime) {
        this.addedDateTime = addedDateTime;
    }

    public String getUpdatedIpAddress() {
        return updatedIpAddress;
    }

    public void setUpdatedIpAddress(String updatedIpAddress) {
        this.updatedIpAddress = updatedIpAddress;
    }

    public String getUpdatedLatitude() {
        return updatedLatitude;
    }

    public void setUpdatedLatitude(String updatedLatitude) {
        this.updatedLatitude = updatedLatitude;
    }

    public String getUpdatedLongitude() {
        return updatedLongitude;
    }

    public void setUpdatedLongitude(String updatedLongitude) {
        this.updatedLongitude = updatedLongitude;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitTypeId != null ? unitTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpUnitTypes_1)) {
            return false;
        }
        CaproErpUnitTypes_1 other = (CaproErpUnitTypes_1) object;
        if ((this.unitTypeId == null && other.unitTypeId != null) || (this.unitTypeId != null && !this.unitTypeId.equals(other.unitTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpUnitTypes_1[ unitTypeId=" + unitTypeId + " ]";
    }
    
}
