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

package com.google.api.services.classroom.model;

/**
 * Identifier of a previous copy of a given attachment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CopyHistory extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. Identifier of the attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attachmentId;

  /**
   * Immutable. Identifier of the course.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String courseId;

  /**
   * Immutable. Identifier of the announcement, courseWork, or courseWorkMaterial under which the
   * attachment is attached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemId;

  /**
   * Immutable. Deprecated, use item_id instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postId;

  /**
   * Immutable. Identifier of the attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttachmentId() {
    return attachmentId;
  }

  /**
   * Immutable. Identifier of the attachment.
   * @param attachmentId attachmentId or {@code null} for none
   */
  public CopyHistory setAttachmentId(java.lang.String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * Immutable. Identifier of the course.
   * @return value or {@code null} for none
   */
  public java.lang.String getCourseId() {
    return courseId;
  }

  /**
   * Immutable. Identifier of the course.
   * @param courseId courseId or {@code null} for none
   */
  public CopyHistory setCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Immutable. Identifier of the announcement, courseWork, or courseWorkMaterial under which the
   * attachment is attached.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemId() {
    return itemId;
  }

  /**
   * Immutable. Identifier of the announcement, courseWork, or courseWorkMaterial under which the
   * attachment is attached.
   * @param itemId itemId or {@code null} for none
   */
  public CopyHistory setItemId(java.lang.String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Immutable. Deprecated, use item_id instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostId() {
    return postId;
  }

  /**
   * Immutable. Deprecated, use item_id instead.
   * @param postId postId or {@code null} for none
   */
  public CopyHistory setPostId(java.lang.String postId) {
    this.postId = postId;
    return this;
  }

  @Override
  public CopyHistory set(String fieldName, Object value) {
    return (CopyHistory) super.set(fieldName, value);
  }

  @Override
  public CopyHistory clone() {
    return (CopyHistory) super.clone();
  }

}
