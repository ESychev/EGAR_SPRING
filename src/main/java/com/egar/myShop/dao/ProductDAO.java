package com.egar.myShop.dao;

import com.egar.myShop.entity.Product;

import java.util.List;

public interface ProductDAO {
    // create
    void add(Product product);

    // read
    List<Product> getAll();

    Product getById(long productId);

    // update
    void update(Product product);

    // delete
    void remove(Product product);
}
