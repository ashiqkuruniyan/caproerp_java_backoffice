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
@Table(name = "capro_erp_users")
@NamedQueries({
    @NamedQuery(name = "CaproErpUsers_1.findAll", query = "SELECT c FROM CaproErpUsers_1 c"),
    @NamedQuery(name = "CaproErpUsers_1.findByUserId", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.userId = :userId"),
    @NamedQuery(name = "CaproErpUsers_1.findByUsername", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.username = :username"),
    @NamedQuery(name = "CaproErpUsers_1.findByPassword", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.password = :password"),
    @NamedQuery(name = "CaproErpUsers_1.findByUserType", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.userType = :userType"),
    @NamedQuery(name = "CaproErpUsers_1.findByUserRole", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.userRole = :userRole"),
    @NamedQuery(name = "CaproErpUsers_1.findByPlatform", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.platform = :platform"),
    @NamedQuery(name = "CaproErpUsers_1.findByCurrentVersion", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.currentVersion = :currentVersion"),
    @NamedQuery(name = "CaproErpUsers_1.findByApiVersion", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.apiVersion = :apiVersion"),
    @NamedQuery(name = "CaproErpUsers_1.findByNotificationId", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.notificationId = :notificationId"),
    @NamedQuery(name = "CaproErpUsers_1.findByDeviceUid", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.deviceUid = :deviceUid"),
    @NamedQuery(name = "CaproErpUsers_1.findByAccessToken", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.accessToken = :accessToken"),
    @NamedQuery(name = "CaproErpUsers_1.findByAccessTokenGenTime", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.accessTokenGenTime = :accessTokenGenTime"),
    @NamedQuery(name = "CaproErpUsers_1.findByAddedUserId", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpUsers_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpUsers_1.findByUserStatus", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.userStatus = :userStatus"),
    @NamedQuery(name = "CaproErpUsers_1.findByAttendanceDate", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.attendanceDate = :attendanceDate"),
    @NamedQuery(name = "CaproErpUsers_1.findByAttendanceTime", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.attendanceTime = :attendanceTime"),
    @NamedQuery(name = "CaproErpUsers_1.findByLoginIpAddress", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.loginIpAddress = :loginIpAddress"),
    @NamedQuery(name = "CaproErpUsers_1.findByLoginLatitude", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.loginLatitude = :loginLatitude"),
    @NamedQuery(name = "CaproErpUsers_1.findByLoginLongitude", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.loginLongitude = :loginLongitude"),
    @NamedQuery(name = "CaproErpUsers_1.findByAddedDateTime", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpUsers_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpUsers_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpUsers_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpUsers_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpUsers_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpUsers_1 implements Serializable {

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
    private Collection<CaproErpRoutes_1> caproErpRoutesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "updatedUserId")
    private Collection<CaproErpRoutes_1> caproErpRoutesCollection1;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne(optional = false)
    private CaproErpAdmin_1 adminId;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne(optional = false)
    private CaproErpBranches_1 branchId;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(optional = false)
    private CaproErpEmployees_1 employeeId;

    public CaproErpUsers_1() {
    }

    public CaproErpUsers_1(Integer userId) {
        this.userId = userId;
    }

    public CaproErpUsers_1(Integer userId, short userType, short userStatus) {
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

    public Collection<CaproErpRoutes_1> getCaproErpRoutesCollection() {
        return caproErpRoutesCollection;
    }

    public void setCaproErpRoutesCollection(Collection<CaproErpRoutes_1> caproErpRoutesCollection) {
        this.caproErpRoutesCollection = caproErpRoutesCollection;
    }

    public Collection<CaproErpRoutes_1> getCaproErpRoutesCollection1() {
        return caproErpRoutesCollection1;
    }

    public void setCaproErpRoutesCollection1(Collection<CaproErpRoutes_1> caproErpRoutesCollection1) {
        this.caproErpRoutesCollection1 = caproErpRoutesCollection1;
    }

    public CaproErpAdmin_1 getAdminId() {
        return adminId;
    }

    public void setAdminId(CaproErpAdmin_1 adminId) {
        this.adminId = adminId;
    }

    public CaproErpBranches_1 getBranchId() {
        return branchId;
    }

    public void setBranchId(CaproErpBranches_1 branchId) {
        this.branchId = branchId;
    }

    public CaproErpEmployees_1 getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(CaproErpEmployees_1 employeeId) {
        this.employeeId = employeeId;
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
        if (!(object instanceof CaproErpUsers_1)) {
            return false;
        }
        CaproErpUsers_1 other = (CaproErpUsers_1) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpUsers_1[ userId=" + userId + " ]";
    }
    
}
