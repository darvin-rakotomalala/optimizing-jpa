package com.poc.service.metier;

import com.poc.model.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductRSMImpl implements ProductRSM {

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> getByPriceBetween(double minPrice, double maxPrice) {
        return null;
    }

    @Override
    public Page<Product> getByCategory(String category, Pageable pageable) {
        return null;
    }
}
