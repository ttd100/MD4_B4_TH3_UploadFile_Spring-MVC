package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"star","star","image"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id,Product product) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p=product;
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void remote(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }
}
