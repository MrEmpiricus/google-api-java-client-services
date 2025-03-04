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

package com.google.api.services.walletobjects.model;

/**
 * Model definition for RotatingBarcode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RotatingBarcode extends com.google.api.client.json.GenericJson {

  /**
   * An optional text that will override the default text that shows under the barcode. This field
   * is intended for a human readable equivalent of the barcode value, used when the barcode cannot
   * be scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateText;

  /**
   * Input only. NOTE: This feature is only available for the transit vertical. Optional set of
   * initial rotating barcode values. This allows a small subset of barcodes to be included with the
   * object. Further rotating barcode values must be uploaded with the UploadRotatingBarcodeValues
   * endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RotatingBarcodeValues initialRotatingBarcodeValues;

  /**
   * The render encoding for the barcode. When specified, barcode is rendered in the given encoding.
   * Otherwise best known encoding is chosen by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String renderEncoding;

  /**
   * Optional text that will be shown when the barcode is hidden behind a click action. This happens
   * in cases where a pass has Smart Tap enabled. If not specified, a default is chosen by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizedString showCodeText;

  /**
   * Details used to evaluate the {totp_value_n} substitutions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RotatingBarcodeTotpDetails totpDetails;

  /**
   * The type of this barcode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * String encoded barcode value. This string supports the following substitutions: *
   * {totp_value_n}: Replaced with the TOTP value (see TotpDetails.parameters). *
   * {totp_timestamp_millis}: Replaced with the timestamp (millis since epoch) at which the barcode
   * was generated. * {totp_timestamp_seconds}: Replaced with the timestamp (seconds since epoch) at
   * which the barcode was generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valuePattern;

  /**
   * An optional text that will override the default text that shows under the barcode. This field
   * is intended for a human readable equivalent of the barcode value, used when the barcode cannot
   * be scanned.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateText() {
    return alternateText;
  }

  /**
   * An optional text that will override the default text that shows under the barcode. This field
   * is intended for a human readable equivalent of the barcode value, used when the barcode cannot
   * be scanned.
   * @param alternateText alternateText or {@code null} for none
   */
  public RotatingBarcode setAlternateText(java.lang.String alternateText) {
    this.alternateText = alternateText;
    return this;
  }

  /**
   * Input only. NOTE: This feature is only available for the transit vertical. Optional set of
   * initial rotating barcode values. This allows a small subset of barcodes to be included with the
   * object. Further rotating barcode values must be uploaded with the UploadRotatingBarcodeValues
   * endpoint.
   * @return value or {@code null} for none
   */
  public RotatingBarcodeValues getInitialRotatingBarcodeValues() {
    return initialRotatingBarcodeValues;
  }

  /**
   * Input only. NOTE: This feature is only available for the transit vertical. Optional set of
   * initial rotating barcode values. This allows a small subset of barcodes to be included with the
   * object. Further rotating barcode values must be uploaded with the UploadRotatingBarcodeValues
   * endpoint.
   * @param initialRotatingBarcodeValues initialRotatingBarcodeValues or {@code null} for none
   */
  public RotatingBarcode setInitialRotatingBarcodeValues(RotatingBarcodeValues initialRotatingBarcodeValues) {
    this.initialRotatingBarcodeValues = initialRotatingBarcodeValues;
    return this;
  }

  /**
   * The render encoding for the barcode. When specified, barcode is rendered in the given encoding.
   * Otherwise best known encoding is chosen by Google.
   * @return value or {@code null} for none
   */
  public java.lang.String getRenderEncoding() {
    return renderEncoding;
  }

  /**
   * The render encoding for the barcode. When specified, barcode is rendered in the given encoding.
   * Otherwise best known encoding is chosen by Google.
   * @param renderEncoding renderEncoding or {@code null} for none
   */
  public RotatingBarcode setRenderEncoding(java.lang.String renderEncoding) {
    this.renderEncoding = renderEncoding;
    return this;
  }

  /**
   * Optional text that will be shown when the barcode is hidden behind a click action. This happens
   * in cases where a pass has Smart Tap enabled. If not specified, a default is chosen by Google.
   * @return value or {@code null} for none
   */
  public LocalizedString getShowCodeText() {
    return showCodeText;
  }

  /**
   * Optional text that will be shown when the barcode is hidden behind a click action. This happens
   * in cases where a pass has Smart Tap enabled. If not specified, a default is chosen by Google.
   * @param showCodeText showCodeText or {@code null} for none
   */
  public RotatingBarcode setShowCodeText(LocalizedString showCodeText) {
    this.showCodeText = showCodeText;
    return this;
  }

  /**
   * Details used to evaluate the {totp_value_n} substitutions.
   * @return value or {@code null} for none
   */
  public RotatingBarcodeTotpDetails getTotpDetails() {
    return totpDetails;
  }

  /**
   * Details used to evaluate the {totp_value_n} substitutions.
   * @param totpDetails totpDetails or {@code null} for none
   */
  public RotatingBarcode setTotpDetails(RotatingBarcodeTotpDetails totpDetails) {
    this.totpDetails = totpDetails;
    return this;
  }

  /**
   * The type of this barcode.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this barcode.
   * @param type type or {@code null} for none
   */
  public RotatingBarcode setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * String encoded barcode value. This string supports the following substitutions: *
   * {totp_value_n}: Replaced with the TOTP value (see TotpDetails.parameters). *
   * {totp_timestamp_millis}: Replaced with the timestamp (millis since epoch) at which the barcode
   * was generated. * {totp_timestamp_seconds}: Replaced with the timestamp (seconds since epoch) at
   * which the barcode was generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getValuePattern() {
    return valuePattern;
  }

  /**
   * String encoded barcode value. This string supports the following substitutions: *
   * {totp_value_n}: Replaced with the TOTP value (see TotpDetails.parameters). *
   * {totp_timestamp_millis}: Replaced with the timestamp (millis since epoch) at which the barcode
   * was generated. * {totp_timestamp_seconds}: Replaced with the timestamp (seconds since epoch) at
   * which the barcode was generated.
   * @param valuePattern valuePattern or {@code null} for none
   */
  public RotatingBarcode setValuePattern(java.lang.String valuePattern) {
    this.valuePattern = valuePattern;
    return this;
  }

  @Override
  public RotatingBarcode set(String fieldName, Object value) {
    return (RotatingBarcode) super.set(fieldName, value);
  }

  @Override
  public RotatingBarcode clone() {
    return (RotatingBarcode) super.clone();
  }

}
