package com.vdhiman.aem.core.components;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.PageFilter;
import org.apache.sling.api.resource.Resource;

import java.util.Iterator;

/**
 * Created by Neha on 09-09-2016.
 */
public class Childcomp extends WCMUse {
    private String listroot;
    Resource pageResource;
    private String child;
    private String Page;

    @Override
    public void activate() throws Exception {

        listroot = child;
        String page = get("pagePath", String.class);
        pageResource = getResourceResolver().resolve(page);
        Page rootPage = pageResource.adaptTo(Page.class);
        System.out.println("Page path is ::: "+page);
        System.out.println("RootPage is ::: " + rootPage.getName());

       /* if (rootPage != null) {
            Iterator<Page> children = rootPage.listChildren(new PageFilter(request));
            while (children.hasNext()) {
                listroot.child = children.next();
                String date = child.getProperties().get("date","");

*/
    }

}

