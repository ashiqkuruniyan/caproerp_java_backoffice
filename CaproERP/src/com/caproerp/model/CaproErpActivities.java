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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "capro_erp_activities")
@NamedQueries({
    @NamedQuery(name = "CaproErpActivities.findAll", query = "SELECT c FROM CaproErpActivities c"),
    @NamedQuery(name = "CaproErpActivities.findByActivityId", query = "SELECT c FROM CaproErpActivities c WHERE c.activityId = :activityId"),
    @NamedQuery(name = "CaproErpActivities.findByActivityCode", query = "SELECT c FROM CaproErpActivities c WHERE c.activityCode = :activityCode"),
    @NamedQuery(name = "CaproErpActivities.findByTableName", query = "SELECT c FROM CaproErpActivities c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "CaproErpActivities.findByTableCode", query = "SELECT c FROM CaproErpActivities c WHERE c.tableCode = :tableCode"),
    @NamedQuery(name = "CaproErpActivities.findByActivityDate", query = "SELECT c FROM CaproErpActivities c WHERE c.activityDate = :activityDate"),
    @NamedQuery(name = "CaproErpActivities.findByActivityStatus", query = "SELECT c FROM CaproErpActivities c WHERE c.activityStatus = :activityStatus"),
    @NamedQuery(name = "CaproErpActivities.findByUpdatedUserId", query = "SELECT c FROM CaproErpActivities c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpActivities.findByKeywords", query = "SELECT c FROM CaproErpActivities c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpActivities.findByAddedDateTime", query = "SELECT c FROM CaproErpActivities c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpActivities.findByUpdatedDateTime", query = "SELECT c FROM CaproErpActivities c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpActivities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "activity_id")
    private Integer activityId;
    @Basic(optional = false)
    @Column(name = "activity_code")
    private String activityCode;
    @Basic(optional = false)
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @Column(name = "table_code")
    private String tableCode;
    @Column(name = "activity_date")
    @Temporal(TemporalType.DATE)
    private Date activityDate;
    @Basic(optional = false)
    @Column(name = "activity_status")
    private short activityStatus;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "added_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDateTime;
    @Column(name = "updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDateTime;
    @OneToMany(mappedBy = "activityId")
    private Collection<CaproErpProducts> caproErpProductsCollection;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne(optional = false)
    private CaproErpAdmin adminId;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne(optional = false)
    private CaproErpBranches branchId;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(optional = false)
    private CaproErpEmployees employeeId;
    @JoinColumn(name = "added_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private CaproErpUsers addedUserId;

    public CaproErpActivities() {
    }

    public CaproErpActivities(Integer activityId) {
        this.activityId = activityId;
    }

    public CaproErpActivities(Integer activityId, String activityCode, String tableName, String tableCode, short activityStatus) {
        this.activityId = activityId;
        this.activityCode = activityCode;
        this.tableName = tableName;
        this.tableCode = tableCode;
        this.activityStatus = activityStatus;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public short getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(short activityStatus) {
        this.activityStatus = activityStatus;
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

    public Date getAddedDateTime() {
        return addedDateTime;
    }

    public void setAddedDateTime(Date addedDateTime) {
        this.addedDateTime = addedDateTime;
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

    public CaproErpAdmin getAdminId() {
        return adminId;
    }

    public void setAdminId(CaproErpAdmin adminId) {
        this.adminId = adminId;
    }

    public CaproErpBranches getBranchId() {
        return branchId;
    }

    public void setBranchId(CaproErpBranches branchId) {
        this.branchId = branchId;
    }

    public CaproErpEmployees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(CaproErpEmployees employeeId) {
        this.employeeId = employeeId;
    }

    public CaproErpUsers getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(CaproErpUsers addedUserId) {
        this.addedUserId = addedUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpActivities)) {
            return false;
        }
        CaproErpActivities other = (CaproErpActivities) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpActivities[ activityId=" + activityId + " ]";
    }
    
}
