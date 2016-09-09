package com.vdhiman.aem.core.components.newsinformation;
import com.adobe.cq.sightly.WCMUse;

public class Newsinformation extends WCMUse {
    private String pagePath;


    @Override
    public void activate() throws Exception {
        pagePath = getCurrentPage().getPath();
    }
    public String getPagePath() {
        return pagePath;
    }
}
