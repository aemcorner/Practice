package com.vdhiman.aem.core.components;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vivek.dhiman on 08-09-2016.
 */
public class PracticeImpl extends  WCMUse {

    private String pagePath;
    private List<String> pageNames;
    private List<String> createdBy;

    @Override
    public void activate() throws Exception {
        pagePath = getProperties().get("pagepath","");
        Resource rootPage = getResourceResolver().resolve(pagePath);
        Page mypage = rootPage.adaptTo(Page.class);
        Iterator<Page> iterator = mypage.listChildren();
        pageNames = new ArrayList<String>();
        createdBy = new ArrayList<String>();
        while(iterator.hasNext()){
           Page childPage = iterator.next();
           pageNames.add(childPage.getName());
           createdBy.add(childPage.getProperties().get("jcr:created").toString());
        }
        System.out.println("Size is ::: "+pageNames.size());
    }
    public String getPagePath() {
        return pagePath;
    }
    public List<String> getPageNames() {
        return pageNames;
    }
    public List<String> getCreatedBy() {
        return createdBy;
    }


}