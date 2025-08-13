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
@Table(name = "capro_erp_employees")
@NamedQueries({
    @NamedQuery(name = "CaproErpEmployees_1.findAll", query = "SELECT c FROM CaproErpEmployees_1 c"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeId", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeId = :employeeId"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeCode", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeCode = :employeeCode"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeName", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeName = :employeeName"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeNameLocal", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeNameLocal = :employeeNameLocal"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeDob", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeDob = :employeeDob"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeContactNo", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeContactNo = :employeeContactNo"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeWhatsappNo", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeWhatsappNo = :employeeWhatsappNo"),
    @NamedQuery(name = "CaproErpEmployees_1.findByRegContactNo", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.regContactNo = :regContactNo"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeCountryCode", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeCountryCode = :employeeCountryCode"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeEmail", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeEmail = :employeeEmail"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeLocation", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeLocation = :employeeLocation"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeLatitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeLatitude = :employeeLatitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeLongitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeLongitude = :employeeLongitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeAddress", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeAddress = :employeeAddress"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCountryName", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.countryName = :countryName"),
    @NamedQuery(name = "CaproErpEmployees_1.findByStateName", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.stateName = :stateName"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCurrencyCode", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.currencyCode = :currencyCode"),
    @NamedQuery(name = "CaproErpEmployees_1.findByWorkStartTime", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.workStartTime = :workStartTime"),
    @NamedQuery(name = "CaproErpEmployees_1.findByWorkEndTime", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.workEndTime = :workEndTime"),
    @NamedQuery(name = "CaproErpEmployees_1.findByBaseSalary", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.baseSalary = :baseSalary"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCapitalAmount", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.capitalAmount = :capitalAmount"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPremiumStartDate", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.premiumStartDate = :premiumStartDate"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPremiumEndDate", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.premiumEndDate = :premiumEndDate"),
    @NamedQuery(name = "CaproErpEmployees_1.findByLoginType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.loginType = :loginType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDefaultPrinter", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.defaultPrinter = :defaultPrinter"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrintType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printType = :printType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrintBillAs", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printBillAs = :printBillAs"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAccessPermission", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.accessPermission = :accessPermission"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrinterHeader", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printerHeader = :printerHeader"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrinterHeaderSalesText", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printerHeaderSalesText = :printerHeaderSalesText"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrinterHeaderSalesReturnText", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printerHeaderSalesReturnText = :printerHeaderSalesReturnText"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrinterHeaderPurchaseText", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printerHeaderPurchaseText = :printerHeaderPurchaseText"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPrinterHeaderPurchaseReturnText", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.printerHeaderPurchaseReturnText = :printerHeaderPurchaseReturnText"),
    @NamedQuery(name = "CaproErpEmployees_1.findByTaxInWords", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.taxInWords = :taxInWords"),
    @NamedQuery(name = "CaproErpEmployees_1.findByNeedQtyEnterDialog", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.needQtyEnterDialog = :needQtyEnterDialog"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDecimalFormat", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.decimalFormat = :decimalFormat"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyLastPrice", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyLastPrice = :partyLastPrice"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyPriceType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyPriceType = :partyPriceType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyWiseTax", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyWiseTax = :partyWiseTax"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAutoTranslation", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.autoTranslation = :autoTranslation"),
    @NamedQuery(name = "CaproErpEmployees_1.findByProductType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.productType = :productType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMultiUnit", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.multiUnit = :multiUnit"),
    @NamedQuery(name = "CaproErpEmployees_1.findByTaxCutOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.taxCutOption = :taxCutOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByScanAndBill", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.scanAndBill = :scanAndBill"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyBalanceInPrint", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyBalanceInPrint = :partyBalanceInPrint"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCombinedInvoice", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.combinedInvoice = :combinedInvoice"),
    @NamedQuery(name = "CaproErpEmployees_1.findByGlobalTaxType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.globalTaxType = :globalTaxType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByOfflineBilling", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.offlineBilling = :offlineBilling"),
    @NamedQuery(name = "CaproErpEmployees_1.findByFullyOffline", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.fullyOffline = :fullyOffline"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAutoSyncing", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.autoSyncing = :autoSyncing"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDiscountOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.discountOption = :discountOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMaximumDiscountOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.maximumDiscountOption = :maximumDiscountOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDuplicateProductCart", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.duplicateProductCart = :duplicateProductCart"),
    @NamedQuery(name = "CaproErpEmployees_1.findByStockList", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.stockList = :stockList"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPriceList", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.priceList = :priceList"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDisableReviewReceipt", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.disableReviewReceipt = :disableReviewReceipt"),
    @NamedQuery(name = "CaproErpEmployees_1.findByRoundOf", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.roundOf = :roundOf"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdateCalculatedTotal", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updateCalculatedTotal = :updateCalculatedTotal"),
    @NamedQuery(name = "CaproErpEmployees_1.findByFilterOptions", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.filterOptions = :filterOptions"),
    @NamedQuery(name = "CaproErpEmployees_1.findByNeedPaymentGateway", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.needPaymentGateway = :needPaymentGateway"),
    @NamedQuery(name = "CaproErpEmployees_1.findBySplitPayment", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.splitPayment = :splitPayment"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeliveryChargeOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deliveryChargeOption = :deliveryChargeOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDefaultDeliveryCharge", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.defaultDeliveryCharge = :defaultDeliveryCharge"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAssignedProducts", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.assignedProducts = :assignedProducts"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMakeSales", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.makeSales = :makeSales"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMakeSalesReturn", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.makeSalesReturn = :makeSalesReturn"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMakePurchase", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.makePurchase = :makePurchase"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMakePurchaseReturn", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.makePurchaseReturn = :makePurchaseReturn"),
    @NamedQuery(name = "CaproErpEmployees_1.findByMakePayment", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.makePayment = :makePayment"),
    @NamedQuery(name = "CaproErpEmployees_1.findByProductsMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.productsMenu = :productsMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyMenu = :partyMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByExpenseMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.expenseMenu = :expenseMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDaybookMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.daybookMenu = :daybookMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEstimateMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.estimateMenu = :estimateMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByQuotationsMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.quotationsMenu = :quotationsMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPreOrderMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.preOrderMenu = :preOrderMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByStockInMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.stockInMenu = :stockInMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByStockOutMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.stockOutMenu = :stockOutMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByNotificationsMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.notificationsMenu = :notificationsMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCapitalMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.capitalMenu = :capitalMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByCategoryMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.categoryMenu = :categoryMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByBrandMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.brandMenu = :brandMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUnitTypesMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.unitTypesMenu = :unitTypesMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPartyTypesMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.partyTypesMenu = :partyTypesMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByRoutesMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.routesMenu = :routesMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByStockManagementMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.stockManagementMenu = :stockManagementMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByBalanceManagementMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.balanceManagementMenu = :balanceManagementMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeesMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeesMenu = :employeesMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByBranchesMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.branchesMenu = :branchesMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByScanMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.scanMenu = :scanMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAttendanceMenu", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.attendanceMenu = :attendanceMenu"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddProduct", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addProduct = :addProduct"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddParty", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addParty = :addParty"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeleteSales", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deleteSales = :deleteSales"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeletePurchase", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deletePurchase = :deletePurchase"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeletePayment", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deletePayment = :deletePayment"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeleteProduct", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deleteProduct = :deleteProduct"),
    @NamedQuery(name = "CaproErpEmployees_1.findByDeleteParty", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.deleteParty = :deleteParty"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditSales", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editSales = :editSales"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditSalesPrice", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editSalesPrice = :editSalesPrice"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditPurchase", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editPurchase = :editPurchase"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditPurchasePrice", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editPurchasePrice = :editPurchasePrice"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditPayment", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editPayment = :editPayment"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditProduct", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editProduct = :editProduct"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEditParty", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.editParty = :editParty"),
    @NamedQuery(name = "CaproErpEmployees_1.findBySalesReturnOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.salesReturnOption = :salesReturnOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByPurchaseReturnOption", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.purchaseReturnOption = :purchaseReturnOption"),
    @NamedQuery(name = "CaproErpEmployees_1.findByZatcaConfig", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.zatcaConfig = :zatcaConfig"),
    @NamedQuery(name = "CaproErpEmployees_1.findByBranchName", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAdminName", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUserType", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.userType = :userType"),
    @NamedQuery(name = "CaproErpEmployees_1.findByEmployeeStatus", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.employeeStatus = :employeeStatus"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddedUserId", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addedUserId = :addedUserId"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdatedUserId", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpEmployees_1.findByKeywords", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.keywords = :keywords"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddedIpAddress", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddedLatitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddedLongitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByAddedDateTime", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdatedLatitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdatedLongitude", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpEmployees_1.findByUpdatedDateTime", query = "SELECT c FROM CaproErpEmployees_1 c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpEmployees_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "employee_code")
    private String employeeCode;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_name_local")
    private String employeeNameLocal;
    @Column(name = "employee_dob")
    @Temporal(TemporalType.DATE)
    private Date employeeDob;
    @Column(name = "employee_contact_no")
    private String employeeContactNo;
    @Column(name = "employee_whatsapp_no")
    private String employeeWhatsappNo;
    @Column(name = "reg_contact_no")
    private String regContactNo;
    @Column(name = "employee_country_code")
    private String employeeCountryCode;
    @Column(name = "employee_email")
    private String employeeEmail;
    @Column(name = "employee_location")
    private String employeeLocation;
    @Column(name = "employee_latitude")
    private String employeeLatitude;
    @Column(name = "employee_longitude")
    private String employeeLongitude;
    @Column(name = "employee_address")
    private String employeeAddress;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "work_start_time")
    @Temporal(TemporalType.TIME)
    private Date workStartTime;
    @Column(name = "work_end_time")
    @Temporal(TemporalType.TIME)
    private Date workEndTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_salary")
    private Double baseSalary;
    @Column(name = "capital_amount")
    private Double capitalAmount;
    @Column(name = "premium_start_date")
    @Temporal(TemporalType.DATE)
    private Date premiumStartDate;
    @Column(name = "premium_end_date")
    @Temporal(TemporalType.DATE)
    private Date premiumEndDate;
    @Basic(optional = false)
    @Column(name = "login_type")
    private String loginType;
    @Basic(optional = false)
    @Column(name = "default_printer")
    private String defaultPrinter;
    @Basic(optional = false)
    @Column(name = "print_type")
    private String printType;
    @Basic(optional = false)
    @Column(name = "print_bill_as")
    private String printBillAs;
    @Basic(optional = false)
    @Column(name = "access_permission")
    private String accessPermission;
    @Basic(optional = false)
    @Column(name = "printer_header")
    private short printerHeader;
    @Column(name = "printer_header_sales_text")
    private String printerHeaderSalesText;
    @Column(name = "printer_header_sales_return_text")
    private String printerHeaderSalesReturnText;
    @Column(name = "printer_header_purchase_text")
    private String printerHeaderPurchaseText;
    @Column(name = "printer_header_purchase_return_text")
    private String printerHeaderPurchaseReturnText;
    @Column(name = "tax_in_words")
    private String taxInWords;
    @Basic(optional = false)
    @Column(name = "need_qty_enter_dialog")
    private short needQtyEnterDialog;
    @Column(name = "decimal_format")
    private String decimalFormat;
    @Basic(optional = false)
    @Column(name = "party_last_price")
    private short partyLastPrice;
    @Basic(optional = false)
    @Column(name = "party_price_type")
    private boolean partyPriceType;
    @Basic(optional = false)
    @Column(name = "party_wise_tax")
    private short partyWiseTax;
    @Basic(optional = false)
    @Column(name = "auto_translation")
    private short autoTranslation;
    @Basic(optional = false)
    @Column(name = "product_type")
    private short productType;
    @Basic(optional = false)
    @Column(name = "multi_unit")
    private short multiUnit;
    @Basic(optional = false)
    @Column(name = "tax_cut_option")
    private short taxCutOption;
    @Basic(optional = false)
    @Column(name = "scan_and_bill")
    private short scanAndBill;
    @Basic(optional = false)
    @Column(name = "party_balance_in_print")
    private short partyBalanceInPrint;
    @Basic(optional = false)
    @Column(name = "combined_invoice")
    private short combinedInvoice;
    @Basic(optional = false)
    @Column(name = "global_tax_type")
    private String globalTaxType;
    @Basic(optional = false)
    @Column(name = "offline_billing")
    private short offlineBilling;
    @Basic(optional = false)
    @Column(name = "fully_offline")
    private short fullyOffline;
    @Basic(optional = false)
    @Column(name = "auto_syncing")
    private short autoSyncing;
    @Basic(optional = false)
    @Column(name = "discount_option")
    private short discountOption;
    @Basic(optional = false)
    @Column(name = "maximum_discount_option")
    private short maximumDiscountOption;
    @Basic(optional = false)
    @Column(name = "duplicate_product_cart")
    private short duplicateProductCart;
    @Basic(optional = false)
    @Column(name = "stock_list")
    private String stockList;
    @Basic(optional = false)
    @Column(name = "price_list")
    private String priceList;
    @Basic(optional = false)
    @Column(name = "disable_review_receipt")
    private short disableReviewReceipt;
    @Basic(optional = false)
    @Column(name = "round_of")
    private short roundOf;
    @Basic(optional = false)
    @Column(name = "update_calculated_total")
    private short updateCalculatedTotal;
    @Basic(optional = false)
    @Column(name = "filter_options")
    private String filterOptions;
    @Basic(optional = false)
    @Column(name = "need_payment_gateway")
    private short needPaymentGateway;
    @Basic(optional = false)
    @Column(name = "split_payment")
    private short splitPayment;
    @Basic(optional = false)
    @Column(name = "delivery_charge_option")
    private short deliveryChargeOption;
    @Basic(optional = false)
    @Column(name = "default_delivery_charge")
    private double defaultDeliveryCharge;
    @Basic(optional = false)
    @Column(name = "assigned_products")
    private short assignedProducts;
    @Basic(optional = false)
    @Column(name = "make_sales")
    private short makeSales;
    @Basic(optional = false)
    @Column(name = "make_sales_return")
    private short makeSalesReturn;
    @Basic(optional = false)
    @Column(name = "make_purchase")
    private short makePurchase;
    @Basic(optional = false)
    @Column(name = "make_purchase_return")
    private short makePurchaseReturn;
    @Basic(optional = false)
    @Column(name = "make_payment")
    private short makePayment;
    @Basic(optional = false)
    @Column(name = "products_menu")
    private boolean productsMenu;
    @Basic(optional = false)
    @Column(name = "party_menu")
    private boolean partyMenu;
    @Basic(optional = false)
    @Column(name = "expense_menu")
    private boolean expenseMenu;
    @Basic(optional = false)
    @Column(name = "daybook_menu")
    private boolean daybookMenu;
    @Basic(optional = false)
    @Column(name = "estimate_menu")
    private boolean estimateMenu;
    @Basic(optional = false)
    @Column(name = "quotations_menu")
    private boolean quotationsMenu;
    @Basic(optional = false)
    @Column(name = "pre_order_menu")
    private boolean preOrderMenu;
    @Basic(optional = false)
    @Column(name = "stock_in_menu")
    private boolean stockInMenu;
    @Basic(optional = false)
    @Column(name = "stock_out_menu")
    private boolean stockOutMenu;
    @Basic(optional = false)
    @Column(name = "notifications_menu")
    private boolean notificationsMenu;
    @Basic(optional = false)
    @Column(name = "capital_menu")
    private boolean capitalMenu;
    @Basic(optional = false)
    @Column(name = "category_menu")
    private boolean categoryMenu;
    @Basic(optional = false)
    @Column(name = "brand_menu")
    private boolean brandMenu;
    @Basic(optional = false)
    @Column(name = "unit_types_menu")
    private boolean unitTypesMenu;
    @Basic(optional = false)
    @Column(name = "party_types_menu")
    private boolean partyTypesMenu;
    @Basic(optional = false)
    @Column(name = "routes_menu")
    private boolean routesMenu;
    @Basic(optional = false)
    @Column(name = "stock_management_menu")
    private boolean stockManagementMenu;
    @Basic(optional = false)
    @Column(name = "balance_management_menu")
    private boolean balanceManagementMenu;
    @Basic(optional = false)
    @Column(name = "employees_menu")
    private boolean employeesMenu;
    @Basic(optional = false)
    @Column(name = "branches_menu")
    private boolean branchesMenu;
    @Basic(optional = false)
    @Column(name = "scan_menu")
    private boolean scanMenu;
    @Basic(optional = false)
    @Column(name = "attendance_menu")
    private boolean attendanceMenu;
    @Basic(optional = false)
    @Column(name = "add_product")
    private short addProduct;
    @Basic(optional = false)
    @Column(name = "add_party")
    private short addParty;
    @Basic(optional = false)
    @Column(name = "delete_sales")
    private short deleteSales;
    @Basic(optional = false)
    @Column(name = "delete_purchase")
    private short deletePurchase;
    @Basic(optional = false)
    @Column(name = "delete_payment")
    private short deletePayment;
    @Basic(optional = false)
    @Column(name = "delete_product")
    private short deleteProduct;
    @Basic(optional = false)
    @Column(name = "delete_party")
    private short deleteParty;
    @Basic(optional = false)
    @Column(name = "edit_sales")
    private short editSales;
    @Basic(optional = false)
    @Column(name = "edit_sales_price")
    private boolean editSalesPrice;
    @Basic(optional = false)
    @Column(name = "edit_purchase")
    private short editPurchase;
    @Basic(optional = false)
    @Column(name = "edit_purchase_price")
    private boolean editPurchasePrice;
    @Basic(optional = false)
    @Column(name = "edit_payment")
    private short editPayment;
    @Basic(optional = false)
    @Column(name = "edit_product")
    private short editProduct;
    @Basic(optional = false)
    @Column(name = "edit_party")
    private short editParty;
    @Basic(optional = false)
    @Column(name = "sales_return_option")
    private short salesReturnOption;
    @Basic(optional = false)
    @Column(name = "purchase_return_option")
    private short purchaseReturnOption;
    @Basic(optional = false)
    @Column(name = "zatca_config")
    private short zatcaConfig;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "admin_name")
    private String adminName;
    @Basic(optional = false)
    @Column(name = "user_type")
    private short userType;
    @Basic(optional = false)
    @Column(name = "employee_status")
    private short employeeStatus;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeId")
    private Collection<CaproErpRoutes_1> caproErpRoutesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeId")
    private Collection<CaproErpUsers_1> caproErpUsersCollection;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne(optional = false)
    private CaproErpAdmin_1 adminId;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne(optional = false)
    private CaproErpBranches_1 branchId;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne
    private CaproErpCountry_1 countryId;
    @JoinColumn(name = "route_id", referencedColumnName = "route_id")
    @ManyToOne
    private CaproErpRoutes_1 routeId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private CaproErpStates_1 stateId;

    public CaproErpEmployees_1() {
    }

    public CaproErpEmployees_1(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public CaproErpEmployees_1(Integer employeeId, String loginType, String defaultPrinter, String printType, String printBillAs, String accessPermission, short printerHeader, short needQtyEnterDialog, short partyLastPrice, boolean partyPriceType, short partyWiseTax, short autoTranslation, short productType, short multiUnit, short taxCutOption, short scanAndBill, short partyBalanceInPrint, short combinedInvoice, String globalTaxType, short offlineBilling, short fullyOffline, short autoSyncing, short discountOption, short maximumDiscountOption, short duplicateProductCart, String stockList, String priceList, short disableReviewReceipt, short roundOf, short updateCalculatedTotal, String filterOptions, short needPaymentGateway, short splitPayment, short deliveryChargeOption, double defaultDeliveryCharge, short assignedProducts, short makeSales, short makeSalesReturn, short makePurchase, short makePurchaseReturn, short makePayment, boolean productsMenu, boolean partyMenu, boolean expenseMenu, boolean daybookMenu, boolean estimateMenu, boolean quotationsMenu, boolean preOrderMenu, boolean stockInMenu, boolean stockOutMenu, boolean notificationsMenu, boolean capitalMenu, boolean categoryMenu, boolean brandMenu, boolean unitTypesMenu, boolean partyTypesMenu, boolean routesMenu, boolean stockManagementMenu, boolean balanceManagementMenu, boolean employeesMenu, boolean branchesMenu, boolean scanMenu, boolean attendanceMenu, short addProduct, short addParty, short deleteSales, short deletePurchase, short deletePayment, short deleteProduct, short deleteParty, short editSales, boolean editSalesPrice, short editPurchase, boolean editPurchasePrice, short editPayment, short editProduct, short editParty, short salesReturnOption, short purchaseReturnOption, short zatcaConfig, short userType, short employeeStatus) {
        this.employeeId = employeeId;
        this.loginType = loginType;
        this.defaultPrinter = defaultPrinter;
        this.printType = printType;
        this.printBillAs = printBillAs;
        this.accessPermission = accessPermission;
        this.printerHeader = printerHeader;
        this.needQtyEnterDialog = needQtyEnterDialog;
        this.partyLastPrice = partyLastPrice;
        this.partyPriceType = partyPriceType;
        this.partyWiseTax = partyWiseTax;
        this.autoTranslation = autoTranslation;
        this.productType = productType;
        this.multiUnit = multiUnit;
        this.taxCutOption = taxCutOption;
        this.scanAndBill = scanAndBill;
        this.partyBalanceInPrint = partyBalanceInPrint;
        this.combinedInvoice = combinedInvoice;
        this.globalTaxType = globalTaxType;
        this.offlineBilling = offlineBilling;
        this.fullyOffline = fullyOffline;
        this.autoSyncing = autoSyncing;
        this.discountOption = discountOption;
        this.maximumDiscountOption = maximumDiscountOption;
        this.duplicateProductCart = duplicateProductCart;
        this.stockList = stockList;
        this.priceList = priceList;
        this.disableReviewReceipt = disableReviewReceipt;
        this.roundOf = roundOf;
        this.updateCalculatedTotal = updateCalculatedTotal;
        this.filterOptions = filterOptions;
        this.needPaymentGateway = needPaymentGateway;
        this.splitPayment = splitPayment;
        this.deliveryChargeOption = deliveryChargeOption;
        this.defaultDeliveryCharge = defaultDeliveryCharge;
        this.assignedProducts = assignedProducts;
        this.makeSales = makeSales;
        this.makeSalesReturn = makeSalesReturn;
        this.makePurchase = makePurchase;
        this.makePurchaseReturn = makePurchaseReturn;
        this.makePayment = makePayment;
        this.productsMenu = productsMenu;
        this.partyMenu = partyMenu;
        this.expenseMenu = expenseMenu;
        this.daybookMenu = daybookMenu;
        this.estimateMenu = estimateMenu;
        this.quotationsMenu = quotationsMenu;
        this.preOrderMenu = preOrderMenu;
        this.stockInMenu = stockInMenu;
        this.stockOutMenu = stockOutMenu;
        this.notificationsMenu = notificationsMenu;
        this.capitalMenu = capitalMenu;
        this.categoryMenu = categoryMenu;
        this.brandMenu = brandMenu;
        this.unitTypesMenu = unitTypesMenu;
        this.partyTypesMenu = partyTypesMenu;
        this.routesMenu = routesMenu;
        this.stockManagementMenu = stockManagementMenu;
        this.balanceManagementMenu = balanceManagementMenu;
        this.employeesMenu = employeesMenu;
        this.branchesMenu = branchesMenu;
        this.scanMenu = scanMenu;
        this.attendanceMenu = attendanceMenu;
        this.addProduct = addProduct;
        this.addParty = addParty;
        this.deleteSales = deleteSales;
        this.deletePurchase = deletePurchase;
        this.deletePayment = deletePayment;
        this.deleteProduct = deleteProduct;
        this.deleteParty = deleteParty;
        this.editSales = editSales;
        this.editSalesPrice = editSalesPrice;
        this.editPurchase = editPurchase;
        this.editPurchasePrice = editPurchasePrice;
        this.editPayment = editPayment;
        this.editProduct = editProduct;
        this.editParty = editParty;
        this.salesReturnOption = salesReturnOption;
        this.purchaseReturnOption = purchaseReturnOption;
        this.zatcaConfig = zatcaConfig;
        this.userType = userType;
        this.employeeStatus = employeeStatus;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNameLocal() {
        return employeeNameLocal;
    }

    public void setEmployeeNameLocal(String employeeNameLocal) {
        this.employeeNameLocal = employeeNameLocal;
    }

    public Date getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(Date employeeDob) {
        this.employeeDob = employeeDob;
    }

    public String getEmployeeContactNo() {
        return employeeContactNo;
    }

    public void setEmployeeContactNo(String employeeContactNo) {
        this.employeeContactNo = employeeContactNo;
    }

    public String getEmployeeWhatsappNo() {
        return employeeWhatsappNo;
    }

    public void setEmployeeWhatsappNo(String employeeWhatsappNo) {
        this.employeeWhatsappNo = employeeWhatsappNo;
    }

    public String getRegContactNo() {
        return regContactNo;
    }

    public void setRegContactNo(String regContactNo) {
        this.regContactNo = regContactNo;
    }

    public String getEmployeeCountryCode() {
        return employeeCountryCode;
    }

    public void setEmployeeCountryCode(String employeeCountryCode) {
        this.employeeCountryCode = employeeCountryCode;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    public String getEmployeeLatitude() {
        return employeeLatitude;
    }

    public void setEmployeeLatitude(String employeeLatitude) {
        this.employeeLatitude = employeeLatitude;
    }

    public String getEmployeeLongitude() {
        return employeeLongitude;
    }

    public void setEmployeeLongitude(String employeeLongitude) {
        this.employeeLongitude = employeeLongitude;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(Date workStartTime) {
        this.workStartTime = workStartTime;
    }

    public Date getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Date workEndTime) {
        this.workEndTime = workEndTime;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(Double capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public Date getPremiumStartDate() {
        return premiumStartDate;
    }

    public void setPremiumStartDate(Date premiumStartDate) {
        this.premiumStartDate = premiumStartDate;
    }

    public Date getPremiumEndDate() {
        return premiumEndDate;
    }

    public void setPremiumEndDate(Date premiumEndDate) {
        this.premiumEndDate = premiumEndDate;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getDefaultPrinter() {
        return defaultPrinter;
    }

    public void setDefaultPrinter(String defaultPrinter) {
        this.defaultPrinter = defaultPrinter;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getPrintBillAs() {
        return printBillAs;
    }

    public void setPrintBillAs(String printBillAs) {
        this.printBillAs = printBillAs;
    }

    public String getAccessPermission() {
        return accessPermission;
    }

    public void setAccessPermission(String accessPermission) {
        this.accessPermission = accessPermission;
    }

    public short getPrinterHeader() {
        return printerHeader;
    }

    public void setPrinterHeader(short printerHeader) {
        this.printerHeader = printerHeader;
    }

    public String getPrinterHeaderSalesText() {
        return printerHeaderSalesText;
    }

    public void setPrinterHeaderSalesText(String printerHeaderSalesText) {
        this.printerHeaderSalesText = printerHeaderSalesText;
    }

    public String getPrinterHeaderSalesReturnText() {
        return printerHeaderSalesReturnText;
    }

    public void setPrinterHeaderSalesReturnText(String printerHeaderSalesReturnText) {
        this.printerHeaderSalesReturnText = printerHeaderSalesReturnText;
    }

    public String getPrinterHeaderPurchaseText() {
        return printerHeaderPurchaseText;
    }

    public void setPrinterHeaderPurchaseText(String printerHeaderPurchaseText) {
        this.printerHeaderPurchaseText = printerHeaderPurchaseText;
    }

    public String getPrinterHeaderPurchaseReturnText() {
        return printerHeaderPurchaseReturnText;
    }

    public void setPrinterHeaderPurchaseReturnText(String printerHeaderPurchaseReturnText) {
        this.printerHeaderPurchaseReturnText = printerHeaderPurchaseReturnText;
    }

    public String getTaxInWords() {
        return taxInWords;
    }

    public void setTaxInWords(String taxInWords) {
        this.taxInWords = taxInWords;
    }

    public short getNeedQtyEnterDialog() {
        return needQtyEnterDialog;
    }

    public void setNeedQtyEnterDialog(short needQtyEnterDialog) {
        this.needQtyEnterDialog = needQtyEnterDialog;
    }

    public String getDecimalFormat() {
        return decimalFormat;
    }

    public void setDecimalFormat(String decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public short getPartyLastPrice() {
        return partyLastPrice;
    }

    public void setPartyLastPrice(short partyLastPrice) {
        this.partyLastPrice = partyLastPrice;
    }

    public boolean getPartyPriceType() {
        return partyPriceType;
    }

    public void setPartyPriceType(boolean partyPriceType) {
        this.partyPriceType = partyPriceType;
    }

    public short getPartyWiseTax() {
        return partyWiseTax;
    }

    public void setPartyWiseTax(short partyWiseTax) {
        this.partyWiseTax = partyWiseTax;
    }

    public short getAutoTranslation() {
        return autoTranslation;
    }

    public void setAutoTranslation(short autoTranslation) {
        this.autoTranslation = autoTranslation;
    }

    public short getProductType() {
        return productType;
    }

    public void setProductType(short productType) {
        this.productType = productType;
    }

    public short getMultiUnit() {
        return multiUnit;
    }

    public void setMultiUnit(short multiUnit) {
        this.multiUnit = multiUnit;
    }

    public short getTaxCutOption() {
        return taxCutOption;
    }

    public void setTaxCutOption(short taxCutOption) {
        this.taxCutOption = taxCutOption;
    }

    public short getScanAndBill() {
        return scanAndBill;
    }

    public void setScanAndBill(short scanAndBill) {
        this.scanAndBill = scanAndBill;
    }

    public short getPartyBalanceInPrint() {
        return partyBalanceInPrint;
    }

    public void setPartyBalanceInPrint(short partyBalanceInPrint) {
        this.partyBalanceInPrint = partyBalanceInPrint;
    }

    public short getCombinedInvoice() {
        return combinedInvoice;
    }

    public void setCombinedInvoice(short combinedInvoice) {
        this.combinedInvoice = combinedInvoice;
    }

    public String getGlobalTaxType() {
        return globalTaxType;
    }

    public void setGlobalTaxType(String globalTaxType) {
        this.globalTaxType = globalTaxType;
    }

    public short getOfflineBilling() {
        return offlineBilling;
    }

    public void setOfflineBilling(short offlineBilling) {
        this.offlineBilling = offlineBilling;
    }

    public short getFullyOffline() {
        return fullyOffline;
    }

    public void setFullyOffline(short fullyOffline) {
        this.fullyOffline = fullyOffline;
    }

    public short getAutoSyncing() {
        return autoSyncing;
    }

    public void setAutoSyncing(short autoSyncing) {
        this.autoSyncing = autoSyncing;
    }

    public short getDiscountOption() {
        return discountOption;
    }

    public void setDiscountOption(short discountOption) {
        this.discountOption = discountOption;
    }

    public short getMaximumDiscountOption() {
        return maximumDiscountOption;
    }

    public void setMaximumDiscountOption(short maximumDiscountOption) {
        this.maximumDiscountOption = maximumDiscountOption;
    }

    public short getDuplicateProductCart() {
        return duplicateProductCart;
    }

    public void setDuplicateProductCart(short duplicateProductCart) {
        this.duplicateProductCart = duplicateProductCart;
    }

    public String getStockList() {
        return stockList;
    }

    public void setStockList(String stockList) {
        this.stockList = stockList;
    }

    public String getPriceList() {
        return priceList;
    }

    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    public short getDisableReviewReceipt() {
        return disableReviewReceipt;
    }

    public void setDisableReviewReceipt(short disableReviewReceipt) {
        this.disableReviewReceipt = disableReviewReceipt;
    }

    public short getRoundOf() {
        return roundOf;
    }

    public void setRoundOf(short roundOf) {
        this.roundOf = roundOf;
    }

    public short getUpdateCalculatedTotal() {
        return updateCalculatedTotal;
    }

    public void setUpdateCalculatedTotal(short updateCalculatedTotal) {
        this.updateCalculatedTotal = updateCalculatedTotal;
    }

    public String getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(String filterOptions) {
        this.filterOptions = filterOptions;
    }

    public short getNeedPaymentGateway() {
        return needPaymentGateway;
    }

    public void setNeedPaymentGateway(short needPaymentGateway) {
        this.needPaymentGateway = needPaymentGateway;
    }

    public short getSplitPayment() {
        return splitPayment;
    }

    public void setSplitPayment(short splitPayment) {
        this.splitPayment = splitPayment;
    }

    public short getDeliveryChargeOption() {
        return deliveryChargeOption;
    }

    public void setDeliveryChargeOption(short deliveryChargeOption) {
        this.deliveryChargeOption = deliveryChargeOption;
    }

    public double getDefaultDeliveryCharge() {
        return defaultDeliveryCharge;
    }

    public void setDefaultDeliveryCharge(double defaultDeliveryCharge) {
        this.defaultDeliveryCharge = defaultDeliveryCharge;
    }

    public short getAssignedProducts() {
        return assignedProducts;
    }

    public void setAssignedProducts(short assignedProducts) {
        this.assignedProducts = assignedProducts;
    }

    public short getMakeSales() {
        return makeSales;
    }

    public void setMakeSales(short makeSales) {
        this.makeSales = makeSales;
    }

    public short getMakeSalesReturn() {
        return makeSalesReturn;
    }

    public void setMakeSalesReturn(short makeSalesReturn) {
        this.makeSalesReturn = makeSalesReturn;
    }

    public short getMakePurchase() {
        return makePurchase;
    }

    public void setMakePurchase(short makePurchase) {
        this.makePurchase = makePurchase;
    }

    public short getMakePurchaseReturn() {
        return makePurchaseReturn;
    }

    public void setMakePurchaseReturn(short makePurchaseReturn) {
        this.makePurchaseReturn = makePurchaseReturn;
    }

    public short getMakePayment() {
        return makePayment;
    }

    public void setMakePayment(short makePayment) {
        this.makePayment = makePayment;
    }

    public boolean getProductsMenu() {
        return productsMenu;
    }

    public void setProductsMenu(boolean productsMenu) {
        this.productsMenu = productsMenu;
    }

    public boolean getPartyMenu() {
        return partyMenu;
    }

    public void setPartyMenu(boolean partyMenu) {
        this.partyMenu = partyMenu;
    }

    public boolean getExpenseMenu() {
        return expenseMenu;
    }

    public void setExpenseMenu(boolean expenseMenu) {
        this.expenseMenu = expenseMenu;
    }

    public boolean getDaybookMenu() {
        return daybookMenu;
    }

    public void setDaybookMenu(boolean daybookMenu) {
        this.daybookMenu = daybookMenu;
    }

    public boolean getEstimateMenu() {
        return estimateMenu;
    }

    public void setEstimateMenu(boolean estimateMenu) {
        this.estimateMenu = estimateMenu;
    }

    public boolean getQuotationsMenu() {
        return quotationsMenu;
    }

    public void setQuotationsMenu(boolean quotationsMenu) {
        this.quotationsMenu = quotationsMenu;
    }

    public boolean getPreOrderMenu() {
        return preOrderMenu;
    }

    public void setPreOrderMenu(boolean preOrderMenu) {
        this.preOrderMenu = preOrderMenu;
    }

    public boolean getStockInMenu() {
        return stockInMenu;
    }

    public void setStockInMenu(boolean stockInMenu) {
        this.stockInMenu = stockInMenu;
    }

    public boolean getStockOutMenu() {
        return stockOutMenu;
    }

    public void setStockOutMenu(boolean stockOutMenu) {
        this.stockOutMenu = stockOutMenu;
    }

    public boolean getNotificationsMenu() {
        return notificationsMenu;
    }

    public void setNotificationsMenu(boolean notificationsMenu) {
        this.notificationsMenu = notificationsMenu;
    }

    public boolean getCapitalMenu() {
        return capitalMenu;
    }

    public void setCapitalMenu(boolean capitalMenu) {
        this.capitalMenu = capitalMenu;
    }

    public boolean getCategoryMenu() {
        return categoryMenu;
    }

    public void setCategoryMenu(boolean categoryMenu) {
        this.categoryMenu = categoryMenu;
    }

    public boolean getBrandMenu() {
        return brandMenu;
    }

    public void setBrandMenu(boolean brandMenu) {
        this.brandMenu = brandMenu;
    }

    public boolean getUnitTypesMenu() {
        return unitTypesMenu;
    }

    public void setUnitTypesMenu(boolean unitTypesMenu) {
        this.unitTypesMenu = unitTypesMenu;
    }

    public boolean getPartyTypesMenu() {
        return partyTypesMenu;
    }

    public void setPartyTypesMenu(boolean partyTypesMenu) {
        this.partyTypesMenu = partyTypesMenu;
    }

    public boolean getRoutesMenu() {
        return routesMenu;
    }

    public void setRoutesMenu(boolean routesMenu) {
        this.routesMenu = routesMenu;
    }

    public boolean getStockManagementMenu() {
        return stockManagementMenu;
    }

    public void setStockManagementMenu(boolean stockManagementMenu) {
        this.stockManagementMenu = stockManagementMenu;
    }

    public boolean getBalanceManagementMenu() {
        return balanceManagementMenu;
    }

    public void setBalanceManagementMenu(boolean balanceManagementMenu) {
        this.balanceManagementMenu = balanceManagementMenu;
    }

    public boolean getEmployeesMenu() {
        return employeesMenu;
    }

    public void setEmployeesMenu(boolean employeesMenu) {
        this.employeesMenu = employeesMenu;
    }

    public boolean getBranchesMenu() {
        return branchesMenu;
    }

    public void setBranchesMenu(boolean branchesMenu) {
        this.branchesMenu = branchesMenu;
    }

    public boolean getScanMenu() {
        return scanMenu;
    }

    public void setScanMenu(boolean scanMenu) {
        this.scanMenu = scanMenu;
    }

    public boolean getAttendanceMenu() {
        return attendanceMenu;
    }

    public void setAttendanceMenu(boolean attendanceMenu) {
        this.attendanceMenu = attendanceMenu;
    }

    public short getAddProduct() {
        return addProduct;
    }

    public void setAddProduct(short addProduct) {
        this.addProduct = addProduct;
    }

    public short getAddParty() {
        return addParty;
    }

    public void setAddParty(short addParty) {
        this.addParty = addParty;
    }

    public short getDeleteSales() {
        return deleteSales;
    }

    public void setDeleteSales(short deleteSales) {
        this.deleteSales = deleteSales;
    }

    public short getDeletePurchase() {
        return deletePurchase;
    }

    public void setDeletePurchase(short deletePurchase) {
        this.deletePurchase = deletePurchase;
    }

    public short getDeletePayment() {
        return deletePayment;
    }

    public void setDeletePayment(short deletePayment) {
        this.deletePayment = deletePayment;
    }

    public short getDeleteProduct() {
        return deleteProduct;
    }

    public void setDeleteProduct(short deleteProduct) {
        this.deleteProduct = deleteProduct;
    }

    public short getDeleteParty() {
        return deleteParty;
    }

    public void setDeleteParty(short deleteParty) {
        this.deleteParty = deleteParty;
    }

    public short getEditSales() {
        return editSales;
    }

    public void setEditSales(short editSales) {
        this.editSales = editSales;
    }

    public boolean getEditSalesPrice() {
        return editSalesPrice;
    }

    public void setEditSalesPrice(boolean editSalesPrice) {
        this.editSalesPrice = editSalesPrice;
    }

    public short getEditPurchase() {
        return editPurchase;
    }

    public void setEditPurchase(short editPurchase) {
        this.editPurchase = editPurchase;
    }

    public boolean getEditPurchasePrice() {
        return editPurchasePrice;
    }

    public void setEditPurchasePrice(boolean editPurchasePrice) {
        this.editPurchasePrice = editPurchasePrice;
    }

    public short getEditPayment() {
        return editPayment;
    }

    public void setEditPayment(short editPayment) {
        this.editPayment = editPayment;
    }

    public short getEditProduct() {
        return editProduct;
    }

    public void setEditProduct(short editProduct) {
        this.editProduct = editProduct;
    }

    public short getEditParty() {
        return editParty;
    }

    public void setEditParty(short editParty) {
        this.editParty = editParty;
    }

    public short getSalesReturnOption() {
        return salesReturnOption;
    }

    public void setSalesReturnOption(short salesReturnOption) {
        this.salesReturnOption = salesReturnOption;
    }

    public short getPurchaseReturnOption() {
        return purchaseReturnOption;
    }

    public void setPurchaseReturnOption(short purchaseReturnOption) {
        this.purchaseReturnOption = purchaseReturnOption;
    }

    public short getZatcaConfig() {
        return zatcaConfig;
    }

    public void setZatcaConfig(short zatcaConfig) {
        this.zatcaConfig = zatcaConfig;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public short getUserType() {
        return userType;
    }

    public void setUserType(short userType) {
        this.userType = userType;
    }

    public short getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(short employeeStatus) {
        this.employeeStatus = employeeStatus;
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

    public CaproErpCountry_1 getCountryId() {
        return countryId;
    }

    public void setCountryId(CaproErpCountry_1 countryId) {
        this.countryId = countryId;
    }

    public CaproErpRoutes_1 getRouteId() {
        return routeId;
    }

    public void setRouteId(CaproErpRoutes_1 routeId) {
        this.routeId = routeId;
    }

    public CaproErpStates_1 getStateId() {
        return stateId;
    }

    public void setStateId(CaproErpStates_1 stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpEmployees_1)) {
            return false;
        }
        CaproErpEmployees_1 other = (CaproErpEmployees_1) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.model.CaproErpEmployees_1[ employeeId=" + employeeId + " ]";
    }
    
}
