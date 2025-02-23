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

package com.google.api.services.safebrowsing.v5.model;

/**
 * The full hash identified with one or more matches.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSecuritySafebrowsingV5FullHash extends com.google.api.client.json.GenericJson {

  /**
   * The matching full hash. This is the SHA256 hash. The length will be exactly 32 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullHash;

  /**
   * Unordered list. A repeated field identifying the details relevant to this full hash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleSecuritySafebrowsingV5FullHashFullHashDetail> fullHashDetails;

  /**
   * The matching full hash. This is the SHA256 hash. The length will be exactly 32 bytes.
   * @see #decodeFullHash()
   * @return value or {@code null} for none
   */
  public java.lang.String getFullHash() {
    return fullHash;
  }

  /**
   * The matching full hash. This is the SHA256 hash. The length will be exactly 32 bytes.
   * @see #getFullHash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFullHash() {
    return com.google.api.client.util.Base64.decodeBase64(fullHash);
  }

  /**
   * The matching full hash. This is the SHA256 hash. The length will be exactly 32 bytes.
   * @see #encodeFullHash()
   * @param fullHash fullHash or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5FullHash setFullHash(java.lang.String fullHash) {
    this.fullHash = fullHash;
    return this;
  }

  /**
   * The matching full hash. This is the SHA256 hash. The length will be exactly 32 bytes.
   * @see #setFullHash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleSecuritySafebrowsingV5FullHash encodeFullHash(byte[] fullHash) {
    this.fullHash = com.google.api.client.util.Base64.encodeBase64URLSafeString(fullHash);
    return this;
  }

  /**
   * Unordered list. A repeated field identifying the details relevant to this full hash.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleSecuritySafebrowsingV5FullHashFullHashDetail> getFullHashDetails() {
    return fullHashDetails;
  }

  /**
   * Unordered list. A repeated field identifying the details relevant to this full hash.
   * @param fullHashDetails fullHashDetails or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5FullHash setFullHashDetails(java.util.List<GoogleSecuritySafebrowsingV5FullHashFullHashDetail> fullHashDetails) {
    this.fullHashDetails = fullHashDetails;
    return this;
  }

  @Override
  public GoogleSecuritySafebrowsingV5FullHash set(String fieldName, Object value) {
    return (GoogleSecuritySafebrowsingV5FullHash) super.set(fieldName, value);
  }

  @Override
  public GoogleSecuritySafebrowsingV5FullHash clone() {
    return (GoogleSecuritySafebrowsingV5FullHash) super.clone();
  }

}
