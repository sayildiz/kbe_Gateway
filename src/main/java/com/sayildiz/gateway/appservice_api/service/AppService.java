package com.sayildiz.gateway.appservice_api.service;

import com.sayildiz.gateway.appservice_api.model.Product;
import com.sayildiz.gateway.appservice_api.model.ProductDetails;

import java.util.List;
import java.util.UUID;

public interface AppService {

     List<Product> getProductList();
     ProductDetails getProductDetails(UUID uuid);
}
