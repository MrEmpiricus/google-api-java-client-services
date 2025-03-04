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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A link between a Google Analytics property and BigQuery project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaBigQueryLink extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time when the link was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * If set true, enables daily data export to the linked Google Cloud project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dailyExportEnabled;

  /**
   * Required. Immutable. The geographic location where the created BigQuery dataset should reside.
   * See https://cloud.google.com/bigquery/docs/locations for supported locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetLocation;

  /**
   * The list of event names that will be excluded from exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedEvents;

  /**
   * The list of streams under the parent property for which data will be exported. Format:
   * properties/{property_id}/dataStreams/{stream_id} Example: ['properties/1000/dataStreams/2000']
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exportStreams;

  /**
   * If set true, enables fresh daily export to the linked Google Cloud project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean freshDailyExportEnabled;

  /**
   * If set true, exported data will include advertising identifiers for mobile app streams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeAdvertisingId;

  /**
   * Output only. Resource name of this BigQuery link. Format:
   * 'properties/{property_id}/bigQueryLinks/{bigquery_link_id}' Format:
   * 'properties/1234/bigQueryLinks/abc567'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The linked Google Cloud project resource name. Currently, this API always uses a
   * project number, but may use project IDs in the future. Format: 'projects/{project number}'
   * Example: 'projects/1234'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * If set true, enables streaming export to the linked Google Cloud project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean streamingExportEnabled;

  /**
   * Output only. Time when the link was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time when the link was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * If set true, enables daily data export to the linked Google Cloud project.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDailyExportEnabled() {
    return dailyExportEnabled;
  }

  /**
   * If set true, enables daily data export to the linked Google Cloud project.
   * @param dailyExportEnabled dailyExportEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setDailyExportEnabled(java.lang.Boolean dailyExportEnabled) {
    this.dailyExportEnabled = dailyExportEnabled;
    return this;
  }

  /**
   * Required. Immutable. The geographic location where the created BigQuery dataset should reside.
   * See https://cloud.google.com/bigquery/docs/locations for supported locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetLocation() {
    return datasetLocation;
  }

  /**
   * Required. Immutable. The geographic location where the created BigQuery dataset should reside.
   * See https://cloud.google.com/bigquery/docs/locations for supported locations.
   * @param datasetLocation datasetLocation or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setDatasetLocation(java.lang.String datasetLocation) {
    this.datasetLocation = datasetLocation;
    return this;
  }

  /**
   * The list of event names that will be excluded from exports.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedEvents() {
    return excludedEvents;
  }

  /**
   * The list of event names that will be excluded from exports.
   * @param excludedEvents excludedEvents or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setExcludedEvents(java.util.List<java.lang.String> excludedEvents) {
    this.excludedEvents = excludedEvents;
    return this;
  }

  /**
   * The list of streams under the parent property for which data will be exported. Format:
   * properties/{property_id}/dataStreams/{stream_id} Example: ['properties/1000/dataStreams/2000']
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExportStreams() {
    return exportStreams;
  }

  /**
   * The list of streams under the parent property for which data will be exported. Format:
   * properties/{property_id}/dataStreams/{stream_id} Example: ['properties/1000/dataStreams/2000']
   * @param exportStreams exportStreams or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setExportStreams(java.util.List<java.lang.String> exportStreams) {
    this.exportStreams = exportStreams;
    return this;
  }

  /**
   * If set true, enables fresh daily export to the linked Google Cloud project.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFreshDailyExportEnabled() {
    return freshDailyExportEnabled;
  }

  /**
   * If set true, enables fresh daily export to the linked Google Cloud project.
   * @param freshDailyExportEnabled freshDailyExportEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setFreshDailyExportEnabled(java.lang.Boolean freshDailyExportEnabled) {
    this.freshDailyExportEnabled = freshDailyExportEnabled;
    return this;
  }

  /**
   * If set true, exported data will include advertising identifiers for mobile app streams.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeAdvertisingId() {
    return includeAdvertisingId;
  }

  /**
   * If set true, exported data will include advertising identifiers for mobile app streams.
   * @param includeAdvertisingId includeAdvertisingId or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setIncludeAdvertisingId(java.lang.Boolean includeAdvertisingId) {
    this.includeAdvertisingId = includeAdvertisingId;
    return this;
  }

  /**
   * Output only. Resource name of this BigQuery link. Format:
   * 'properties/{property_id}/bigQueryLinks/{bigquery_link_id}' Format:
   * 'properties/1234/bigQueryLinks/abc567'
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of this BigQuery link. Format:
   * 'properties/{property_id}/bigQueryLinks/{bigquery_link_id}' Format:
   * 'properties/1234/bigQueryLinks/abc567'
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The linked Google Cloud project resource name. Currently, this API always uses a
   * project number, but may use project IDs in the future. Format: 'projects/{project number}'
   * Example: 'projects/1234'
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Immutable. The linked Google Cloud project resource name. Currently, this API always uses a
   * project number, but may use project IDs in the future. Format: 'projects/{project number}'
   * Example: 'projects/1234'
   * @param project project or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * If set true, enables streaming export to the linked Google Cloud project.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStreamingExportEnabled() {
    return streamingExportEnabled;
  }

  /**
   * If set true, enables streaming export to the linked Google Cloud project.
   * @param streamingExportEnabled streamingExportEnabled or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaBigQueryLink setStreamingExportEnabled(java.lang.Boolean streamingExportEnabled) {
    this.streamingExportEnabled = streamingExportEnabled;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaBigQueryLink set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaBigQueryLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaBigQueryLink clone() {
    return (GoogleAnalyticsAdminV1alphaBigQueryLink) super.clone();
  }

}
