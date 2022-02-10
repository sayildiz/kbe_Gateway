package com.sayildiz.gateway.controller;

import com.sayildiz.gateway.appservice_api.model.ProductDTO;
import com.sayildiz.gateway.appservice_api.model.ProductDetails;
import com.sayildiz.gateway.appservice_api.service.AppService;
import com.sayildiz.gateway.calculator_api.model.Price;
import com.sayildiz.gateway.calculator_api.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
//set to angular port
@CrossOrigin(origins = "http://localhost:4200")
public class GatewayController {
    private static final Logger logger = LoggerFactory.getLogger(GatewayController.class);

    private final CalculatorService calcService;
    private final AppService appService;

    public GatewayController(CalculatorService calcService, AppService appService) {
        this.calcService = calcService;
        this.appService = appService;
    }

    @GetMapping("/product")
    public List<ProductDTO> getProductList(){
        return appService.getProductList();
    }

    @GetMapping("/product/{uuid}")
    public ProductDetails getProductDetailsByUUID(@PathVariable UUID uuid){
        return appService.getProductDetails(uuid);
    }

    @PostMapping("/vat")
    Price calculateTax(@RequestBody BigDecimal netPrice){
        return calcService.getPrice(netPrice);

    }
}
