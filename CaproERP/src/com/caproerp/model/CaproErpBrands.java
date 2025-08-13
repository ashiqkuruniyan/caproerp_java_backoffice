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
@Table(name = "capro_erp_brands")
@NamedQueries({
    @NamedQuery(name = "CaproErpBrands.findAll", query = "SELECT c FROM CaproErpBrands c"),
    @NamedQuery(name = "CaproErpBrands.findByBrandId", query = "SELECT c FROM CaproErpBrands c WHERE c.brandId = :brandId"),
    @NamedQuery(name = "CaproErpBrands.findByBrandCode", query = "SELECT c FROM CaproErpBrands c WHERE c.brandCode = :brandCode"),
    @NamedQuery(name = "CaproErpBrands.findByBrandName", query = "SELECT c FROM CaproErpBrands c WHERE c.brandName = :brandName"),
    @NamedQuery(name = "CaproErpBrands.findByBrandNameLocal", query = "SELECT c FROM CaproErpBrands c WHERE c.brandNameLocal = :brandNameLocal"),
    @NamedQuery(name = "CaproErpBrands.findByAdminId", query = "SELECT c FROM CaproErpBrands c WHERE c.adminId = :adminId"),
    @NamedQuery(name = "CaproErpBrands.findByAdminName", query = "SELECT c FROM CaproErpBrands c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpBrands.findByBranchId", query = "SELECT c FROM CaproErpBrands c WHERE c.branchId = :branchId"),
    @NamedQuery(name = "CaproErpBrands.findByBranchName", query = "SELECT c FROM CaproErpBrands c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpBrands.findByEmployeeId", query = "SELECT c FROM CaproErpBrands c WHERE c.employeeId = :employeeId"),
    @NamedQuery(name = "CaproErpBrands.findByEmployeeName", query = "SELECT c FROM CaproErpBrands c WHERE c.employeeName = :employeeName"),
    @NamedQuery(name = "CaproErpBrands.findByBrandStatus", query = "SELECT c FROM CaproErpBrands c WHERE c.brandStatus = :brandStatus"),
    @NamedQuery(name = "CaproErpBrands.findByAddedUserId", query = "SELECT c FROM CaproErpBrands c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpBrands.findByUpdatedUserId", query = "SELECT c FROM CaproErpBrands c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpBrands.findByAddedIpAddress", query = "SELECT c FROM CaproErpBrands c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpBrands.findByAddedLatitude", query = "SELECT c FROM CaproErpBrands c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpBrands.findByAddedLongitude", query = "SELECT c FROM CaproErpBrands c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpBrands.findByAddedDateTime", query = "SELECT c FROM CaproErpBrands c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpBrands.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpBrands c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpBrands.findByUpdatedLatitude", query = "SELECT c FROM CaproErpBrands c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpBrands.findByUpdatedLongitude", query = "SELECT c FROM CaproErpBrands c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpBrands.findByUpdatedDateTime", query = "SELECT c FROM CaproErpBrands c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpBrands implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "brand_id")
    private Integer brandId;
    @Column(name = "brand_code")
    private String brandCode;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "brand_name_local")
    private String brandNameLocal;
    @Lob
    @Column(name = "brand_image")
    private String brandImage;
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
    @Column(name = "brand_status")
    private Short brandStatus;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
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
    @OneToMany(mappedBy = "brandId")
    private Collection<CaproErpProducts> caproErpProductsCollection;

    public CaproErpBrands() {
    }

    public CaproErpBrands(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandNameLocal() {
        return brandNameLocal;
    }

    public void setBrandNameLocal(String brandNameLocal) {
        this.brandNameLocal = brandNameLocal;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
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

    public Short getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Short brandStatus) {
        this.brandStatus = brandStatus;
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

    public Collection<CaproErpProducts> getCaproErpProductsCollection() {
        return caproErpProductsCollection;
    }

    public void setCaproErpProductsCollection(Collection<CaproErpProducts> caproErpProductsCollection) {
        this.caproErpProductsCollection = caproErpProductsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brandId != null ? brandId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpBrands)) {
            return false;
        }
        CaproErpBrands other = (CaproErpBrands) object;
        if ((this.brandId == null && other.brandId != null) || (this.brandId != null && !this.brandId.equals(other.brandId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpBrands[ brandId=" + brandId + " ]";
    }
    
}
