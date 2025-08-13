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
@Table(name = "capro_erp_states")
@NamedQueries({
    @NamedQuery(name = "CaproErpStates.findAll", query = "SELECT c FROM CaproErpStates c"),
    @NamedQuery(name = "CaproErpStates.findByStateId", query = "SELECT c FROM CaproErpStates c WHERE c.stateId = :stateId"),
    @NamedQuery(name = "CaproErpStates.findByStateCode", query = "SELECT c FROM CaproErpStates c WHERE c.stateCode = :stateCode"),
    @NamedQuery(name = "CaproErpStates.findByStateName", query = "SELECT c FROM CaproErpStates c WHERE c.stateName = :stateName"),
    @NamedQuery(name = "CaproErpStates.findByStateNameLocal", query = "SELECT c FROM CaproErpStates c WHERE c.stateNameLocal = :stateNameLocal"),
    @NamedQuery(name = "CaproErpStates.findByCountryId", query = "SELECT c FROM CaproErpStates c WHERE c.countryId = :countryId"),
    @NamedQuery(name = "CaproErpStates.findByStateStatus", query = "SELECT c FROM CaproErpStates c WHERE c.stateStatus = :stateStatus"),
    @NamedQuery(name = "CaproErpStates.findByAddedUserId", query = "SELECT c FROM CaproErpStates c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpStates.findByUpdatedUserId", query = "SELECT c FROM CaproErpStates c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpStates.findByAddedIpAddress", query = "SELECT c FROM CaproErpStates c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpStates.findByAddedLatitude", query = "SELECT c FROM CaproErpStates c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpStates.findByAddedLongitude", query = "SELECT c FROM CaproErpStates c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpStates.findByAddedDateTime", query = "SELECT c FROM CaproErpStates c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpStates.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpStates c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpStates.findByUpdatedLatitude", query = "SELECT c FROM CaproErpStates c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpStates.findByUpdatedLongitude", query = "SELECT c FROM CaproErpStates c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpStates.findByUpdatedDateTime", query = "SELECT c FROM CaproErpStates c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "state_code")
    private String stateCode;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "state_name_local")
    private String stateNameLocal;
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "state_status")
    private Short stateStatus;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
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
    @OneToMany(mappedBy = "stateId")
    private Collection<CaproErpBranches> caproErpBranchesCollection;
    @OneToMany(mappedBy = "stateId")
    private Collection<CaproErpAdmin> caproErpAdminCollection;
    @OneToMany(mappedBy = "stateId")
    private Collection<CaproErpEmployees> caproErpEmployeesCollection;

    public CaproErpStates() {
    }

    public CaproErpStates(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateNameLocal() {
        return stateNameLocal;
    }

    public void setStateNameLocal(String stateNameLocal) {
        this.stateNameLocal = stateNameLocal;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Short getStateStatus() {
        return stateStatus;
    }

    public void setStateStatus(Short stateStatus) {
        this.stateStatus = stateStatus;
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

    public Collection<CaproErpBranches> getCaproErpBranchesCollection() {
        return caproErpBranchesCollection;
    }

    public void setCaproErpBranchesCollection(Collection<CaproErpBranches> caproErpBranchesCollection) {
        this.caproErpBranchesCollection = caproErpBranchesCollection;
    }

    public Collection<CaproErpAdmin> getCaproErpAdminCollection() {
        return caproErpAdminCollection;
    }

    public void setCaproErpAdminCollection(Collection<CaproErpAdmin> caproErpAdminCollection) {
        this.caproErpAdminCollection = caproErpAdminCollection;
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
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpStates)) {
            return false;
        }
        CaproErpStates other = (CaproErpStates) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpStates[ stateId=" + stateId + " ]";
    }
    
}
