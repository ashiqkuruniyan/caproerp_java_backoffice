/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "capro_erp_products")
@NamedQueries({
    @NamedQuery(name = "CaproErpProducts.findAll", query = "SELECT c FROM CaproErpProducts c"),
    @NamedQuery(name = "CaproErpProducts.findByProductId", query = "SELECT c FROM CaproErpProducts c WHERE c.caproErpProductsPK.productId = :productId"),
    @NamedQuery(name = "CaproErpProducts.findByProductCode", query = "SELECT c FROM CaproErpProducts c WHERE c.productCode = :productCode"),
    @NamedQuery(name = "CaproErpProducts.findByProductName", query = "SELECT c FROM CaproErpProducts c WHERE c.productName = :productName"),
    @NamedQuery(name = "CaproErpProducts.findByProductNameLocal", query = "SELECT c FROM CaproErpProducts c WHERE c.productNameLocal = :productNameLocal"),
    @NamedQuery(name = "CaproErpProducts.findByBarcode", query = "SELECT c FROM CaproErpProducts c WHERE c.caproErpProductsPK.barcode = :barcode"),
    @NamedQuery(name = "CaproErpProducts.findByHsnSacCode", query = "SELECT c FROM CaproErpProducts c WHERE c.hsnSacCode = :hsnSacCode"),
    @NamedQuery(name = "CaproErpProducts.findBySerialNo", query = "SELECT c FROM CaproErpProducts c WHERE c.serialNo = :serialNo"),
    @NamedQuery(name = "CaproErpProducts.findByMrp", query = "SELECT c FROM CaproErpProducts c WHERE c.mrp = :mrp"),
    @NamedQuery(name = "CaproErpProducts.findByBuyPrice", query = "SELECT c FROM CaproErpProducts c WHERE c.buyPrice = :buyPrice"),
    @NamedQuery(name = "CaproErpProducts.findByPrice", query = "SELECT c FROM CaproErpProducts c WHERE c.price = :price"),
    @NamedQuery(name = "CaproErpProducts.findByPrice2", query = "SELECT c FROM CaproErpProducts c WHERE c.price2 = :price2"),
    @NamedQuery(name = "CaproErpProducts.findByPrice3", query = "SELECT c FROM CaproErpProducts c WHERE c.price3 = :price3"),
    @NamedQuery(name = "CaproErpProducts.findByPrice4", query = "SELECT c FROM CaproErpProducts c WHERE c.price4 = :price4"),
    @NamedQuery(name = "CaproErpProducts.findByMinSellingPrice", query = "SELECT c FROM CaproErpProducts c WHERE c.minSellingPrice = :minSellingPrice"),
    @NamedQuery(name = "CaproErpProducts.findByMaxSellingPrice", query = "SELECT c FROM CaproErpProducts c WHERE c.maxSellingPrice = :maxSellingPrice"),
    @NamedQuery(name = "CaproErpProducts.findByCgst", query = "SELECT c FROM CaproErpProducts c WHERE c.cgst = :cgst"),
    @NamedQuery(name = "CaproErpProducts.findByIgst", query = "SELECT c FROM CaproErpProducts c WHERE c.igst = :igst"),
    @NamedQuery(name = "CaproErpProducts.findByTax", query = "SELECT c FROM CaproErpProducts c WHERE c.tax = :tax"),
    @NamedQuery(name = "CaproErpProducts.findByMaximumDiscount", query = "SELECT c FROM CaproErpProducts c WHERE c.maximumDiscount = :maximumDiscount"),
    @NamedQuery(name = "CaproErpProducts.findByDiscountType", query = "SELECT c FROM CaproErpProducts c WHERE c.discountType = :discountType"),
    @NamedQuery(name = "CaproErpProducts.findByDiscountValue", query = "SELECT c FROM CaproErpProducts c WHERE c.discountValue = :discountValue"),
    @NamedQuery(name = "CaproErpProducts.findByStock", query = "SELECT c FROM CaproErpProducts c WHERE c.stock = :stock"),
    @NamedQuery(name = "CaproErpProducts.findByOpeningStock", query = "SELECT c FROM CaproErpProducts c WHERE c.openingStock = :openingStock"),
    @NamedQuery(name = "CaproErpProducts.findByMainStock", query = "SELECT c FROM CaproErpProducts c WHERE c.mainStock = :mainStock"),
    @NamedQuery(name = "CaproErpProducts.findByExpireDate", query = "SELECT c FROM CaproErpProducts c WHERE c.expireDate = :expireDate"),
    @NamedQuery(name = "CaproErpProducts.findByNoOfPurchase", query = "SELECT c FROM CaproErpProducts c WHERE c.noOfPurchase = :noOfPurchase"),
    @NamedQuery(name = "CaproErpProducts.findByNoOfPurchaseReturn", query = "SELECT c FROM CaproErpProducts c WHERE c.noOfPurchaseReturn = :noOfPurchaseReturn"),
    @NamedQuery(name = "CaproErpProducts.findByNoOfSales", query = "SELECT c FROM CaproErpProducts c WHERE c.noOfSales = :noOfSales"),
    @NamedQuery(name = "CaproErpProducts.findByNoOfSalesReturn", query = "SELECT c FROM CaproErpProducts c WHERE c.noOfSalesReturn = :noOfSalesReturn"),
    @NamedQuery(name = "CaproErpProducts.findByNoOfStockTransfer", query = "SELECT c FROM CaproErpProducts c WHERE c.noOfStockTransfer = :noOfStockTransfer"),
    @NamedQuery(name = "CaproErpProducts.findByTaxPercentage", query = "SELECT c FROM CaproErpProducts c WHERE c.taxPercentage = :taxPercentage"),
    @NamedQuery(name = "CaproErpProducts.findByHaveTax", query = "SELECT c FROM CaproErpProducts c WHERE c.haveTax = :haveTax"),
    @NamedQuery(name = "CaproErpProducts.findByTaxInclude", query = "SELECT c FROM CaproErpProducts c WHERE c.taxInclude = :taxInclude"),
    @NamedQuery(name = "CaproErpProducts.findByProductType", query = "SELECT c FROM CaproErpProducts c WHERE c.productType = :productType"),
    @NamedQuery(name = "CaproErpProducts.findByEntityType", query = "SELECT c FROM CaproErpProducts c WHERE c.entityType = :entityType"),
    @NamedQuery(name = "CaproErpProducts.findByKot", query = "SELECT c FROM CaproErpProducts c WHERE c.kot = :kot"),
    @NamedQuery(name = "CaproErpProducts.findByBranchId", query = "SELECT c FROM CaproErpProducts c WHERE c.caproErpProductsPK.branchId = :branchId"),
    @NamedQuery(name = "CaproErpProducts.findByBranchName", query = "SELECT c FROM CaproErpProducts c WHERE c.branchName = :branchName"),
    @NamedQuery(name = "CaproErpProducts.findByProductStatus", query = "SELECT c FROM CaproErpProducts c WHERE c.productStatus = :productStatus"),
    @NamedQuery(name = "CaproErpProducts.findByIsAuxilary", query = "SELECT c FROM CaproErpProducts c WHERE c.isAuxilary = :isAuxilary"),
    @NamedQuery(name = "CaproErpProducts.findByIsMultiUnit", query = "SELECT c FROM CaproErpProducts c WHERE c.isMultiUnit = :isMultiUnit"),
    @NamedQuery(name = "CaproErpProducts.findByAddedDate", query = "SELECT c FROM CaproErpProducts c WHERE c.addedDate = :addedDate"),
    @NamedQuery(name = "CaproErpProducts.findByCurrencyCode", query = "SELECT c FROM CaproErpProducts c WHERE c.currencyCode = :currencyCode"),
    @NamedQuery(name = "CaproErpProducts.findByAdminName", query = "SELECT c FROM CaproErpProducts c WHERE c.adminName = :adminName"),
    @NamedQuery(name = "CaproErpProducts.findByEmployeeName", query = "SELECT c FROM CaproErpProducts c WHERE c.employeeName = :employeeName"),
    @NamedQuery(name = "CaproErpProducts.findByBrandName", query = "SELECT c FROM CaproErpProducts c WHERE c.brandName = :brandName"),
    @NamedQuery(name = "CaproErpProducts.findByCategoryName", query = "SELECT c FROM CaproErpProducts c WHERE c.categoryName = :categoryName"),
    @NamedQuery(name = "CaproErpProducts.findByUnitTypeName", query = "SELECT c FROM CaproErpProducts c WHERE c.unitTypeName = :unitTypeName"),
    @NamedQuery(name = "CaproErpProducts.findByUpdatedUserId", query = "SELECT c FROM CaproErpProducts c WHERE c.updatedUserId = :updatedUserId"),
    @NamedQuery(name = "CaproErpProducts.findByAddedIpAddress", query = "SELECT c FROM CaproErpProducts c WHERE c.addedIpAddress = :addedIpAddress"),
    @NamedQuery(name = "CaproErpProducts.findByAddedLatitude", query = "SELECT c FROM CaproErpProducts c WHERE c.addedLatitude = :addedLatitude"),
    @NamedQuery(name = "CaproErpProducts.findByAddedLongitude", query = "SELECT c FROM CaproErpProducts c WHERE c.addedLongitude = :addedLongitude"),
    @NamedQuery(name = "CaproErpProducts.findByAddedDateTime", query = "SELECT c FROM CaproErpProducts c WHERE c.addedDateTime = :addedDateTime"),
    @NamedQuery(name = "CaproErpProducts.findByUpdatedIpAddress", query = "SELECT c FROM CaproErpProducts c WHERE c.updatedIpAddress = :updatedIpAddress"),
    @NamedQuery(name = "CaproErpProducts.findByUpdatedLatitude", query = "SELECT c FROM CaproErpProducts c WHERE c.updatedLatitude = :updatedLatitude"),
    @NamedQuery(name = "CaproErpProducts.findByUpdatedLongitude", query = "SELECT c FROM CaproErpProducts c WHERE c.updatedLongitude = :updatedLongitude"),
    @NamedQuery(name = "CaproErpProducts.findByUpdatedDateTime", query = "SELECT c FROM CaproErpProducts c WHERE c.updatedDateTime = :updatedDateTime")})
public class CaproErpProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CaproErpProductsPK caproErpProductsPK;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_name_local")
    private String productNameLocal;
    @Column(name = "hsn_sac_code")
    private String hsnSacCode;
    @Column(name = "serial_no")
    private String serialNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "mrp")
    private Double mrp;
    @Column(name = "buy_price")
    private Double buyPrice;
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "price2")
    private Double price2;
    @Column(name = "price3")
    private Double price3;
    @Column(name = "price4")
    private Double price4;
    @Column(name = "min_selling_price")
    private Double minSellingPrice;
    @Column(name = "max_selling_price")
    private Double maxSellingPrice;
    @Column(name = "cgst")
    private Double cgst;
    @Column(name = "igst")
    private Double igst;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "maximum_discount")
    private Double maximumDiscount;
    @Column(name = "discount_type")
    private String discountType;
    @Column(name = "discount_value")
    private Double discountValue;
    @Basic(optional = false)
    @Column(name = "stock")
    private double stock;
    @Column(name = "opening_stock")
    private Double openingStock;
    @Column(name = "main_stock")
    private Double mainStock;
    @Column(name = "expire_date")
    @Temporal(TemporalType.DATE)
    private Date expireDate;
    @Lob
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "no_of_purchase")
    private Integer noOfPurchase;
    @Column(name = "no_of_purchase_return")
    private Integer noOfPurchaseReturn;
    @Column(name = "no_of_sales")
    private Integer noOfSales;
    @Column(name = "no_of_sales_return")
    private Integer noOfSalesReturn;
    @Column(name = "no_of_stock_transfer")
    private Integer noOfStockTransfer;
    @Column(name = "tax_percentage")
    private Double taxPercentage;
    @Column(name = "have_tax")
    private Short haveTax;
    @Column(name = "tax_include")
    private Short taxInclude;
    @Basic(optional = false)
    @Column(name = "product_type")
    private String productType;
    @Column(name = "entity_type")
    private String entityType;
    @Column(name = "kot")
    private Integer kot;
    @Column(name = "branch_name")
    private String branchName;
    @Basic(optional = false)
    @Column(name = "product_status")
    private short productStatus;
    @Column(name = "is_auxilary")
    private Short isAuxilary;
    @Column(name = "is_multi_unit")
    private Short isMultiUnit;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "unit_type_name")
    private String unitTypeName;
    @Column(name = "updated_user_id")
    private Integer updatedUserId;
    @Lob
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
    @JoinColumn(name = "activity_id", referencedColumnName = "activity_id")
    @ManyToOne
    private CaproErpActivities activityId;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @ManyToOne(optional = false)
    private CaproErpAdmin adminId;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CaproErpBranches caproErpBranches;
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    @ManyToOne
    private CaproErpBrands brandId;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne
    private CaproErpCategory categoryId;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(optional = false)
    private CaproErpEmployees employeeId;
    @JoinColumn(name = "unit_type_id", referencedColumnName = "unit_type_id")
    @ManyToOne(optional = false)
    private CaproErpUnitTypes unitTypeId;
    @JoinColumn(name = "added_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private CaproErpUsers addedUserId;

    public CaproErpProducts() {
    }

    public CaproErpProducts(CaproErpProductsPK caproErpProductsPK) {
        this.caproErpProductsPK = caproErpProductsPK;
    }

    public CaproErpProducts(CaproErpProductsPK caproErpProductsPK, String productCode, String productName, BigDecimal price, double stock, String productType, short productStatus) {
        this.caproErpProductsPK = caproErpProductsPK;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.productType = productType;
        this.productStatus = productStatus;
    }

    public CaproErpProducts(int productId, String barcode, int branchId) {
        this.caproErpProductsPK = new CaproErpProductsPK(productId, barcode, branchId);
    }

    public CaproErpProductsPK getCaproErpProductsPK() {
        return caproErpProductsPK;
    }

    public void setCaproErpProductsPK(CaproErpProductsPK caproErpProductsPK) {
        this.caproErpProductsPK = caproErpProductsPK;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNameLocal() {
        return productNameLocal;
    }

    public void setProductNameLocal(String productNameLocal) {
        this.productNameLocal = productNameLocal;
    }

    public String getHsnSacCode() {
        return hsnSacCode;
    }

    public void setHsnSacCode(String hsnSacCode) {
        this.hsnSacCode = hsnSacCode;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    public Double getPrice3() {
        return price3;
    }

    public void setPrice3(Double price3) {
        this.price3 = price3;
    }

    public Double getPrice4() {
        return price4;
    }

    public void setPrice4(Double price4) {
        this.price4 = price4;
    }

    public Double getMinSellingPrice() {
        return minSellingPrice;
    }

    public void setMinSellingPrice(Double minSellingPrice) {
        this.minSellingPrice = minSellingPrice;
    }

    public Double getMaxSellingPrice() {
        return maxSellingPrice;
    }

    public void setMaxSellingPrice(Double maxSellingPrice) {
        this.maxSellingPrice = maxSellingPrice;
    }

    public Double getCgst() {
        return cgst;
    }

    public void setCgst(Double cgst) {
        this.cgst = cgst;
    }

    public Double getIgst() {
        return igst;
    }

    public void setIgst(Double igst) {
        this.igst = igst;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getMaximumDiscount() {
        return maximumDiscount;
    }

    public void setMaximumDiscount(Double maximumDiscount) {
        this.maximumDiscount = maximumDiscount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Double discountValue) {
        this.discountValue = discountValue;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Double getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(Double openingStock) {
        this.openingStock = openingStock;
    }

    public Double getMainStock() {
        return mainStock;
    }

    public void setMainStock(Double mainStock) {
        this.mainStock = mainStock;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getNoOfPurchase() {
        return noOfPurchase;
    }

    public void setNoOfPurchase(Integer noOfPurchase) {
        this.noOfPurchase = noOfPurchase;
    }

    public Integer getNoOfPurchaseReturn() {
        return noOfPurchaseReturn;
    }

    public void setNoOfPurchaseReturn(Integer noOfPurchaseReturn) {
        this.noOfPurchaseReturn = noOfPurchaseReturn;
    }

    public Integer getNoOfSales() {
        return noOfSales;
    }

    public void setNoOfSales(Integer noOfSales) {
        this.noOfSales = noOfSales;
    }

    public Integer getNoOfSalesReturn() {
        return noOfSalesReturn;
    }

    public void setNoOfSalesReturn(Integer noOfSalesReturn) {
        this.noOfSalesReturn = noOfSalesReturn;
    }

    public Integer getNoOfStockTransfer() {
        return noOfStockTransfer;
    }

    public void setNoOfStockTransfer(Integer noOfStockTransfer) {
        this.noOfStockTransfer = noOfStockTransfer;
    }

    public Double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Short getHaveTax() {
        return haveTax;
    }

    public void setHaveTax(Short haveTax) {
        this.haveTax = haveTax;
    }

    public Short getTaxInclude() {
        return taxInclude;
    }

    public void setTaxInclude(Short taxInclude) {
        this.taxInclude = taxInclude;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getKot() {
        return kot;
    }

    public void setKot(Integer kot) {
        this.kot = kot;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public short getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(short productStatus) {
        this.productStatus = productStatus;
    }

    public Short getIsAuxilary() {
        return isAuxilary;
    }

    public void setIsAuxilary(Short isAuxilary) {
        this.isAuxilary = isAuxilary;
    }

    public Short getIsMultiUnit() {
        return isMultiUnit;
    }

    public void setIsMultiUnit(Short isMultiUnit) {
        this.isMultiUnit = isMultiUnit;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUnitTypeName() {
        return unitTypeName;
    }

    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
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

    public CaproErpActivities getActivityId() {
        return activityId;
    }

    public void setActivityId(CaproErpActivities activityId) {
        this.activityId = activityId;
    }

    public CaproErpAdmin getAdminId() {
        return adminId;
    }

    public void setAdminId(CaproErpAdmin adminId) {
        this.adminId = adminId;
    }

    public CaproErpBranches getCaproErpBranches() {
        return caproErpBranches;
    }

    public void setCaproErpBranches(CaproErpBranches caproErpBranches) {
        this.caproErpBranches = caproErpBranches;
    }

    public CaproErpBrands getBrandId() {
        return brandId;
    }

    public void setBrandId(CaproErpBrands brandId) {
        this.brandId = brandId;
    }

    public CaproErpCategory getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CaproErpCategory categoryId) {
        this.categoryId = categoryId;
    }

    public CaproErpEmployees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(CaproErpEmployees employeeId) {
        this.employeeId = employeeId;
    }

    public CaproErpUnitTypes getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(CaproErpUnitTypes unitTypeId) {
        this.unitTypeId = unitTypeId;
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
        hash += (caproErpProductsPK != null ? caproErpProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpProducts)) {
            return false;
        }
        CaproErpProducts other = (CaproErpProducts) object;
        if ((this.caproErpProductsPK == null && other.caproErpProductsPK != null) || (this.caproErpProductsPK != null && !this.caproErpProductsPK.equals(other.caproErpProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpProducts[ caproErpProductsPK=" + caproErpProductsPK + " ]";
    }
    
}
