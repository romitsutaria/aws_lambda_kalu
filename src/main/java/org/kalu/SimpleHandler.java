package org.kalu;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleHandler implements RequestHandler<String,String> {

    public String handleRequest(String input, Context context) {
        System.out.println("JDK Version: " + System.getProperty("java.version"));
        return input.toUpperCase();
    }

}