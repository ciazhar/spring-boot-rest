package com.ciazhar.ta.tugasakhir.controller;

import com.ciazhar.ta.tugasakhir.dao.ProductDao;
import com.ciazhar.ta.tugasakhir.model.jpa.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ciazhar on 8/1/17.
 */

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired private ProductDao productDao;

    @RequestMapping("/product/list")
    public Page<Product> daftarProduct (Pageable pageable){
        return productDao.findAll(pageable);
    }
}
