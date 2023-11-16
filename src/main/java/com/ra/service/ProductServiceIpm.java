package com.ra.service;

import com.ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceIpm implements IGeneric<Product, Integer> {
    static List<Product> list = new ArrayList<>();

    static {
        Product product = new Product(1, "iphone15", 300, "mới");
        Product product2 = new Product(2, "ipab", 350, "mới");
        Product product3 = new Product(3, "samsungS23Ultra", 350, "mới");
        list.add(product);
        list.add(product2);
        list.add(product3);
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Boolean save(Product product) {


        return list.add(product);
    }

    @Override
    public Product findId(Integer id) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Boolean update(Product product, Integer id) {
        int index = findIndex(id);
        if (index != 1) {
            list.set(index, product);
            return true;
        }
        return false;
    }

    @Override
    public void delete(Integer id) {
        list.remove(findId(id));
    }

    public int findIndex(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
