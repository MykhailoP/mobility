package com.allane.mobility.services;

import org.jooq.DSLContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final DSLContext context;


    @Autowired
    public UserService(DSLContext context) {
        this.context = context;
    }


}
