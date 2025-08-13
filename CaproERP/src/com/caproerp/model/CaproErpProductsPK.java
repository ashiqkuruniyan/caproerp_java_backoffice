/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author DELL
 */
@Embeddable
public class CaproErpProductsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "barcode")
    private String barcode;
    @Basic(optional = false)
    @Column(name = "branch_id")
    private int branchId;

    public CaproErpProductsPK() {
    }

    public CaproErpProductsPK(int productId, String barcode, int branchId) {
        this.productId = productId;
        this.barcode = barcode;
        this.branchId = branchId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productId;
        hash += (barcode != null ? barcode.hashCode() : 0);
        hash += (int) branchId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaproErpProductsPK)) {
            return false;
        }
        CaproErpProductsPK other = (CaproErpProductsPK) object;
        if (this.productId != other.productId) {
            return false;
        }
        if ((this.barcode == null && other.barcode != null) || (this.barcode != null && !this.barcode.equals(other.barcode))) {
            return false;
        }
        if (this.branchId != other.branchId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caproerp.products.model.CaproErpProductsPK[ productId=" + productId + ", barcode=" + barcode + ", branchId=" + branchId + " ]";
    }
    
}
