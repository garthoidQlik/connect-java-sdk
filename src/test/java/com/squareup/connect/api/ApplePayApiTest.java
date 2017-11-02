/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.RegisterDomainRequest;
import com.squareup.connect.models.RegisterDomainResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplePayApi
 */
@Ignore
public class ApplePayApiTest {

    private final ApplePayApi api = new ApplePayApi();


    /**
     * RegisterDomain
     *
     * Activates a domain for use with Web Apple Pay and Square. A validation will be performed on this domain by Apple to ensure is it properly set up as an Apple Pay enabled domain.  This endpoint provides an easy way for platform developers to bulk activate Web Apple Pay with Square for merchants using their platform.  To learn more about Apple Pay on Web see the Apple Pay section in the [Embedding the Square Payment Form](https://docs.connect.squareup.com/articles/adding-payment-form) guide.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerDomainTest() throws ApiException {
        RegisterDomainRequest body = null;
        RegisterDomainResponse response = api.registerDomain(body);

        // TODO: test validations
    }

}
