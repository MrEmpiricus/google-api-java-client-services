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

package com.google.api.services.compute.model;

/**
 * Specifies if the instance is in `SHUTTING_DOWN` state or there is a instance stopping scheduled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceStatusShutdownDetails extends com.google.api.client.json.GenericJson {

  /**
   * Duration for graceful shutdown. Only applicable when `stop_state=SHUTTING_DOWN`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration maxDuration;

  /**
   * Past timestamp indicating the beginning of current `stopState` in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestTimestamp;

  /**
   * Current stopping state of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stopState;

  /**
   * Target instance state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetState;

  /**
   * Duration for graceful shutdown. Only applicable when `stop_state=SHUTTING_DOWN`.
   * @return value or {@code null} for none
   */
  public Duration getMaxDuration() {
    return maxDuration;
  }

  /**
   * Duration for graceful shutdown. Only applicable when `stop_state=SHUTTING_DOWN`.
   * @param maxDuration maxDuration or {@code null} for none
   */
  public ResourceStatusShutdownDetails setMaxDuration(Duration maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

  /**
   * Past timestamp indicating the beginning of current `stopState` in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestTimestamp() {
    return requestTimestamp;
  }

  /**
   * Past timestamp indicating the beginning of current `stopState` in RFC3339 text format.
   * @param requestTimestamp requestTimestamp or {@code null} for none
   */
  public ResourceStatusShutdownDetails setRequestTimestamp(java.lang.String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

  /**
   * Current stopping state of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getStopState() {
    return stopState;
  }

  /**
   * Current stopping state of the instance.
   * @param stopState stopState or {@code null} for none
   */
  public ResourceStatusShutdownDetails setStopState(java.lang.String stopState) {
    this.stopState = stopState;
    return this;
  }

  /**
   * Target instance state.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetState() {
    return targetState;
  }

  /**
   * Target instance state.
   * @param targetState targetState or {@code null} for none
   */
  public ResourceStatusShutdownDetails setTargetState(java.lang.String targetState) {
    this.targetState = targetState;
    return this;
  }

  @Override
  public ResourceStatusShutdownDetails set(String fieldName, Object value) {
    return (ResourceStatusShutdownDetails) super.set(fieldName, value);
  }

  @Override
  public ResourceStatusShutdownDetails clone() {
    return (ResourceStatusShutdownDetails) super.clone();
  }

}
