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
import jakarta.persistence.Lob;
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
@Table(name = "capro_erp_users")
@NamedQueries({
    @NamedQuery(name = "CaproErpUsers.findAll", query = "SELECT c FROM CaproErpUsers c"),
    @NamedQuery(name = "CaproErpUsers.findByUserId", query = "SELECT c FROM CaproErpUsers c WHERE c.userId = :userId"),
    @NamedQuery(name = "CaproErpUsers.findByUsername", query = "SELECT c FROM CaproErpUsers c WHERE c.username = :username"),
    @NamedQuery(name = "CaproErpUsers.findByPassword", query = "SELECT c FROM CaproErpUsers c WHERE c.password = :password"),
    @NamedQuery(name = "CaproErpUsers.findByUserType", query = "SELECT c FROM CaproErpUsers c WHERE c.userType = :userType"),
    @NamedQuery(name = "CaproErpUsers.findByUserRole", query = "SELECT c FROM CaproErpUsers c WHERE c.userRole = :userRole"),
    @NamedQuery(name = "CaproErpUsers.findByPlatform", query = "SELECT c FROM CaproErpUsers c WHERE c.platform = :platform"),
    @NamedQuery(name = "CaproErpUsers.findByCurrentVersion", query = "SELECT c FROM CaproErpUsers c WHERE c.currentVersion = :currentVersion"),
    @NamedQuery(name = "CaproErpUsers.findByApiVersion", query = "SELECT c FROM CaproErpUsers c WHERE c.apiVersion = :apiVersion"),
    @NamedQuery(name = "CaproErpUsers.findByDeviceUid", query = "SELECT c FROM CaproErpUsers c WHERE c.deviceUid = :deviceUid"),
    @NamedQuery(name = "CaproErpUsers.findByAccessToken", query = "SELECT c FROM CaproErpUsers c WHERE c.accessToken = :accessToken"),
    @NamedQuery(name = "CaproErpUsers.findByAccessTokenGenTime", query = "SELECT c FROM CaproErpUsers c WHERE c.accessTokenGenTime = :accessTokenGenTime"),
    @NamedQuery(name = "CaproErpUsers.findByAddedUserId", query = "SELECT c FROM CaproErpUsers c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpUsers.findByUpdatedUserId", query = "SELECT c FROM CaproErpUsers c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpUsers.findByUserStatus", query = "SELECT c FROM CaproErpUsers c WHERE c.userStatus = :userStatus"),
    @NamedQuery(name = "CaproErpUsers.findByAttendanceDate", query = "SELECT c FROM CaproErpUsers c WHERE c.attendanceDate = :attendanceDate"),
    @NamedQuery(name = "CaproErpUsers.findByAttendanceTime", query = "SELECT c FROM CaproErpUsers c WHERE c.attendanceTime = :attendanceTime"),
    @NamedQuery(name = "CaproErpUsers.findByLoginIpAddress", query = "SELECT c FROM CaproErpUsers c WHERE c.loginIpAddress = :loginIpAddress"),
    @NamedQuery(name = "CaproErpUsers.findByLoginLatitude", query = "SELECT c FROM CaproErpUsers c WHERE c.loginLatitude = :loginLatitude"),
    @NamedQuery(name = "CaproErpUsers.findByLoginLongitude", query = "SELECT c FROM CaproErpUsers c WHERE c.loginLongitude = :loginLongitude"),
    @NamedQuery(name = "CaproErpUsers.findByAddedDateTime", query = "SELECT c FROM CaproErpUsers c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpUsers.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpUsers c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpUsers.findByUpdatedLatitude", query = "SELECT c FROM CaproErpUsers c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpUsers.findByUpdatedLongitude", query = "SELECT c FROM CaproErpUsers c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpUsers.findByUpdatedDateTime", query = "SELECT c FROM CaproErpUsers c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "user_type")
    private short userType;
    @Column(name = "user_role")
    private Short userRole;
    @Column(name = "platform")
    private String platform;
    @Column(name = "current_version")
    private String currentVersion;
    @Column(name = "api_version")
    private String apiVersion;
    @Lob
    @Column(name = "notification_id")
    private String notificationId;
    @Column(name = "device_uid")
    private String deviceUid;
    @Column(name = "access_token")
    private String accessToken;
    @Column(name = "access_token_gen_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessTokenGenTime;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Basic(optional = false)
    @Column(name = "user_status")
    private short userStatus;
    @Column(name = "attendance_date")
    @Temporal(TemporalType.DATE)
    private Date attendanceDate;
    @Column(name = "attendance_time")
    @Temporal(TemporalType.TIME)
    private Date attendanceTime;
    @Column(name = "login_ip_address")
    private String loginIpAddress;
    @Column(name = "login_latitude")
    private String loginLatitude;
    @Column(name = "login_longitude")
    private String loginLongitude;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addedUserId")
    private Collection<CaproErpRoutes> caproErpRoutesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "updatedUserId")
    private Collection<CaproErpRoutes> caproErpRoutesCollection1;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne(optional = false)
    private CaproErpAdmin adminId;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne(optional = false)
    private CaproErpBranches branchId;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(optional = false)
    private CaproErpEmployees employeeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addedUserId")
    private Collection<CaproErpProducts> caproErpProductsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addedUserId")
    private Collection<CaproErpActivities> caproErpActivitiesCollection;

    public CaproErpUsers() {
    }

    public CaproErpUsers(Integer userId) {
        this.userId = userId;
    }

    public CaproErpUsers(Integer userId, short userType, short userStatus) {
        this.userId = userId;
        this.userType = userType;
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getUserType() {
        return userType;
    }

    public void setUserType(short userType) {
        this.userType = userType;
    }

    public Short getUserRole() {
        return userRole;
    }

    public void setUserRole(Short userRole) {
        this.userRole = userRole;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getDeviceUid() {
        return deviceUid;
    }

    public void setDeviceUid(String deviceUid) {
        this.deviceUid = deviceUid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getAccessTokenGenTime() {
        return accessTokenGenTime;
    }

    public void setAccessTokenGenTime(Date accessTokenGenTime) {
        this.accessTokenGenTime = accessTokenGenTime;
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

    public short getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(short userStatus) {
        this.userStatus = userStatus;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public String getLoginIpAddress() {
        return loginIpAddress;
    }

    public void setLoginIpAddress(String loginIpAddress) {
        this.loginIpAddress = loginIpAddress;
    }

    public String getLoginLatitude() {
        return loginLatitude;
    }

    public void setLoginLatitude(String loginLatitude) {
        this.loginLatitude = loginLatitude;
    }

    public String getLoginLongitude() {
        return loginLongitude;
    }

    public void setLoginLongitude(String loginLongitude) {
        this.loginLongitude = loginLongitude;
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

    public Collection<CaproErpRoutes> getCaproErpRoutesCollection() {
        return caproErpRoutesCollection;
    }

    public void setCaproErpRoutesCollection(Collection<CaproErpRoutes> caproErpRoutesCollection) {
        this.caproErpRoutesCollection = caproErpRoutesCollection;
    }

    public Collection<CaproErpRoutes> getCaproErpRoutesCollection1() {
        return caproErpRoutesCollection1;
    }

    public void setCaproErpRoutesCollection1(Collection<CaproErpRoutes> caproErpRoutesCollection1) {
        this.caproErpRoutesCollection1 = caproErpRoutesCollection1;
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

    public Collection<CaproErpProducts> getCaproErpProductsCollection() {
        return caproErpProductsCollection;
    }

    public void setCaproErpProductsCollection(Collection<CaproErpProducts> caproErpProductsCollection) {
        this.caproErpProductsCollection = caproErpProductsCollection;
    }

    public Collection<CaproErpActivities> getCaproErpActivitiesCollection() {
        return caproErpActivitiesCollection;
    }

    public void setCaproErpActivitiesCollection(Collection<CaproErpActivities> caproErpActivitiesCollection) {
        this.caproErpActivitiesCollection = caproErpActivitiesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpUsers)) {
            return false;
        }
        CaproErpUsers other = (CaproErpUsers) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpUsers[ userId=" + userId + " ]";
    }
    
}
