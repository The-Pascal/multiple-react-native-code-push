package com.microsoft.codepush.react;

import android.content.Context;

public class CodePushBuilder {
    private String mDeploymentKey;
    private Context mContext;

    private boolean mIsDebugMode;
    private String mServerUrl;
    private Integer mPublicKeyResourceDescriptor;
    private String mType;
    
    public CodePushBuilder(String type, String deploymentKey, Context context) {
        this.mDeploymentKey = deploymentKey;
        this.mContext = context;
        this.mServerUrl = CodePush.getServiceUrl();
        this.mType = type;
    }

    public CodePushBuilder setIsDebugMode(boolean isDebugMode) {
        this.mIsDebugMode = isDebugMode;
        return this;
    }

    public CodePushBuilder setServerUrl(String serverUrl) {
        this.mServerUrl = serverUrl;
        return this;
    }

    public CodePushBuilder setPublicKeyResourceDescriptor(int publicKeyResourceDescriptor) {
        this.mPublicKeyResourceDescriptor = publicKeyResourceDescriptor;
        return this;
    }

    public CodePush build() {
        return new CodePush(this.mType, this.mDeploymentKey, this.mContext, this.mIsDebugMode, this.mServerUrl, this.mPublicKeyResourceDescriptor);
    }
}
