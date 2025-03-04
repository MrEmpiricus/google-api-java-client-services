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

package com.google.api.services.datacatalog.v1.model;

/**
 * Tags contain custom metadata and are attached to Data Catalog resources. Tags conform with the
 * specification of their tag template. See [Data Catalog IAM](https://cloud.google.com/data-
 * catalog/docs/concepts/iam) for information on the permissions needed to create or view tags.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1Tag extends com.google.api.client.json.GenericJson {

  /**
   * Resources like entry can have schemas associated with them. This scope allows you to attach
   * tags to an individual column based on that schema. To attach a tag to a nested column, separate
   * column names with a dot (`.`). Example: `column.nested_column`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String column;

  /**
   * Required. Maps the ID of a tag field to its value and additional information about that field.
   * Tag template defines valid field IDs. A tag must have at least 1 field and at most 500 fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDatacatalogV1TagField> fields;

  /**
   * Identifier. The resource name of the tag in URL format where tag ID is a system-generated
   * identifier. Note: The tag itself might not be stored in the location specified in its name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The resource name of the tag template this tag uses. Example:
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE_ID}` This field cannot
   * be modified after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String template;

  /**
   * Output only. The display name of the tag template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String templateDisplayName;

  /**
   * Resources like entry can have schemas associated with them. This scope allows you to attach
   * tags to an individual column based on that schema. To attach a tag to a nested column, separate
   * column names with a dot (`.`). Example: `column.nested_column`.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumn() {
    return column;
  }

  /**
   * Resources like entry can have schemas associated with them. This scope allows you to attach
   * tags to an individual column based on that schema. To attach a tag to a nested column, separate
   * column names with a dot (`.`). Example: `column.nested_column`.
   * @param column column or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Tag setColumn(java.lang.String column) {
    this.column = column;
    return this;
  }

  /**
   * Required. Maps the ID of a tag field to its value and additional information about that field.
   * Tag template defines valid field IDs. A tag must have at least 1 field and at most 500 fields.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDatacatalogV1TagField> getFields() {
    return fields;
  }

  /**
   * Required. Maps the ID of a tag field to its value and additional information about that field.
   * Tag template defines valid field IDs. A tag must have at least 1 field and at most 500 fields.
   * @param fields fields or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Tag setFields(java.util.Map<String, GoogleCloudDatacatalogV1TagField> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Identifier. The resource name of the tag in URL format where tag ID is a system-generated
   * identifier. Note: The tag itself might not be stored in the location specified in its name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the tag in URL format where tag ID is a system-generated
   * identifier. Note: The tag itself might not be stored in the location specified in its name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Tag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The resource name of the tag template this tag uses. Example:
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE_ID}` This field cannot
   * be modified after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTemplate() {
    return template;
  }

  /**
   * Required. The resource name of the tag template this tag uses. Example:
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE_ID}` This field cannot
   * be modified after creation.
   * @param template template or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Tag setTemplate(java.lang.String template) {
    this.template = template;
    return this;
  }

  /**
   * Output only. The display name of the tag template.
   * @return value or {@code null} for none
   */
  public java.lang.String getTemplateDisplayName() {
    return templateDisplayName;
  }

  /**
   * Output only. The display name of the tag template.
   * @param templateDisplayName templateDisplayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1Tag setTemplateDisplayName(java.lang.String templateDisplayName) {
    this.templateDisplayName = templateDisplayName;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1Tag set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1Tag) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1Tag clone() {
    return (GoogleCloudDatacatalogV1Tag) super.clone();
  }

}
