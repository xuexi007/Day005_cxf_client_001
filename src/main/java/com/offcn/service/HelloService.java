package com.offcn.service;

import javax.jws.WebService;

@WebService
public interface HelloService {
    public String sayHello(String name);
}
