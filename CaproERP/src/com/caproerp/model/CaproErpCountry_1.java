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
@Table(name = "capro_erp_country")
@NamedQueries({
    @NamedQuery(name = "CaproErpCountry_1.findAll", query = "SELECT c FROM CaproErpCountry_1 c"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryId", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryId = :countryId"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryScode", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryScode = :countryScode"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryName", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryName = :countryName"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryNameLocal", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryNameLocal = :countryNameLocal"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryNameShort", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryNameShort = :countryNameShort"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryCode", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryCode = :countryCode"),
    @NamedQuery(name = "CaproErpCountry_1.findByCurrencyCode", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.currencyCode = :currencyCode"),
    @NamedQuery(name = "CaproErpCountry_1.findByTaxName", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.taxName = :taxName"),
    @NamedQuery(name = "CaproErpCountry_1.findByCountryStatus", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.countryStatus = :countryStatus"),
    @NamedQuery(name = "CaproErpCountry_1.findByAddedUserId", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpCountry_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpCountry_1.findByKeywords", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpCountry_1.findByAddedIpAddress", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpCountry_1.findByAddedLatitude", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpCountry_1.findByAddedLongitude", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpCountry_1.findByAddedDateTime", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpCountry_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpCountry_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpCountry_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpCountry_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpCountry_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpCountry_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "country_scode")
    private String countryScode;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_name_local")
    private String countryNameLocal;
    @Column(name = "country_name_short")
    private String countryNameShort;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "tax_name")
    private String taxName;
    @Column(name = "country_status")
    private Short countryStatus;
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
    @OneToMany(mappedBy = "countryId")
    private Collection<CaproErpBranches_1> caproErpBranchesCollection;
    @OneToMany(mappedBy = "countryId")
    private Collection<CaproErpAdmin_1> caproErpAdminCollection;
    @OneToMany(mappedBy = "countryId")
    private Collection<CaproErpEmployees_1> caproErpEmployeesCollection;

    public CaproErpCountry_1() {
    }

    public CaproErpCountry_1(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryScode() {
        return countryScode;
    }

    public void setCountryScode(String countryScode) {
        this.countryScode = countryScode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNameLocal() {
        return countryNameLocal;
    }

    public void setCountryNameLocal(String countryNameLocal) {
        this.countryNameLocal = countryNameLocal;
    }

    public String getCountryNameShort() {
        return countryNameShort;
    }

    public void setCountryNameShort(String countryNameShort) {
        this.countryNameShort = countryNameShort;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public Short getCountryStatus() {
        return countryStatus;
    }

    public void setCountryStatus(Short countryStatus) {
        this.countryStatus = countryStatus;
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

    public Collection<CaproErpBranches_1> getCaproErpBranchesCollection() {
        return caproErpBranchesCollection;
    }

    public void setCaproErpBranchesCollection(Collection<CaproErpBranches_1> caproErpBranchesCollection) {
        this.caproErpBranchesCollection = caproErpBranchesCollection;
    }

    public Collection<CaproErpAdmin_1> getCaproErpAdminCollection() {
        return caproErpAdminCollection;
    }

    public void setCaproErpAdminCollection(Collection<CaproErpAdmin_1> caproErpAdminCollection) {
        this.caproErpAdminCollection = caproErpAdminCollection;
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
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpCountry_1)) {
            return false;
        }
        CaproErpCountry_1 other = (CaproErpCountry_1) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpCountry_1[ countryId=" + countryId + " ]";
    }
    
}
