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

package com.google.api.services.vmwareengine.v1.model;

/**
 * Response message for VmwareEngine.ListNetworkPolicies
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VMware Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListNetworkPoliciesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of network policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkPolicy> networkPolicies;

  /**
   * A token, which can be send as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached when making an aggregated query using wildcards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A list of network policies.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkPolicy> getNetworkPolicies() {
    return networkPolicies;
  }

  /**
   * A list of network policies.
   * @param networkPolicies networkPolicies or {@code null} for none
   */
  public ListNetworkPoliciesResponse setNetworkPolicies(java.util.List<NetworkPolicy> networkPolicies) {
    this.networkPolicies = networkPolicies;
    return this;
  }

  /**
   * A token, which can be send as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be send as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListNetworkPoliciesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached when making an aggregated query using wildcards.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached when making an aggregated query using wildcards.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListNetworkPoliciesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListNetworkPoliciesResponse set(String fieldName, Object value) {
    return (ListNetworkPoliciesResponse) super.set(fieldName, value);
  }

  @Override
  public ListNetworkPoliciesResponse clone() {
    return (ListNetworkPoliciesResponse) super.clone();
  }

}
