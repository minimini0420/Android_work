package com.aijava.android_workspace.api;

public class ApiUtils {
    public static SOService getSOService() {
        return RetrolfitClient.getClient().create(SOService.class);
    }
}
