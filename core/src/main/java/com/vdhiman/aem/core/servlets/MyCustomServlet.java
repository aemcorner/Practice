package com.vdhiman.aem.core.servlets;

import com.vdhiman.aem.core.services.MyFirstService;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Vivek Dhiman on 9/11/2016.
 */
@SlingServlet(
        resourceTypes = "sling/servlet/default",
       // paths = {"/bin/servlets"},
        selectors = "hello",
        extensions = "html",
        methods = "GET")
public class MyCustomServlet extends SlingSafeMethodsServlet {

    @Reference
    private MyFirstService myFirstService;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello Gudiya");
        out.println(myFirstService.getGreetings("2016"));
    }
}
