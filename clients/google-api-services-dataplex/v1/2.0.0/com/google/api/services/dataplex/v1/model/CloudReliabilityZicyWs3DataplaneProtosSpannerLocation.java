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
 * Model definition for CloudReliabilityZicyWs3DataplaneProtosSpannerLocation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudReliabilityZicyWs3DataplaneProtosSpannerLocation extends com.google.api.client.json.GenericJson {

  /**
   * Set of backups used by the resource with name in the same format as what is available at
   * http://table/spanner_automon.backup_metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> backupName;

  /**
   * Set of databases used by the resource in format /span//
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dbName;

  /**
   * Set of backups used by the resource with name in the same format as what is available at
   * http://table/spanner_automon.backup_metadata
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBackupName() {
    return backupName;
  }

  /**
   * Set of backups used by the resource with name in the same format as what is available at
   * http://table/spanner_automon.backup_metadata
   * @param backupName backupName or {@code null} for none
   */
  public CloudReliabilityZicyWs3DataplaneProtosSpannerLocation setBackupName(java.util.List<java.lang.String> backupName) {
    this.backupName = backupName;
    return this;
  }

  /**
   * Set of databases used by the resource in format /span//
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDbName() {
    return dbName;
  }

  /**
   * Set of databases used by the resource in format /span//
   * @param dbName dbName or {@code null} for none
   */
  public CloudReliabilityZicyWs3DataplaneProtosSpannerLocation setDbName(java.util.List<java.lang.String> dbName) {
    this.dbName = dbName;
    return this;
  }

  @Override
  public CloudReliabilityZicyWs3DataplaneProtosSpannerLocation set(String fieldName, Object value) {
    return (CloudReliabilityZicyWs3DataplaneProtosSpannerLocation) super.set(fieldName, value);
  }

  @Override
  public CloudReliabilityZicyWs3DataplaneProtosSpannerLocation clone() {
    return (CloudReliabilityZicyWs3DataplaneProtosSpannerLocation) super.clone();
  }

}
