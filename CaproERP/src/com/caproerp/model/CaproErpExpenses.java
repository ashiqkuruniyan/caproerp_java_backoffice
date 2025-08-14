/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "capro_erp_expenses")
@NamedQueries({
    @NamedQuery(name = "CaproErpExpenses.findAll", query = "SELECT c FROM CaproErpExpenses c"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseId", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseId = :expenseId"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseCode", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseCode = :expenseCode"),
    @NamedQuery(name = "CaproErpExpenses.findByInvoiceNo", query = "SELECT c FROM CaproErpExpenses c WHERE c.invoiceNo = :invoiceNo"),
    @NamedQuery(name = "CaproErpExpenses.findByAmount", query = "SELECT c FROM CaproErpExpenses c WHERE c.amount = :amount"),
    @NamedQuery(name = "CaproErpExpenses.findByTaxTotal", query = "SELECT c FROM CaproErpExpenses c WHERE c.taxTotal = :taxTotal"),
    @NamedQuery(name = "CaproErpExpenses.findByHaveTax", query = "SELECT c FROM CaproErpExpenses c WHERE c.haveTax = :haveTax"),
    @NamedQuery(name = "CaproErpExpenses.findByTaxPercentage", query = "SELECT c FROM CaproErpExpenses c WHERE c.taxPercentage = :taxPercentage"),
    @NamedQuery(name = "CaproErpExpenses.findByTaxInclude", query = "SELECT c FROM CaproErpExpenses c WHERE c.taxInclude = :taxInclude"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseCategoryId", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseCategoryId = :expenseCategoryId"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseCategoryName", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseCategoryName = :expenseCategoryName"),
    @NamedQuery(name = "CaproErpExpenses.findByCaption", query = "SELECT c FROM CaproErpExpenses c WHERE c.caption = :caption"),
    @NamedQuery(name = "CaproErpExpenses.findByPayMethodId", query = "SELECT c FROM CaproErpExpenses c WHERE c.payMethodId = :payMethodId"),
    @NamedQuery(name = "CaproErpExpenses.findByPayMethodName", query = "SELECT c FROM CaproErpExpenses c WHERE c.payMethodName = :payMethodName"),
    @NamedQuery(name = "CaproErpExpenses.findByPartyId", query = "SELECT c FROM CaproErpExpenses c WHERE c.partyId = :partyId"),
    @NamedQuery(name = "CaproErpExpenses.findByPartyName", query = "SELECT c FROM CaproErpExpenses c WHERE c.partyName = :partyName"),
    @NamedQuery(name = "CaproErpExpenses.findByCurrencyCode", query = "SELECT c FROM CaproErpExpenses c WHERE c.currencyCode = :currencyCode"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseDate", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseDate = :expenseDate"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseDateTime", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseDateTime = :expenseDateTime"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseUserId", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseUserId = :expenseUserId"),
    @NamedQuery(name = "CaproErpExpenses.findByActivityId", query = "SELECT c FROM CaproErpExpenses c WHERE c.activityId = :activityId"),
    @NamedQuery(name = "CaproErpExpenses.findByAdminId", query = "SELECT c FROM CaproErpExpenses c WHERE c.adminId = :adminId"),
    @NamedQuery(name = "CaproErpExpenses.findByAdminName", query = "SELECT c FROM CaproErpExpenses c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpExpenses.findByBranchId", query = "SELECT c FROM CaproErpExpenses c WHERE c.branchId = :branchId"),
    @NamedQuery(name = "CaproErpExpenses.findByBranchName", query = "SELECT c FROM CaproErpExpenses c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpExpenses.findByEmployeeId", query = "SELECT c FROM CaproErpExpenses c WHERE c.employeeId = :employeeId"),
    @NamedQuery(name = "CaproErpExpenses.findByEmployeeName", query = "SELECT c FROM CaproErpExpenses c WHERE c.employeeName = :employeeName"),
    @NamedQuery(name = "CaproErpExpenses.findByIsSynced", query = "SELECT c FROM CaproErpExpenses c WHERE c.isSynced = :isSynced"),
    @NamedQuery(name = "CaproErpExpenses.findByExpenseStatus", query = "SELECT c FROM CaproErpExpenses c WHERE c.expenseStatus = :expenseStatus"),
    @NamedQuery(name = "CaproErpExpenses.findByAddedUserId", query = "SELECT c FROM CaproErpExpenses c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpExpenses.findByUpdatedUserId", query = "SELECT c FROM CaproErpExpenses c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpExpenses.findByAddedDateTime", query = "SELECT c FROM CaproErpExpenses c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpExpenses.findByUpdatedDateTime", query = "SELECT c FROM CaproErpExpenses c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpExpenses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "expense_id")
    private Integer expenseId;
    @Column(name = "expense_code")
    private String expenseCode;
    @Column(name = "invoice_no")
    private String invoiceNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Column(name = "tax_total")
    private Double taxTotal;
    @Column(name = "have_tax")
    private Short haveTax;
    @Column(name = "tax_percentage")
    private Double taxPercentage;
    @Column(name = "tax_include")
    private Short taxInclude;
    @Column(name = "expense_category_id")
    private Integer expenseCategoryId;
    @Column(name = "expense_category_name")
    private String expenseCategoryName;
    @Column(name = "caption")
    private String caption;
    @Column(name = "pay_method_id")
    private Integer payMethodId;
    @Column(name = "pay_method_name")
    private String payMethodName;
    @Column(name = "party_id")
    private Integer partyId;
    @Column(name = "party_name")
    private String partyName;
    @Lob
    @Column(name = "image")
    private String image;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "expense_date")
    @Temporal(TemporalType.DATE)
    private Date expenseDate;
    @Column(name = "expense_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expenseDateTime;
    @Column(name = "expense_user_id")
    private Integer expenseUserId;
    @Column(name = "activity_id")
    private Integer activityId;
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
    @Column(name = "is_synced")
    private Short isSynced;
    @Column(name = "expense_status")
    private Short expenseStatus;
    @Lob
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "added_user_id")
    private Integer addedUserId;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Column(name = "added_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDateTime;
    @Column(name = "updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDateTime;

    public CaproErpExpenses() {
    }

    public CaproErpExpenses(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseCode() {
        return expenseCode;
    }

    public void setExpenseCode(String expenseCode) {
        this.expenseCode = expenseCode;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Short getHaveTax() {
        return haveTax;
    }

    public void setHaveTax(Short haveTax) {
        this.haveTax = haveTax;
    }

    public Double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Short getTaxInclude() {
        return taxInclude;
    }

    public void setTaxInclude(Short taxInclude) {
        this.taxInclude = taxInclude;
    }

    public Integer getExpenseCategoryId() {
        return expenseCategoryId;
    }

    public void setExpenseCategoryId(Integer expenseCategoryId) {
        this.expenseCategoryId = expenseCategoryId;
    }

    public String getExpenseCategoryName() {
        return expenseCategoryName;
    }

    public void setExpenseCategoryName(String expenseCategoryName) {
        this.expenseCategoryName = expenseCategoryName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String payMethodName) {
        this.payMethodName = payMethodName;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Date getExpenseDateTime() {
        return expenseDateTime;
    }

    public void setExpenseDateTime(Date expenseDateTime) {
        this.expenseDateTime = expenseDateTime;
    }

    public Integer getExpenseUserId() {
        return expenseUserId;
    }

    public void setExpenseUserId(Integer expenseUserId) {
        this.expenseUserId = expenseUserId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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

    public Short getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(Short isSynced) {
        this.isSynced = isSynced;
    }

    public Short getExpenseStatus() {
        return expenseStatus;
    }

    public void setExpenseStatus(Short expenseStatus) {
        this.expenseStatus = expenseStatus;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (expenseId != null ? expenseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpExpenses)) {
            return false;
        }
        CaproErpExpenses other = (CaproErpExpenses) object;
        if ((this.expenseId == null && other.expenseId != null) || (this.expenseId != null && !this.expenseId.equals(other.expenseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpExpenses[ expenseId=" + expenseId + " ]";
    }
    
}
