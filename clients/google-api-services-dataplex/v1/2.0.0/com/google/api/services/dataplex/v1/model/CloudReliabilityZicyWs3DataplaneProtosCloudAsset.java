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

package com.google.api.services.dataplex.v1.model;

/**
 * Model definition for CloudReliabilityZicyWs3DataplaneProtosCloudAsset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudReliabilityZicyWs3DataplaneProtosCloudAsset extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetName() {
    return assetName;
  }

  /**
   * @param assetName assetName or {@code null} for none
   */
  public CloudReliabilityZicyWs3DataplaneProtosCloudAsset setAssetName(java.lang.String assetName) {
    this.assetName = assetName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * @param assetType assetType or {@code null} for none
   */
  public CloudReliabilityZicyWs3DataplaneProtosCloudAsset setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  @Override
  public CloudReliabilityZicyWs3DataplaneProtosCloudAsset set(String fieldName, Object value) {
    return (CloudReliabilityZicyWs3DataplaneProtosCloudAsset) super.set(fieldName, value);
  }

  @Override
  public CloudReliabilityZicyWs3DataplaneProtosCloudAsset clone() {
    return (CloudReliabilityZicyWs3DataplaneProtosCloudAsset) super.clone();
  }

}
