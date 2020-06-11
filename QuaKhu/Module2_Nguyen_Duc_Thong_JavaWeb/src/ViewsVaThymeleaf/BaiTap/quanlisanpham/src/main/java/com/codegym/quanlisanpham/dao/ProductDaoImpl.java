package com.codegym.quanlisanpham.dao;

import com.codegym.quanlisanpham.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class ProductDaoImpl implements ProductDao {
        private static Map<Integer, Product> products;

        static {

            products = new HashMap<>();
            products.put(2, new Product(2, "Quy", 10, 1));
            products.put(3, new Product(3, "Hon", 20, 2));
            products.put(4, new Product(4, "Cuc", 30, 3));
            products.put(5, new Product(5, "Lac", 40, 4));
            products.put(6, new Product(6, "codegym", 50, 5));
        }

        @Override
        public List<Product> findAll() {
            return new ArrayList<>(products.values());
        }

        @Override
        public void save(Product product) {

            products.put(product.getId(), product);
        }

        @Override
        public Product findById(int id) {
            return products.get(id);
        }

        @Override
        public void update(int id, Product product) {
            products.put(id, product);

        }

        @Override
        public void remove(int id) {
            products.remove(id);
        }
    }

