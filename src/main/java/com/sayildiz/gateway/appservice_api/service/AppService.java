package com.sayildiz.gateway.appservice_api.service;

import com.sayildiz.gateway.appservice_api.model.ProductDTO;
import com.sayildiz.gateway.appservice_api.model.ProductDetails;

import java.util.List;
import java.util.UUID;

public interface AppService {

     List<ProductDTO> getProductList();
     ProductDetails getProductDetails(UUID uuid);
}
