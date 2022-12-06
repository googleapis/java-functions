// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public interface HttpsTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.HttpsTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The security level for the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
   * @return The enum numeric value on the wire for securityLevel.
   */
  int getSecurityLevelValue();
  /**
   * <pre>
   * The security level for the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
   * @return The securityLevel.
   */
  com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel getSecurityLevel();
}