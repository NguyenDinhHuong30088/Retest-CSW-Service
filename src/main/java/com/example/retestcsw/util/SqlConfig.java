package com.example.retestcsw.util;

public class SqlConfig {

    //  Product
    public static final String INSERT_PRODUCT = "INSERT INTO product (name,price,quantity) VALUES (?,?,?)";
    public static final String LIST_PRODUCT = "SELECT * FROM product";
    public static final String UPDATE_PRODUCT =
            "UPDATE product SET Id=?,name=?,price=?, quantity=? WHERE Id = ?";
    public static final String DETAIL_PRODUCT = "select * from product where Id = ?";

}
