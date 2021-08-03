/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.functions.v1;

import static com.google.cloud.functions.v1.CloudFunctionsServiceClient.ListFunctionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.functions.v1.stub.CloudFunctionsServiceStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CloudFunctionsServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (cloudfunctions.googleapis.com) and default port (443) are
 *       used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getFunction to 30 seconds:
 *
 * <pre>{@code
 * CloudFunctionsServiceSettings.Builder cloudFunctionsServiceSettingsBuilder =
 *     CloudFunctionsServiceSettings.newBuilder();
 * cloudFunctionsServiceSettingsBuilder
 *     .getFunctionSettings()
 *     .setRetrySettings(
 *         cloudFunctionsServiceSettingsBuilder
 *             .getFunctionSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CloudFunctionsServiceSettings cloudFunctionsServiceSettings =
 *     cloudFunctionsServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CloudFunctionsServiceSettings extends ClientSettings<CloudFunctionsServiceSettings> {

  /** Returns the object with the settings used for calls to listFunctions. */
  public PagedCallSettings<ListFunctionsRequest, ListFunctionsResponse, ListFunctionsPagedResponse>
      listFunctionsSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).listFunctionsSettings();
  }

  /** Returns the object with the settings used for calls to getFunction. */
  public UnaryCallSettings<GetFunctionRequest, CloudFunction> getFunctionSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).getFunctionSettings();
  }

  /** Returns the object with the settings used for calls to createFunction. */
  public UnaryCallSettings<CreateFunctionRequest, Operation> createFunctionSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).createFunctionSettings();
  }

  /** Returns the object with the settings used for calls to createFunction. */
  public OperationCallSettings<CreateFunctionRequest, CloudFunction, OperationMetadataV1>
      createFunctionOperationSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings())
        .createFunctionOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateFunction. */
  public UnaryCallSettings<UpdateFunctionRequest, Operation> updateFunctionSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).updateFunctionSettings();
  }

  /** Returns the object with the settings used for calls to updateFunction. */
  public OperationCallSettings<UpdateFunctionRequest, CloudFunction, OperationMetadataV1>
      updateFunctionOperationSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings())
        .updateFunctionOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteFunction. */
  public UnaryCallSettings<DeleteFunctionRequest, Operation> deleteFunctionSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).deleteFunctionSettings();
  }

  /** Returns the object with the settings used for calls to deleteFunction. */
  public OperationCallSettings<DeleteFunctionRequest, Empty, OperationMetadataV1>
      deleteFunctionOperationSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings())
        .deleteFunctionOperationSettings();
  }

  /** Returns the object with the settings used for calls to callFunction. */
  public UnaryCallSettings<CallFunctionRequest, CallFunctionResponse> callFunctionSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).callFunctionSettings();
  }

  /** Returns the object with the settings used for calls to generateUploadUrl. */
  public UnaryCallSettings<GenerateUploadUrlRequest, GenerateUploadUrlResponse>
      generateUploadUrlSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).generateUploadUrlSettings();
  }

  /** Returns the object with the settings used for calls to generateDownloadUrl. */
  public UnaryCallSettings<GenerateDownloadUrlRequest, GenerateDownloadUrlResponse>
      generateDownloadUrlSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).generateDownloadUrlSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((CloudFunctionsServiceStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final CloudFunctionsServiceSettings create(CloudFunctionsServiceStubSettings stub)
      throws IOException {
    return new CloudFunctionsServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CloudFunctionsServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CloudFunctionsServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CloudFunctionsServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CloudFunctionsServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CloudFunctionsServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CloudFunctionsServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CloudFunctionsServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected CloudFunctionsServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CloudFunctionsServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<CloudFunctionsServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CloudFunctionsServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(CloudFunctionsServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CloudFunctionsServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CloudFunctionsServiceStubSettings.newBuilder());
    }

    public CloudFunctionsServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CloudFunctionsServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listFunctions. */
    public PagedCallSettings.Builder<
            ListFunctionsRequest, ListFunctionsResponse, ListFunctionsPagedResponse>
        listFunctionsSettings() {
      return getStubSettingsBuilder().listFunctionsSettings();
    }

    /** Returns the builder for the settings used for calls to getFunction. */
    public UnaryCallSettings.Builder<GetFunctionRequest, CloudFunction> getFunctionSettings() {
      return getStubSettingsBuilder().getFunctionSettings();
    }

    /** Returns the builder for the settings used for calls to createFunction. */
    public UnaryCallSettings.Builder<CreateFunctionRequest, Operation> createFunctionSettings() {
      return getStubSettingsBuilder().createFunctionSettings();
    }

    /** Returns the builder for the settings used for calls to createFunction. */
    public OperationCallSettings.Builder<CreateFunctionRequest, CloudFunction, OperationMetadataV1>
        createFunctionOperationSettings() {
      return getStubSettingsBuilder().createFunctionOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateFunction. */
    public UnaryCallSettings.Builder<UpdateFunctionRequest, Operation> updateFunctionSettings() {
      return getStubSettingsBuilder().updateFunctionSettings();
    }

    /** Returns the builder for the settings used for calls to updateFunction. */
    public OperationCallSettings.Builder<UpdateFunctionRequest, CloudFunction, OperationMetadataV1>
        updateFunctionOperationSettings() {
      return getStubSettingsBuilder().updateFunctionOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFunction. */
    public UnaryCallSettings.Builder<DeleteFunctionRequest, Operation> deleteFunctionSettings() {
      return getStubSettingsBuilder().deleteFunctionSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFunction. */
    public OperationCallSettings.Builder<DeleteFunctionRequest, Empty, OperationMetadataV1>
        deleteFunctionOperationSettings() {
      return getStubSettingsBuilder().deleteFunctionOperationSettings();
    }

    /** Returns the builder for the settings used for calls to callFunction. */
    public UnaryCallSettings.Builder<CallFunctionRequest, CallFunctionResponse>
        callFunctionSettings() {
      return getStubSettingsBuilder().callFunctionSettings();
    }

    /** Returns the builder for the settings used for calls to generateUploadUrl. */
    public UnaryCallSettings.Builder<GenerateUploadUrlRequest, GenerateUploadUrlResponse>
        generateUploadUrlSettings() {
      return getStubSettingsBuilder().generateUploadUrlSettings();
    }

    /** Returns the builder for the settings used for calls to generateDownloadUrl. */
    public UnaryCallSettings.Builder<GenerateDownloadUrlRequest, GenerateDownloadUrlResponse>
        generateDownloadUrlSettings() {
      return getStubSettingsBuilder().generateDownloadUrlSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    @Override
    public CloudFunctionsServiceSettings build() throws IOException {
      return new CloudFunctionsServiceSettings(this);
    }
  }
}
