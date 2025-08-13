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
@Table(name = "capro_erp_routes")
@NamedQueries({
    @NamedQuery(name = "CaproErpRoutes.findAll", query = "SELECT c FROM CaproErpRoutes c"),
    @NamedQuery(name = "CaproErpRoutes.findByRouteId", query = "SELECT c FROM CaproErpRoutes c WHERE c.routeId = :routeId"),
    @NamedQuery(name = "CaproErpRoutes.findByRouteName", query = "SELECT c FROM CaproErpRoutes c WHERE c.routeName = :routeName"),
    @NamedQuery(name = "CaproErpRoutes.findByRouteNameLocal", query = "SELECT c FROM CaproErpRoutes c WHERE c.routeNameLocal = :routeNameLocal"),
    @NamedQuery(name = "CaproErpRoutes.findByDescription", query = "SELECT c FROM CaproErpRoutes c WHERE c.description = :description"),
    @NamedQuery(name = "CaproErpRoutes.findByRouteStatus", query = "SELECT c FROM CaproErpRoutes c WHERE c.routeStatus = :routeStatus"),
    @NamedQuery(name = "CaproErpRoutes.findByAddedDateTime", query = "SELECT c FROM CaproErpRoutes c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpRoutes.findByUpdatedDateTime", query = "SELECT c FROM CaproErpRoutes c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpRoutes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "route_id")
    private Integer routeId;
    @Basic(optional = false)
    @Column(name = "route_name")
    private String routeName;
    @Column(name = "route_name_local")
    private String routeNameLocal;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "route_status")
    private short routeStatus;
    @Column(name = "added_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDateTime;
    @Column(name = "updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDateTime;
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
    @JoinColumn(name = "updated_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private CaproErpUsers updatedUserId;
    @OneToMany(mappedBy = "routeId")
    private Collection<CaproErpEmployees> caproErpEmployeesCollection;

    public CaproErpRoutes() {
    }

    public CaproErpRoutes(Integer routeId) {
        this.routeId = routeId;
    }

    public CaproErpRoutes(Integer routeId, String routeName, short routeStatus) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.routeStatus = routeStatus;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteNameLocal() {
        return routeNameLocal;
    }

    public void setRouteNameLocal(String routeNameLocal) {
        this.routeNameLocal = routeNameLocal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(short routeStatus) {
        this.routeStatus = routeStatus;
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

    public CaproErpUsers getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(CaproErpUsers updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Collection<CaproErpEmployees> getCaproErpEmployeesCollection() {
        return caproErpEmployeesCollection;
    }

    public void setCaproErpEmployeesCollection(Collection<CaproErpEmployees> caproErpEmployeesCollection) {
        this.caproErpEmployeesCollection = caproErpEmployeesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (routeId != null ? routeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpRoutes)) {
            return false;
        }
        CaproErpRoutes other = (CaproErpRoutes) object;
        if ((this.routeId == null && other.routeId != null) || (this.routeId != null && !this.routeId.equals(other.routeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpRoutes[ routeId=" + routeId + " ]";
    }
    
}
