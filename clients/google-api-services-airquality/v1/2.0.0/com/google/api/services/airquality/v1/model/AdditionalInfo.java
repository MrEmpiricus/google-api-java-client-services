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

package com.google.api.services.airquality.v1.model;

/**
 * The emission sources and health effects of a given pollutant.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Air Quality API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdditionalInfo extends com.google.api.client.json.GenericJson {

  /**
   * Text representing the pollutant's main health effects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effects;

  /**
   * Text representing the pollutant's main emission sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sources;

  /**
   * Text representing the pollutant's main health effects.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffects() {
    return effects;
  }

  /**
   * Text representing the pollutant's main health effects.
   * @param effects effects or {@code null} for none
   */
  public AdditionalInfo setEffects(java.lang.String effects) {
    this.effects = effects;
    return this;
  }

  /**
   * Text representing the pollutant's main emission sources.
   * @return value or {@code null} for none
   */
  public java.lang.String getSources() {
    return sources;
  }

  /**
   * Text representing the pollutant's main emission sources.
   * @param sources sources or {@code null} for none
   */
  public AdditionalInfo setSources(java.lang.String sources) {
    this.sources = sources;
    return this;
  }

  @Override
  public AdditionalInfo set(String fieldName, Object value) {
    return (AdditionalInfo) super.set(fieldName, value);
  }

  @Override
  public AdditionalInfo clone() {
    return (AdditionalInfo) super.clone();
  }

}
