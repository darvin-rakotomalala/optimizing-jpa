package com.poc.service.metier;

import com.poc.model.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductSM {
    Product getProductById(Long productId);
    void updateProduct(Long productId, Product updatedProduct);
    Product updateProductById(Long productId, Product updatedProduct);
    List<Product> getByPriceBetween(double minPrice, double maxPrice);
    Page<Product> getByCategory(String category, Pageable pageable);
}
