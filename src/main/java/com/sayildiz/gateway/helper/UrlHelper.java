package com.sayildiz.gateway.helper;

import org.springframework.stereotype.Service;

@Service
public class UrlHelper {

    public String createUrl(String host, String port, String api){
        return String.format("%s:%s/%s", host, port, api);
    }

    public String createUrl(String host, String port, String api, String suffix){
        return String.format("%s:%s/%s/%s", host, port, api, suffix);
    }
}
