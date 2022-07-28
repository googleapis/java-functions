/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.functions.v1.samples;

// [START functions_v1_generated_cloudfunctionsserviceclient_callfunction_cloudfunctionnamestring_sync]
import com.google.cloud.functions.v1.CallFunctionResponse;
import com.google.cloud.functions.v1.CloudFunctionName;
import com.google.cloud.functions.v1.CloudFunctionsServiceClient;

public class SyncCallFunctionCloudfunctionnameString {

  public static void main(String[] args) throws Exception {
    syncCallFunctionCloudfunctionnameString();
  }

  public static void syncCallFunctionCloudfunctionnameString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
        CloudFunctionsServiceClient.create()) {
      CloudFunctionName name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
      String data = "data3076010";
      CallFunctionResponse response = cloudFunctionsServiceClient.callFunction(name, data);
    }
  }
}
// [END functions_v1_generated_cloudfunctionsserviceclient_callfunction_cloudfunctionnamestring_sync]
