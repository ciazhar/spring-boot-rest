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

}
