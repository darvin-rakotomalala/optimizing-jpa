package com.poc.service.metier;

import com.poc.model.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ProductSMImpl implements ProductSM {

    @Override
    @Cacheable("products")
    public Product getProductById(Long productId) {
        // Simulate fetching data from the database
        // return repository.fetchProductById(productId);
        return null;
    }

    @Override
    @CacheEvict(value = "products", key = "#productId")
    public void updateProduct(Long productId, Product updatedProduct) {
        // Simulate updating data in the database
        // repository.updateProduct(productId, updatedProduct);
    }

    @Override
    @CachePut(value = "products", key = "#productId")
    public Product updateProductById(Long productId, Product updatedProduct) {
        // Simulate updating data in the database
        // repository.updateProduct(productId, updatedProduct);
        return updatedProduct;
    }

    @Override
    public List<Product> getByPriceBetween(double minPrice, double maxPrice) {
        // Simulate getByPriceBetween data in the database
        // repository.getByPriceBetween(minPrice, maxPrice);
        return null;
    }

    @Override
    public Page<Product> getByCategory(String category, Pageable pageable) {
        // Simulate getByCategory Pageable data in the database
        // repository.getByPriceBetween(minPrice, maxPrice);
        // Pageable  pageable  = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy).descending());
        return null;
    }
}
