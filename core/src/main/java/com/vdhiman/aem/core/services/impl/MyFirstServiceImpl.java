package com.vdhiman.aem.core.services.impl;

import com.vdhiman.aem.core.services.MyFirstService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

/**
 * Created by Vivek Dhiman on 9/11/2016.
 */
@Component
@Service(value = MyFirstService.class)
public class MyFirstServiceImpl implements MyFirstService {

    @Override
    public String getGreetings(String str){
        return "Marry Chritmas for year "+str;
    }

}
