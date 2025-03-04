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

package com.google.api.services.language.v1beta2.model;

/**
 * An information specific to given column and Tables Model, in context of the Model and the
 * predictions created by it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSTablesModelColumnInfo extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnId;

  /**
   * When given as part of a Model: Measurement of how much model predictions correctness on the
   * TEST data depend on values in this column. A value between 0 and 1, higher means higher
   * influence. These values are normalized - for all input feature columns of a given model they
   * add to 1. When given back by Predict or Batch Predict: Measurement of how impactful for the
   * prediction returned for the given row the value in this column was. Specifically, the feature
   * importance specifies the marginal contribution that the feature made to the prediction score
   * compared to the baseline score. These values are computed using the Sampled Shapley method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float featureImportance;

  /**
   * The ID of the column.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnId() {
    return columnId;
  }

  /**
   * The ID of the column.
   * @param columnId columnId or {@code null} for none
   */
  public XPSTablesModelColumnInfo setColumnId(java.lang.Integer columnId) {
    this.columnId = columnId;
    return this;
  }

  /**
   * When given as part of a Model: Measurement of how much model predictions correctness on the
   * TEST data depend on values in this column. A value between 0 and 1, higher means higher
   * influence. These values are normalized - for all input feature columns of a given model they
   * add to 1. When given back by Predict or Batch Predict: Measurement of how impactful for the
   * prediction returned for the given row the value in this column was. Specifically, the feature
   * importance specifies the marginal contribution that the feature made to the prediction score
   * compared to the baseline score. These values are computed using the Sampled Shapley method.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFeatureImportance() {
    return featureImportance;
  }

  /**
   * When given as part of a Model: Measurement of how much model predictions correctness on the
   * TEST data depend on values in this column. A value between 0 and 1, higher means higher
   * influence. These values are normalized - for all input feature columns of a given model they
   * add to 1. When given back by Predict or Batch Predict: Measurement of how impactful for the
   * prediction returned for the given row the value in this column was. Specifically, the feature
   * importance specifies the marginal contribution that the feature made to the prediction score
   * compared to the baseline score. These values are computed using the Sampled Shapley method.
   * @param featureImportance featureImportance or {@code null} for none
   */
  public XPSTablesModelColumnInfo setFeatureImportance(java.lang.Float featureImportance) {
    this.featureImportance = featureImportance;
    return this;
  }

  @Override
  public XPSTablesModelColumnInfo set(String fieldName, Object value) {
    return (XPSTablesModelColumnInfo) super.set(fieldName, value);
  }

  @Override
  public XPSTablesModelColumnInfo clone() {
    return (XPSTablesModelColumnInfo) super.clone();
  }

}
