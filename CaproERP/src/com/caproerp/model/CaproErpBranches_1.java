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
@Table(name = "capro_erp_branches")
@NamedQueries({
    @NamedQuery(name = "CaproErpBranches_1.findAll", query = "SELECT c FROM CaproErpBranches_1 c"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchId", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchId = :branchId"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchCode", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchCode = :branchCode"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchName", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchNameLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchNameLocal = :branchNameLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchContactPerson", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchContactPerson = :branchContactPerson"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchContactPersonLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchContactPersonLocal = :branchContactPersonLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchContactNo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchContactNo = :branchContactNo"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchWhatsappNo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchWhatsappNo = :branchWhatsappNo"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchCaption", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchCaption = :branchCaption"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchCaptionLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchCaptionLocal = :branchCaptionLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLocation", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLocation = :branchLocation"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLocationLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLocationLocal = :branchLocationLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLatitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLatitude = :branchLatitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLongitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLongitude = :branchLongitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLaunchDate", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLaunchDate = :branchLaunchDate"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchExpireDate", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchExpireDate = :branchExpireDate"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchGstIn", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchGstIn = :branchGstIn"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchTaxPercentage", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchTaxPercentage = :branchTaxPercentage"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLicenseNo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLicenseNo = :branchLicenseNo"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchLogo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchLogo = :branchLogo"),
    @NamedQuery(name = "CaproErpBranches_1.findByLetterHeadUrl", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.letterHeadUrl = :letterHeadUrl"),
    @NamedQuery(name = "CaproErpBranches_1.findByDomain", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.domain = :domain"),
    @NamedQuery(name = "CaproErpBranches_1.findByWebsiteUrl", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.websiteUrl = :websiteUrl"),
    @NamedQuery(name = "CaproErpBranches_1.findByNotificationAccess", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.notificationAccess = :notificationAccess"),
    @NamedQuery(name = "CaproErpBranches_1.findByLoginType", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.loginType = :loginType"),
    @NamedQuery(name = "CaproErpBranches_1.findByInvoiceNoType", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.invoiceNoType = :invoiceNoType"),
    @NamedQuery(name = "CaproErpBranches_1.findByCountryName", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.countryName = :countryName"),
    @NamedQuery(name = "CaproErpBranches_1.findByStateName", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.stateName = :stateName"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchEmail", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchEmail = :branchEmail"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchAddress", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchAddress = :branchAddress"),
    @NamedQuery(name = "CaproErpBranches_1.findByBuildingNo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.buildingNo = :buildingNo"),
    @NamedQuery(name = "CaproErpBranches_1.findByStreet", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.street = :street"),
    @NamedQuery(name = "CaproErpBranches_1.findByStreetLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.streetLocal = :streetLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByAdditionalNo", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.additionalNo = :additionalNo"),
    @NamedQuery(name = "CaproErpBranches_1.findByDistrictName", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.districtName = :districtName"),
    @NamedQuery(name = "CaproErpBranches_1.findByDistrictNameLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.districtNameLocal = :districtNameLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByZipCode", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.zipCode = :zipCode"),
    @NamedQuery(name = "CaproErpBranches_1.findByCityName", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.cityName = :cityName"),
    @NamedQuery(name = "CaproErpBranches_1.findByCityNameLocal", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.cityNameLocal = :cityNameLocal"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchWorkStartTime", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchWorkStartTime = :branchWorkStartTime"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchWorkEndTime", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchWorkEndTime = :branchWorkEndTime"),
    @NamedQuery(name = "CaproErpBranches_1.findByBranchStatus", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.branchStatus = :branchStatus"),
    @NamedQuery(name = "CaproErpBranches_1.findByAddedUserId", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpBranches_1.findByKeywords", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpBranches_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpBranches_1.findByAddedIpAddress", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpBranches_1.findByAddedLatitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByAddedLongitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByAddedDateTime", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpBranches_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpBranches_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpBranches_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpBranches_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpBranches_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "branch_code")
    private String branchCode;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "branch_name_local")
    private String branchNameLocal;
    @Column(name = "branch_contact_person")
    private String branchContactPerson;
    @Column(name = "branch_contact_person_local")
    private String branchContactPersonLocal;
    @Column(name = "branch_contact_no")
    private String branchContactNo;
    @Column(name = "branch_whatsapp_no")
    private String branchWhatsappNo;
    @Column(name = "branch_caption")
    private String branchCaption;
    @Column(name = "branch_caption_local")
    private String branchCaptionLocal;
    @Column(name = "branch_location")
    private String branchLocation;
    @Column(name = "branch_location_local")
    private String branchLocationLocal;
    @Column(name = "branch_latitude")
    private String branchLatitude;
    @Column(name = "branch_longitude")
    private String branchLongitude;
    @Column(name = "branch_launch_date")
    @Temporal(TemporalType.DATE)
    private Date branchLaunchDate;
    @Column(name = "branch_expire_date")
    @Temporal(TemporalType.DATE)
    private Date branchExpireDate;
    @Column(name = "branch_gst_in")
    private String branchGstIn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "branch_tax_percentage")
    private Double branchTaxPercentage;
    @Column(name = "branch_license_no")
    private String branchLicenseNo;
    @Column(name = "branch_logo")
    private String branchLogo;
    @Column(name = "letter_head_url")
    private String letterHeadUrl;
    @Basic(optional = false)
    @Column(name = "domain")
    private String domain;
    @Column(name = "website_url")
    private String websiteUrl;
    @Column(name = "notification_access")
    private Short notificationAccess;
    @Column(name = "login_type")
    private String loginType;
    @Column(name = "invoice_no_type")
    private String invoiceNoType;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "branch_email")
    private String branchEmail;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "building_no")
    private String buildingNo;
    @Column(name = "street")
    private String street;
    @Column(name = "street_local")
    private String streetLocal;
    @Column(name = "additional_no")
    private String additionalNo;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "district_name_local")
    private String districtNameLocal;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "city_name_local")
    private String cityNameLocal;
    @Column(name = "branch_work_start_time")
    @Temporal(TemporalType.TIME)
    private Date branchWorkStartTime;
    @Column(name = "branch_work_end_time")
    @Temporal(TemporalType.TIME)
    private Date branchWorkEndTime;
    @Column(name = "branch_status")
    private Short branchStatus;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "keywords")
    private String keywords;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branchId")
    private Collection<CaproErpRoutes_1> caproErpRoutesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branchId")
    private Collection<CaproErpUsers_1> caproErpUsersCollection;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne
    private CaproErpAdmin_1 adminId;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne
    private CaproErpCountry_1 countryId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private CaproErpStates_1 stateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "branchId")
    private Collection<CaproErpEmployees_1> caproErpEmployeesCollection;

    public CaproErpBranches_1() {
    }

    public CaproErpBranches_1(Integer branchId) {
        this.branchId = branchId;
    }

    public CaproErpBranches_1(Integer branchId, String domain) {
        this.branchId = branchId;
        this.domain = domain;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchNameLocal() {
        return branchNameLocal;
    }

    public void setBranchNameLocal(String branchNameLocal) {
        this.branchNameLocal = branchNameLocal;
    }

    public String getBranchContactPerson() {
        return branchContactPerson;
    }

    public void setBranchContactPerson(String branchContactPerson) {
        this.branchContactPerson = branchContactPerson;
    }

    public String getBranchContactPersonLocal() {
        return branchContactPersonLocal;
    }

    public void setBranchContactPersonLocal(String branchContactPersonLocal) {
        this.branchContactPersonLocal = branchContactPersonLocal;
    }

    public String getBranchContactNo() {
        return branchContactNo;
    }

    public void setBranchContactNo(String branchContactNo) {
        this.branchContactNo = branchContactNo;
    }

    public String getBranchWhatsappNo() {
        return branchWhatsappNo;
    }

    public void setBranchWhatsappNo(String branchWhatsappNo) {
        this.branchWhatsappNo = branchWhatsappNo;
    }

    public String getBranchCaption() {
        return branchCaption;
    }

    public void setBranchCaption(String branchCaption) {
        this.branchCaption = branchCaption;
    }

    public String getBranchCaptionLocal() {
        return branchCaptionLocal;
    }

    public void setBranchCaptionLocal(String branchCaptionLocal) {
        this.branchCaptionLocal = branchCaptionLocal;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getBranchLocationLocal() {
        return branchLocationLocal;
    }

    public void setBranchLocationLocal(String branchLocationLocal) {
        this.branchLocationLocal = branchLocationLocal;
    }

    public String getBranchLatitude() {
        return branchLatitude;
    }

    public void setBranchLatitude(String branchLatitude) {
        this.branchLatitude = branchLatitude;
    }

    public String getBranchLongitude() {
        return branchLongitude;
    }

    public void setBranchLongitude(String branchLongitude) {
        this.branchLongitude = branchLongitude;
    }

    public Date getBranchLaunchDate() {
        return branchLaunchDate;
    }

    public void setBranchLaunchDate(Date branchLaunchDate) {
        this.branchLaunchDate = branchLaunchDate;
    }

    public Date getBranchExpireDate() {
        return branchExpireDate;
    }

    public void setBranchExpireDate(Date branchExpireDate) {
        this.branchExpireDate = branchExpireDate;
    }

    public String getBranchGstIn() {
        return branchGstIn;
    }

    public void setBranchGstIn(String branchGstIn) {
        this.branchGstIn = branchGstIn;
    }

    public Double getBranchTaxPercentage() {
        return branchTaxPercentage;
    }

    public void setBranchTaxPercentage(Double branchTaxPercentage) {
        this.branchTaxPercentage = branchTaxPercentage;
    }

    public String getBranchLicenseNo() {
        return branchLicenseNo;
    }

    public void setBranchLicenseNo(String branchLicenseNo) {
        this.branchLicenseNo = branchLicenseNo;
    }

    public String getBranchLogo() {
        return branchLogo;
    }

    public void setBranchLogo(String branchLogo) {
        this.branchLogo = branchLogo;
    }

    public String getLetterHeadUrl() {
        return letterHeadUrl;
    }

    public void setLetterHeadUrl(String letterHeadUrl) {
        this.letterHeadUrl = letterHeadUrl;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Short getNotificationAccess() {
        return notificationAccess;
    }

    public void setNotificationAccess(Short notificationAccess) {
        this.notificationAccess = notificationAccess;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getInvoiceNoType() {
        return invoiceNoType;
    }

    public void setInvoiceNoType(String invoiceNoType) {
        this.invoiceNoType = invoiceNoType;
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

    public String getBranchEmail() {
        return branchEmail;
    }

    public void setBranchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetLocal() {
        return streetLocal;
    }

    public void setStreetLocal(String streetLocal) {
        this.streetLocal = streetLocal;
    }

    public String getAdditionalNo() {
        return additionalNo;
    }

    public void setAdditionalNo(String additionalNo) {
        this.additionalNo = additionalNo;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictNameLocal() {
        return districtNameLocal;
    }

    public void setDistrictNameLocal(String districtNameLocal) {
        this.districtNameLocal = districtNameLocal;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNameLocal() {
        return cityNameLocal;
    }

    public void setCityNameLocal(String cityNameLocal) {
        this.cityNameLocal = cityNameLocal;
    }

    public Date getBranchWorkStartTime() {
        return branchWorkStartTime;
    }

    public void setBranchWorkStartTime(Date branchWorkStartTime) {
        this.branchWorkStartTime = branchWorkStartTime;
    }

    public Date getBranchWorkEndTime() {
        return branchWorkEndTime;
    }

    public void setBranchWorkEndTime(Date branchWorkEndTime) {
        this.branchWorkEndTime = branchWorkEndTime;
    }

    public Short getBranchStatus() {
        return branchStatus;
    }

    public void setBranchStatus(Short branchStatus) {
        this.branchStatus = branchStatus;
    }

    public Integer getAddedUserId() {
        return addedUserId;
    }

    public void setAddedUserId(Integer addedUserId) {
        this.addedUserId = addedUserId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    public CaproErpAdmin_1 getAdminId() {
        return adminId;
    }

    public void setAdminId(CaproErpAdmin_1 adminId) {
        this.adminId = adminId;
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
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpBranches_1)) {
            return false;
        }
        CaproErpBranches_1 other = (CaproErpBranches_1) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpBranches_1[ branchId=" + branchId + " ]";
    }
    
}
