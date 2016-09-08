package com.vdhiman.aem.core.components;

import com.adobe.cq.sightly.WCMUse;

/**
 * Created by vivek.dhiman on 08-09-2016.
 */
public class PracticeImpl extends  WCMUse {

    private String pagePath;

    private String heading;

    @Override
    public void activate() throws Exception {
        heading = getProperties().get("heading","").toUpperCase();
        pagePath = getCurrentPage().getPath();
    }

    public String getPagePath() {
        return pagePath;
    }

    public String getHeading() {
        return heading;
    }
}