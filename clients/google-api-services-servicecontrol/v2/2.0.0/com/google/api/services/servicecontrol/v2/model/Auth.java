/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.servicecontrol.v2.model;

/**
 * This message defines request authentication attributes. Terminology is based on the JSON Web
 * Token (JWT) standard, but the terms also correlate to concepts in other standards.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Auth extends com.google.api.client.json.GenericJson {

  /**
   * A list of access level resource names that allow resources to be accessed by authenticated
   * requester. It is part of Secure GCP processing for the incoming request. An access level string
   * has the format: "//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}"
   * Example:
   * "//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessLevels;

  /**
   * The intended audience(s) for this authentication information. Reflects the audience (`aud`)
   * claim within a JWT. The audience value(s) depends on the `issuer`, but typically include one or
   * more of the following pieces of information: * The services intended to receive the credential.
   * For example, ["https://pubsub.googleapis.com/", "https://storage.googleapis.com/"]. * A set of
   * service-based scopes. For example, ["https://www.googleapis.com/auth/cloud-platform"]. * The
   * client id of an app, such as the Firebase project id for JWTs from Firebase Auth. Consult the
   * documentation for the credential issuer to determine the information provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> audiences;

  /**
   * Structured claims presented with the credential. JWTs include `{key: value}` pairs for standard
   * and private claims. The following is a subset of the standard required and optional claims that
   * would typically be presented for a Google-based JWT: {'iss': 'accounts.google.com', 'sub':
   * '113289723416554971153', 'aud': ['123456789012', 'pubsub.googleapis.com'], 'azp':
   * '123456789012.apps.googleusercontent.com', 'email': 'jsmith@example.com', 'iat': 1353601026,
   * 'exp': 1353604926} SAML assertions are similarly specified, but with an identity provider
   * dependent structure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> claims;

  /**
   * Identifies the client credential id used for authentication. credential_id is in the format of
   * AUTH_METHOD:IDENTIFIER, e.g. "serviceaccount:XXXXX, apikey:XXXXX" where the format of the
   * IDENTIFIER can vary for different AUTH_METHODs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String credentialId;

  /**
   * The authorized presenter of the credential. Reflects the optional Authorized Presenter (`azp`)
   * claim within a JWT or the OAuth client id. For example, a Google Cloud Platform client id looks
   * as follows: "123456789012.apps.googleusercontent.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String presenter;

  /**
   * The authenticated principal. Reflects the issuer (`iss`) and subject (`sub`) claims within a
   * JWT. The issuer and subject should be `/` delimited, with `/` percent-encoded within the
   * subject fragment. For Google accounts, the principal format is:
   * "https://accounts.google.com/{id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principal;

  /**
   * A list of access level resource names that allow resources to be accessed by authenticated
   * requester. It is part of Secure GCP processing for the incoming request. An access level string
   * has the format: "//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}"
   * Example:
   * "//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessLevels() {
    return accessLevels;
  }

  /**
   * A list of access level resource names that allow resources to be accessed by authenticated
   * requester. It is part of Secure GCP processing for the incoming request. An access level string
   * has the format: "//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}"
   * Example:
   * "//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL"
   * @param accessLevels accessLevels or {@code null} for none
   */
  public Auth setAccessLevels(java.util.List<java.lang.String> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  /**
   * The intended audience(s) for this authentication information. Reflects the audience (`aud`)
   * claim within a JWT. The audience value(s) depends on the `issuer`, but typically include one or
   * more of the following pieces of information: * The services intended to receive the credential.
   * For example, ["https://pubsub.googleapis.com/", "https://storage.googleapis.com/"]. * A set of
   * service-based scopes. For example, ["https://www.googleapis.com/auth/cloud-platform"]. * The
   * client id of an app, such as the Firebase project id for JWTs from Firebase Auth. Consult the
   * documentation for the credential issuer to determine the information provided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAudiences() {
    return audiences;
  }

  /**
   * The intended audience(s) for this authentication information. Reflects the audience (`aud`)
   * claim within a JWT. The audience value(s) depends on the `issuer`, but typically include one or
   * more of the following pieces of information: * The services intended to receive the credential.
   * For example, ["https://pubsub.googleapis.com/", "https://storage.googleapis.com/"]. * A set of
   * service-based scopes. For example, ["https://www.googleapis.com/auth/cloud-platform"]. * The
   * client id of an app, such as the Firebase project id for JWTs from Firebase Auth. Consult the
   * documentation for the credential issuer to determine the information provided.
   * @param audiences audiences or {@code null} for none
   */
  public Auth setAudiences(java.util.List<java.lang.String> audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Structured claims presented with the credential. JWTs include `{key: value}` pairs for standard
   * and private claims. The following is a subset of the standard required and optional claims that
   * would typically be presented for a Google-based JWT: {'iss': 'accounts.google.com', 'sub':
   * '113289723416554971153', 'aud': ['123456789012', 'pubsub.googleapis.com'], 'azp':
   * '123456789012.apps.googleusercontent.com', 'email': 'jsmith@example.com', 'iat': 1353601026,
   * 'exp': 1353604926} SAML assertions are similarly specified, but with an identity provider
   * dependent structure.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getClaims() {
    return claims;
  }

  /**
   * Structured claims presented with the credential. JWTs include `{key: value}` pairs for standard
   * and private claims. The following is a subset of the standard required and optional claims that
   * would typically be presented for a Google-based JWT: {'iss': 'accounts.google.com', 'sub':
   * '113289723416554971153', 'aud': ['123456789012', 'pubsub.googleapis.com'], 'azp':
   * '123456789012.apps.googleusercontent.com', 'email': 'jsmith@example.com', 'iat': 1353601026,
   * 'exp': 1353604926} SAML assertions are similarly specified, but with an identity provider
   * dependent structure.
   * @param claims claims or {@code null} for none
   */
  public Auth setClaims(java.util.Map<String, java.lang.Object> claims) {
    this.claims = claims;
    return this;
  }

  /**
   * Identifies the client credential id used for authentication. credential_id is in the format of
   * AUTH_METHOD:IDENTIFIER, e.g. "serviceaccount:XXXXX, apikey:XXXXX" where the format of the
   * IDENTIFIER can vary for different AUTH_METHODs.
   * @return value or {@code null} for none
   */
  public java.lang.String getCredentialId() {
    return credentialId;
  }

  /**
   * Identifies the client credential id used for authentication. credential_id is in the format of
   * AUTH_METHOD:IDENTIFIER, e.g. "serviceaccount:XXXXX, apikey:XXXXX" where the format of the
   * IDENTIFIER can vary for different AUTH_METHODs.
   * @param credentialId credentialId or {@code null} for none
   */
  public Auth setCredentialId(java.lang.String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * The authorized presenter of the credential. Reflects the optional Authorized Presenter (`azp`)
   * claim within a JWT or the OAuth client id. For example, a Google Cloud Platform client id looks
   * as follows: "123456789012.apps.googleusercontent.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getPresenter() {
    return presenter;
  }

  /**
   * The authorized presenter of the credential. Reflects the optional Authorized Presenter (`azp`)
   * claim within a JWT or the OAuth client id. For example, a Google Cloud Platform client id looks
   * as follows: "123456789012.apps.googleusercontent.com".
   * @param presenter presenter or {@code null} for none
   */
  public Auth setPresenter(java.lang.String presenter) {
    this.presenter = presenter;
    return this;
  }

  /**
   * The authenticated principal. Reflects the issuer (`iss`) and subject (`sub`) claims within a
   * JWT. The issuer and subject should be `/` delimited, with `/` percent-encoded within the
   * subject fragment. For Google accounts, the principal format is:
   * "https://accounts.google.com/{id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipal() {
    return principal;
  }

  /**
   * The authenticated principal. Reflects the issuer (`iss`) and subject (`sub`) claims within a
   * JWT. The issuer and subject should be `/` delimited, with `/` percent-encoded within the
   * subject fragment. For Google accounts, the principal format is:
   * "https://accounts.google.com/{id}"
   * @param principal principal or {@code null} for none
   */
  public Auth setPrincipal(java.lang.String principal) {
    this.principal = principal;
    return this;
  }

  @Override
  public Auth set(String fieldName, Object value) {
    return (Auth) super.set(fieldName, value);
  }

  @Override
  public Auth clone() {
    return (Auth) super.clone();
  }

}
