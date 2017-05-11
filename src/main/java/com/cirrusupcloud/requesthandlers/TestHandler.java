package com.cirrusupcloud.requesthandlers;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.HttpResponse;

/**
 * Basic extension of {@link RequestHandler2} used for testing this feature.
 */
public class TestHandler extends RequestHandler2 {

    @Override
    public AmazonWebServiceRequest beforeMarshalling(AmazonWebServiceRequest request) {

        System.out.println("beforeMarshalling");
        return request;
    }

    @Override
    public void beforeRequest(Request<?> request) {

        System.out.println("beforeRequest");
    }

    @Override
    public HttpResponse beforeUnmarshalling(Request<?> request, HttpResponse httpResponse) {

        System.out.println("beforeUnmarshalling");
        return httpResponse;
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {

        System.out.println("afterResponse");
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {

        System.out.println("afterError");
    }
}
