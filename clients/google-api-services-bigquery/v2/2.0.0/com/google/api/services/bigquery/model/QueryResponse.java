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

package com.google.api.services.bigquery.model;

/**
 * Model definition for QueryResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * Whether the query result was fetched from the query cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheHit;

  /**
   * Output only. Detailed statistics for DML statements INSERT, UPDATE, DELETE, MERGE or TRUNCATE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DmlStatistics dmlStats;

  /**
   * Output only. The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful. For more information about
   * error messages, see [Error messages](https://cloud.google.com/bigquery/docs/error-messages).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorProto> errors;

  static {
    // hack to force ProGuard to consider ErrorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorProto.class);
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean jobComplete;

  /**
   * Optional. The reason why a Job was created. Only relevant when a job_reference is present in
   * the response. If job_reference is not present it will always be unset.
   * [Preview](/products/#product-launch-stages)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobCreationReason jobCreationReason;

  /**
   * Reference to the Job that was created to run the query. This field will be present even if the
   * original request timed out, in which case GetQueryResults can be used to read the results once
   * the query has completed. Since this API only returns the first page of results, subsequent
   * pages can be fetched via the same mechanism (GetQueryResults). If job_creation_mode was set to
   * `JOB_CREATION_OPTIONAL` and the query completes without creating a job, this field will be
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobReference jobReference;

  /**
   * The resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numDmlAffectedRows;

  /**
   * A token used for paging results. A non-empty token indicates that additional results are
   * available. To see additional results, query the [`jobs.getQueryResults`](https://cloud.google.c
   * om/bigquery/docs/reference/rest/v2/jobs/getQueryResults) method. For more information, see
   * [Paging through table data](https://cloud.google.com/bigquery/docs/paging-results).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Auto-generated ID for the query. [Preview](/products/#product-launch-stages)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryId;

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableRow> rows;

  /**
   * The schema of the results. Present only when the query completes successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableSchema schema;

  /**
   * Output only. Information of the session if this job is part of one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SessionInfo sessionInfo;

  /**
   * The total number of bytes processed for this query. If this query was a dry run, this is the
   * number of bytes that would be processed if the query were run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytesProcessed;

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger totalRows;

  /**
   * Whether the query result was fetched from the query cache.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheHit() {
    return cacheHit;
  }

  /**
   * Whether the query result was fetched from the query cache.
   * @param cacheHit cacheHit or {@code null} for none
   */
  public QueryResponse setCacheHit(java.lang.Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * Output only. Detailed statistics for DML statements INSERT, UPDATE, DELETE, MERGE or TRUNCATE.
   * @return value or {@code null} for none
   */
  public DmlStatistics getDmlStats() {
    return dmlStats;
  }

  /**
   * Output only. Detailed statistics for DML statements INSERT, UPDATE, DELETE, MERGE or TRUNCATE.
   * @param dmlStats dmlStats or {@code null} for none
   */
  public QueryResponse setDmlStats(DmlStatistics dmlStats) {
    this.dmlStats = dmlStats;
    return this;
  }

  /**
   * Output only. The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful. For more information about
   * error messages, see [Error messages](https://cloud.google.com/bigquery/docs/error-messages).
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorProto> getErrors() {
    return errors;
  }

  /**
   * Output only. The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful. For more information about
   * error messages, see [Error messages](https://cloud.google.com/bigquery/docs/error-messages).
   * @param errors errors or {@code null} for none
   */
  public QueryResponse setErrors(java.util.List<ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getJobComplete() {
    return jobComplete;
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * @param jobComplete jobComplete or {@code null} for none
   */
  public QueryResponse setJobComplete(java.lang.Boolean jobComplete) {
    this.jobComplete = jobComplete;
    return this;
  }

  /**
   * Optional. The reason why a Job was created. Only relevant when a job_reference is present in
   * the response. If job_reference is not present it will always be unset.
   * [Preview](/products/#product-launch-stages)
   * @return value or {@code null} for none
   */
  public JobCreationReason getJobCreationReason() {
    return jobCreationReason;
  }

  /**
   * Optional. The reason why a Job was created. Only relevant when a job_reference is present in
   * the response. If job_reference is not present it will always be unset.
   * [Preview](/products/#product-launch-stages)
   * @param jobCreationReason jobCreationReason or {@code null} for none
   */
  public QueryResponse setJobCreationReason(JobCreationReason jobCreationReason) {
    this.jobCreationReason = jobCreationReason;
    return this;
  }

  /**
   * Reference to the Job that was created to run the query. This field will be present even if the
   * original request timed out, in which case GetQueryResults can be used to read the results once
   * the query has completed. Since this API only returns the first page of results, subsequent
   * pages can be fetched via the same mechanism (GetQueryResults). If job_creation_mode was set to
   * `JOB_CREATION_OPTIONAL` and the query completes without creating a job, this field will be
   * empty.
   * @return value or {@code null} for none
   */
  public JobReference getJobReference() {
    return jobReference;
  }

  /**
   * Reference to the Job that was created to run the query. This field will be present even if the
   * original request timed out, in which case GetQueryResults can be used to read the results once
   * the query has completed. Since this API only returns the first page of results, subsequent
   * pages can be fetched via the same mechanism (GetQueryResults). If job_creation_mode was set to
   * `JOB_CREATION_OPTIONAL` and the query completes without creating a job, this field will be
   * empty.
   * @param jobReference jobReference or {@code null} for none
   */
  public QueryResponse setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
    return this;
  }

  /**
   * The resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The resource type.
   * @param kind kind or {@code null} for none
   */
  public QueryResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  /**
   * Output only. The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @param numDmlAffectedRows numDmlAffectedRows or {@code null} for none
   */
  public QueryResponse setNumDmlAffectedRows(java.lang.Long numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
    return this;
  }

  /**
   * A token used for paging results. A non-empty token indicates that additional results are
   * available. To see additional results, query the [`jobs.getQueryResults`](https://cloud.google.c
   * om/bigquery/docs/reference/rest/v2/jobs/getQueryResults) method. For more information, see
   * [Paging through table data](https://cloud.google.com/bigquery/docs/paging-results).
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A token used for paging results. A non-empty token indicates that additional results are
   * available. To see additional results, query the [`jobs.getQueryResults`](https://cloud.google.c
   * om/bigquery/docs/reference/rest/v2/jobs/getQueryResults) method. For more information, see
   * [Paging through table data](https://cloud.google.com/bigquery/docs/paging-results).
   * @param pageToken pageToken or {@code null} for none
   */
  public QueryResponse setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Auto-generated ID for the query. [Preview](/products/#product-launch-stages)
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryId() {
    return queryId;
  }

  /**
   * Auto-generated ID for the query. [Preview](/products/#product-launch-stages)
   * @param queryId queryId or {@code null} for none
   */
  public QueryResponse setQueryId(java.lang.String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above.
   * @return value or {@code null} for none
   */
  public java.util.List<TableRow> getRows() {
    return rows;
  }

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above.
   * @param rows rows or {@code null} for none
   */
  public QueryResponse setRows(java.util.List<TableRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * The schema of the results. Present only when the query completes successfully.
   * @return value or {@code null} for none
   */
  public TableSchema getSchema() {
    return schema;
  }

  /**
   * The schema of the results. Present only when the query completes successfully.
   * @param schema schema or {@code null} for none
   */
  public QueryResponse setSchema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Output only. Information of the session if this job is part of one.
   * @return value or {@code null} for none
   */
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  /**
   * Output only. Information of the session if this job is part of one.
   * @param sessionInfo sessionInfo or {@code null} for none
   */
  public QueryResponse setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * The total number of bytes processed for this query. If this query was a dry run, this is the
   * number of bytes that would be processed if the query were run.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  /**
   * The total number of bytes processed for this query. If this query was a dry run, this is the
   * number of bytes that would be processed if the query were run.
   * @param totalBytesProcessed totalBytesProcessed or {@code null} for none
   */
  public QueryResponse setTotalBytesProcessed(java.lang.Long totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTotalRows() {
    return totalRows;
  }

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results.
   * @param totalRows totalRows or {@code null} for none
   */
  public QueryResponse setTotalRows(java.math.BigInteger totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  @Override
  public QueryResponse set(String fieldName, Object value) {
    return (QueryResponse) super.set(fieldName, value);
  }

  @Override
  public QueryResponse clone() {
    return (QueryResponse) super.clone();
  }

}
