package com.pcloud.sdk.internal;

import com.pcloud.sdk.ApiClient;
import com.pcloud.sdk.ApiClientV2;
import com.pcloud.sdk.Authenticator;

import java.util.concurrent.Callable;

public class InternalV2 {

    private InternalV2() {
        // Instances are not allowed.
    }

    public static ApiClientV2.BuilderV2 newBuilder(){
        return new RealApiServiceBuilderV2();
    }

    public static Authenticator createOAuthAuthenticator(Callable<String> tokenProvider){
        return new AccessTokenAuthenticator(tokenProvider);
    }
}
