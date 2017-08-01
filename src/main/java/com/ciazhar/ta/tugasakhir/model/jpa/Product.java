package com.ciazhar.ta.tugasakhir.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by ciazhar on 8/1/17.
 */

@Entity
public class Product {

    @Id
    @Column(name = "PK", length = 11)
    private int pk;

    @Column(name = "ProductCode", length = 11)
    private int productCode;

    @Column(name = "ProductName", length = 100)
    private String productName;

    @Column(name = "noproduct", length = 50)
    private String noProduct;

    @Column(name = "hargabeli", length = 10)
    private double hargaBeli;

    @Column(name = "hargajual", length = 10)
    private double hargaJual;

    @Column(length = 11)
    private int stock;

    @Column(length = 50)
    private String nmCabang;

    @Column(length = 7)
    private String status;

    @Column(name = "expireddate", length = 20)
    private String expiredDate;

    @Column(length = 5)
    private int kdCabang;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNoProduct() {
        return noProduct;
    }

    public void setNoProduct(String noProduct) {
        this.noProduct = noProduct;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNmCabang() {
        return nmCabang;
    }

    public void setNmCabang(String nmCabang) {
        this.nmCabang = nmCabang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getKdCabang() {
        return kdCabang;
    }

    public void setKdCabang(int kdCabang) {
        this.kdCabang = kdCabang;
    }
}
