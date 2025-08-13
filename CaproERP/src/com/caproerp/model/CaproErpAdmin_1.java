/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
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
@Table(name = "capro_erp_admin")
@NamedQueries({
    @NamedQuery(name = "CaproErpAdmin_1.findAll", query = "SELECT c FROM CaproErpAdmin_1 c"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminId", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminId = :adminId"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminCode", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminCode = :adminCode"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminName", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminNameLocal", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminNameLocal = :adminNameLocal"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminContactNo", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminContactNo = :adminContactNo"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminWhatsappNo", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminWhatsappNo = :adminWhatsappNo"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminEmail", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminEmail = :adminEmail"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminLocation", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminLocation = :adminLocation"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminLocationLocal", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminLocationLocal = :adminLocationLocal"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminLatitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminLatitude = :adminLatitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminLongitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminLongitude = :adminLongitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByCountryName", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.countryName = :countryName"),
    @NamedQuery(name = "CaproErpAdmin_1.findByStateName", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.stateName = :stateName"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminAddress", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminAddress = :adminAddress"),
    @NamedQuery(name = "CaproErpAdmin_1.findByCustomerCareName", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.customerCareName = :customerCareName"),
    @NamedQuery(name = "CaproErpAdmin_1.findByCustomerCareNumber", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.customerCareNumber = :customerCareNumber"),
    @NamedQuery(name = "CaproErpAdmin_1.findByCustomerCareEmail", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.customerCareEmail = :customerCareEmail"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAdminStatus", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.adminStatus = :adminStatus"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAddedUserId", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpAdmin_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpAdmin_1.findByKeywords", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAddedIpAddress", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAddedLatitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAddedLongitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByAddedDateTime", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpAdmin_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpAdmin_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpAdmin_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpAdmin_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpAdmin_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_id")
    private Integer adminId;
    @Column(name = "admin_code")
    private String adminCode;
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "admin_name_local")
    private String adminNameLocal;
    @Column(name = "admin_contact_no")
    private String adminContactNo;
    @Column(name = "admin_whatsapp_no")
    private String adminWhatsappNo;
    @Column(name = "admin_email")
    private String adminEmail;
    @Column(name = "admin_location")
    private String adminLocation;
    @Column(name = "admin_location_local")
    private String adminLocationLocal;
    @Column(name = "admin_latitude")
    private String adminLatitude;
    @Column(name = "admin_longitude")
    private String adminLongitude;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "admin_address")
    private String adminAddress;
    @Column(name = "customer_care_name")
    private String customerCareName;
    @Column(name = "customer_care_number")
    private String customerCareNumber;
    @Column(name = "customer_care_email")
    private String customerCareEmail;
    @Basic(optional = false)
    @Column(name = "admin_status")
    private int adminStatus;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adminId")
    private Collection<CaproErpRoutes_1> caproErpRoutesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adminId")
    private Collection<CaproErpUsers_1> caproErpUsersCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<CaproErpBranches_1> caproErpBranchesCollection;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne
    private CaproErpCountry_1 countryId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private CaproErpStates_1 stateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adminId")
    private Collection<CaproErpEmployees_1> caproErpEmployeesCollection;

    public CaproErpAdmin_1() {
    }

    public CaproErpAdmin_1(Integer adminId) {
        this.adminId = adminId;
    }

    public CaproErpAdmin_1(Integer adminId, int adminStatus) {
        this.adminId = adminId;
        this.adminStatus = adminStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminNameLocal() {
        return adminNameLocal;
    }

    public void setAdminNameLocal(String adminNameLocal) {
        this.adminNameLocal = adminNameLocal;
    }

    public String getAdminContactNo() {
        return adminContactNo;
    }

    public void setAdminContactNo(String adminContactNo) {
        this.adminContactNo = adminContactNo;
    }

    public String getAdminWhatsappNo() {
        return adminWhatsappNo;
    }

    public void setAdminWhatsappNo(String adminWhatsappNo) {
        this.adminWhatsappNo = adminWhatsappNo;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminLocation() {
        return adminLocation;
    }

    public void setAdminLocation(String adminLocation) {
        this.adminLocation = adminLocation;
    }

    public String getAdminLocationLocal() {
        return adminLocationLocal;
    }

    public void setAdminLocationLocal(String adminLocationLocal) {
        this.adminLocationLocal = adminLocationLocal;
    }

    public String getAdminLatitude() {
        return adminLatitude;
    }

    public void setAdminLatitude(String adminLatitude) {
        this.adminLatitude = adminLatitude;
    }

    public String getAdminLongitude() {
        return adminLongitude;
    }

    public void setAdminLongitude(String adminLongitude) {
        this.adminLongitude = adminLongitude;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getCustomerCareName() {
        return customerCareName;
    }

    public void setCustomerCareName(String customerCareName) {
        this.customerCareName = customerCareName;
    }

    public String getCustomerCareNumber() {
        return customerCareNumber;
    }

    public void setCustomerCareNumber(String customerCareNumber) {
        this.customerCareNumber = customerCareNumber;
    }

    public String getCustomerCareEmail() {
        return customerCareEmail;
    }

    public void setCustomerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
    }

    public int getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(int adminStatus) {
        this.adminStatus = adminStatus;
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

    public Collection<CaproErpRoutes_1> getCaproErpRoutesCollection() {
        return caproErpRoutesCollection;
    }

    public void setCaproErpRoutesCollection(Collection<CaproErpRoutes_1> caproErpRoutesCollection) {
        this.caproErpRoutesCollection = caproErpRoutesCollection;
    }

    public Collection<CaproErpUsers_1> getCaproErpUsersCollection() {
        return caproErpUsersCollection;
    }

    public void setCaproErpUsersCollection(Collection<CaproErpUsers_1> caproErpUsersCollection) {
        this.caproErpUsersCollection = caproErpUsersCollection;
    }

    public Collection<CaproErpBranches_1> getCaproErpBranchesCollection() {
        return caproErpBranchesCollection;
    }

    public void setCaproErpBranchesCollection(Collection<CaproErpBranches_1> caproErpBranchesCollection) {
        this.caproErpBranchesCollection = caproErpBranchesCollection;
    }

    public CaproErpCountry_1 getCountryId() {
        return countryId;
    }

    public void setCountryId(CaproErpCountry_1 countryId) {
        this.countryId = countryId;
    }

    public CaproErpStates_1 getStateId() {
        return stateId;
    }

    public void setStateId(CaproErpStates_1 stateId) {
        this.stateId = stateId;
    }

    public Collection<CaproErpEmployees_1> getCaproErpEmployeesCollection() {
        return caproErpEmployeesCollection;
    }

    public void setCaproErpEmployeesCollection(Collection<CaproErpEmployees_1> caproErpEmployeesCollection) {
        this.caproErpEmployeesCollection = caproErpEmployeesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminId != null ? adminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpAdmin_1)) {
            return false;
        }
        CaproErpAdmin_1 other = (CaproErpAdmin_1) object;
        if ((this.adminId == null && other.adminId != null) || (this.adminId != null && !this.adminId.equals(other.adminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpAdmin_1[ adminId=" + adminId + " ]";
    }
    
}
