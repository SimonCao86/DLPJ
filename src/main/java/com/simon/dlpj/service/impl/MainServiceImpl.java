package com.simon.dlpj.service.impl;

import com.simon.dlpj.service.MainService;
import org.springframework.stereotype.Service;

/**
 * Created by caoyang on 2022-08-25
 **/
@Service
public class MainServiceImpl implements MainService {
    @Override
    public String service() {
        return "Foo Service";
    }
}
