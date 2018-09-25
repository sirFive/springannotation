package com.xie.study.annotation05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XieService {

    @Autowired
    private XieDao xieDao;

    public XieDao getXieDao(){
        return  xieDao;
    }
}
