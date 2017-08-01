package com.ciazhar.ta.tugasakhir.dao;

import com.ciazhar.ta.tugasakhir.model.jpa.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ciazhar on 8/1/17.
 */
public interface ProductDao extends PagingAndSortingRepository <Product,String>{

}
