package com.sayildiz.gateway.appservice_api.service;

import com.sayildiz.gateway.appservice_api.model.Product;
import com.sayildiz.gateway.appservice_api.model.ProductDetails;
import com.sayildiz.gateway.helper.UrlHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class AppServiceImpl implements AppService {

    @Value("${appService.host}")
    private String appServiceHost;

    @Value("${appService.port}")
    private String appServicePort;

    @Value("${appService.api}")
    private String appServiceAPI;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UrlHelper urlHelper;

    private final Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);

    @Override
    public List<Product> getProductList() {
        String url = urlHelper.createUrl(appServiceHost, appServicePort, appServiceAPI);
        Product[] response = restTemplate.getForObject(url, Product[].class);
        logger.warn(Arrays.toString(response));
        return Arrays.asList(Objects.requireNonNull(response));
    }

    @Override
    public ProductDetails getProductDetails(UUID uuid) {
        String url = urlHelper.createUrl(appServiceHost, appServicePort, appServiceAPI, uuid.toString());
        return restTemplate.getForObject(url, ProductDetails.class);
    }
}
