package com.dubbo.service.impl;

import com.dubbo.service.IProviderService;

/**
 * <p>Description:</p>
 * <p>com.dubbo.service.impl</p>
 *
 * @author smartdt
 * @version 1.0
 * @date 2018/5/21
 */
public class ProviderServiceImpl implements IProviderService {
    public String getString() {
        return "Hello Dubbo~";
    }
}
