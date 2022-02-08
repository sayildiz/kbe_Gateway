package com.sayildiz.gateway.calculator_api.service;

import com.sayildiz.gateway.calculator_api.model.Price;

import java.math.BigDecimal;

public interface CalculatorService {
    Price getPrice(BigDecimal price);
}
