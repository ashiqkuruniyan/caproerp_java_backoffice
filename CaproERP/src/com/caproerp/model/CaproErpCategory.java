/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import java.util.Collection;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "capro_erp_category")
@NamedQueries({
    @NamedQuery(name = "CaproErpCategory.findAll", query = "SELECT c FROM CaproErpCategory c"),
    @NamedQuery(name = "CaproErpCategory.findByCategoryId", query = "SELECT c FROM CaproErpCategory c WHERE c.categoryId = :categoryId"),
    @NamedQuery(name = "CaproErpCategory.findByCategoryCode", query = "SELECT c FROM CaproErpCategory c WHERE c.categoryCode = :categoryCode"),
    @NamedQuery(name = "CaproErpCategory.findByCategoryName", query = "SELECT c FROM CaproErpCategory c WHERE c.categoryName = :categoryName"),
    @NamedQuery(name = "CaproErpCategory.findByCategoryNameLocal", query = "SELECT c FROM CaproErpCategory c WHERE c.categoryNameLocal = :categoryNameLocal"),
    @NamedQuery(name = "CaproErpCategory.findByParentId", query = "SELECT c FROM CaproErpCategory c WHERE c.parentId = :parentId"),
    @NamedQuery(name = "CaproErpCategory.findByAdminId", query = "SELECT c FROM CaproErpCategory c WHERE c.adminId = :adminId"),
    @NamedQuery(name = "CaproErpCategory.findByAdminName", query = "SELECT c FROM CaproErpCategory c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpCategory.findByBranchId", query = "SELECT c FROM CaproErpCategory c WHERE c.branchId = :branchId"),
    @NamedQuery(name = "CaproErpCategory.findByBranchName", query = "SELECT c FROM CaproErpCategory c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpCategory.findByEmployeeId", query = "SELECT c FROM CaproErpCategory c WHERE c.employeeId = :employeeId"),
    @NamedQuery(name = "CaproErpCategory.findByEmployeeName", query = "SELECT c FROM CaproErpCategory c WHERE c.employeeName = :employeeName"),
    @NamedQuery(name = "CaproErpCategory.findByAddedUserId", query = "SELECT c FROM CaproErpCategory c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpCategory.findByUpdatedUserId", query = "SELECT c FROM CaproErpCategory c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpCategory.findByCategoryStatus", query = "SELECT c FROM CaproErpCategory c WHERE c.categoryStatus = :categoryStatus"),
    @NamedQuery(name = "CaproErpCategory.findByAddedIpAddress", query = "SELECT c FROM CaproErpCategory c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpCategory.findByAddedLatitude", query = "SELECT c FROM CaproErpCategory c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpCategory.findByAddedLongitude", query = "SELECT c FROM CaproErpCategory c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpCategory.findByAddedDateTime", query = "SELECT c FROM CaproErpCategory c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpCategory.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpCategory c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpCategory.findByUpdatedLatitude", query = "SELECT c FROM CaproErpCategory c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpCategory.findByUpdatedLongitude", query = "SELECT c FROM CaproErpCategory c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpCategory.findByUpdatedDateTime", query = "SELECT c FROM CaproErpCategory c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "category_code")
    private String categoryCode;
    @Basic(optional = false)
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_name_local")
    private String categoryNameLocal;
    @Lob
    @Column(name = "category_image")
    private String categoryImage;
    @Column(name = "parent_id")
    private Short parentId;
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
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Column(name = "category_status")
    private Short categoryStatus;
    @Lob
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
    @OneToMany(mappedBy = "categoryId")
    private Collection<CaproErpProducts> caproErpProductsCollection;

    public CaproErpCategory() {
    }

    public CaproErpCategory(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CaproErpCategory(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryNameLocal() {
        return categoryNameLocal;
    }

    public void setCategoryNameLocal(String categoryNameLocal) {
        this.categoryNameLocal = categoryNameLocal;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
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

    public Short getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Short categoryStatus) {
        this.categoryStatus = categoryStatus;
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

    public Collection<CaproErpProducts> getCaproErpProductsCollection() {
        return caproErpProductsCollection;
    }

    public void setCaproErpProductsCollection(Collection<CaproErpProducts> caproErpProductsCollection) {
        this.caproErpProductsCollection = caproErpProductsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpCategory)) {
            return false;
        }
        CaproErpCategory other = (CaproErpCategory) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpCategory[ categoryId=" + categoryId + " ]";
    }
    
}
