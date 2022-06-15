package com.example.retestcsw.Resource;

import com.example.retestcsw.entity.Product;

import java.util.List;

public interface ProductModel {
    Product save (Product product);
    Product update (Product product,int id);
    List<Product> findall ();
    Product findbyid (int id);
}
