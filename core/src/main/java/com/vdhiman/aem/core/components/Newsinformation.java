package com.vdhiman.aem.core.components;

/**
 * Created by Neha on 08-09-2016.
 */
    import com.adobe.cq.sightly.WCMUse;

    import java.util.Arrays;
    import java.util.List;

public class Newsinformation extends WCMUse {
        private String pagePath;
        private String lowerCaseTitle;
        private String lowerCaseDescription;

        private List prop;

        @Override
        public void activate() throws Exception {
            pagePath = getCurrentPage().getPath();
            lowerCaseTitle = getProperties().get("newstitle", "").toLowerCase();
            lowerCaseDescription = getProperties().get("publishdate", "").toLowerCase();
            String tempProp[] = (String[])getProperties().get("pages");
            prop = Arrays.asList(tempProp);
        }
        public String getPagePath() {
            return pagePath;
        }
    public String getLowerCaseTitle() {
        return lowerCaseTitle;
    }

    public String getLowerCaseDescription() {
        return lowerCaseDescription;
    }

    public List getProp() {
        return prop;
    }
    }