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

package com.google.api.services.spanner.v1.model;

/**
 * Recommendation to add new indexes to run queries more efficiently.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexAdvice extends com.google.api.client.json.GenericJson {

  /**
   * Optional. DDL statements to add new indexes that will improve the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ddl;

  /**
   * Optional. Estimated latency improvement factor. For example if the query currently takes 500 ms
   * to run and the estimated latency with new indexes is 100 ms this field will be 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double improvementFactor;

  /**
   * Optional. DDL statements to add new indexes that will improve the query.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDdl() {
    return ddl;
  }

  /**
   * Optional. DDL statements to add new indexes that will improve the query.
   * @param ddl ddl or {@code null} for none
   */
  public IndexAdvice setDdl(java.util.List<java.lang.String> ddl) {
    this.ddl = ddl;
    return this;
  }

  /**
   * Optional. Estimated latency improvement factor. For example if the query currently takes 500 ms
   * to run and the estimated latency with new indexes is 100 ms this field will be 5.
   * @return value or {@code null} for none
   */
  public java.lang.Double getImprovementFactor() {
    return improvementFactor;
  }

  /**
   * Optional. Estimated latency improvement factor. For example if the query currently takes 500 ms
   * to run and the estimated latency with new indexes is 100 ms this field will be 5.
   * @param improvementFactor improvementFactor or {@code null} for none
   */
  public IndexAdvice setImprovementFactor(java.lang.Double improvementFactor) {
    this.improvementFactor = improvementFactor;
    return this;
  }

  @Override
  public IndexAdvice set(String fieldName, Object value) {
    return (IndexAdvice) super.set(fieldName, value);
  }

  @Override
  public IndexAdvice clone() {
    return (IndexAdvice) super.clone();
  }

}
