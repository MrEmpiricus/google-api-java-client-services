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

package com.google.api.services.batch.v1.model;

/**
 * A Job's resource allocation policy describes when, where, and how compute resources should be
 * allocated for the Job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AllocationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Describe instances that can be created by this AllocationPolicy. Only instances[0] is supported
   * now.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstancePolicyOrTemplate> instances;

  /**
   * Labels applied to all VM instances and other resources created by AllocationPolicy. Labels
   * could be user provided or system generated. You can assign up to 64 labels. [Google Compute
   * Engine label restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources#restrictions) apply. Label names that start with "goog-" or "google-" are reserved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Location where compute resources should be allocated for the Job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocationPolicy location;

  /**
   * The network policy. If you define an instance template in the `InstancePolicyOrTemplate` field,
   * Batch will use the network settings in the instance template instead of this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkPolicy network;

  /**
   * The placement policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PlacementPolicy placement;

  /**
   * Defines the service account for Batch-created VMs. If omitted, the [default Compute Engine
   * service account](https://cloud.google.com/compute/docs/access/service-
   * accounts#default_service_account) is used. Must match the service account specified in any used
   * instance template configured in the Batch job. Includes the following fields: * email: The
   * service account's email address. If not set, the default Compute Engine service account is
   * used. * scopes: Additional OAuth scopes to grant the service account, beyond the default cloud-
   * platform scope. (list of strings)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceAccount serviceAccount;

  /**
   * Optional. Tags applied to the VM instances. The tags identify valid sources or targets for
   * network firewalls. Each tag must be 1-63 characters long, and comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Describe instances that can be created by this AllocationPolicy. Only instances[0] is supported
   * now.
   * @return value or {@code null} for none
   */
  public java.util.List<InstancePolicyOrTemplate> getInstances() {
    return instances;
  }

  /**
   * Describe instances that can be created by this AllocationPolicy. Only instances[0] is supported
   * now.
   * @param instances instances or {@code null} for none
   */
  public AllocationPolicy setInstances(java.util.List<InstancePolicyOrTemplate> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Labels applied to all VM instances and other resources created by AllocationPolicy. Labels
   * could be user provided or system generated. You can assign up to 64 labels. [Google Compute
   * Engine label restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources#restrictions) apply. Label names that start with "goog-" or "google-" are reserved.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels applied to all VM instances and other resources created by AllocationPolicy. Labels
   * could be user provided or system generated. You can assign up to 64 labels. [Google Compute
   * Engine label restrictions](https://cloud.google.com/compute/docs/labeling-
   * resources#restrictions) apply. Label names that start with "goog-" or "google-" are reserved.
   * @param labels labels or {@code null} for none
   */
  public AllocationPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Location where compute resources should be allocated for the Job.
   * @return value or {@code null} for none
   */
  public LocationPolicy getLocation() {
    return location;
  }

  /**
   * Location where compute resources should be allocated for the Job.
   * @param location location or {@code null} for none
   */
  public AllocationPolicy setLocation(LocationPolicy location) {
    this.location = location;
    return this;
  }

  /**
   * The network policy. If you define an instance template in the `InstancePolicyOrTemplate` field,
   * Batch will use the network settings in the instance template instead of this field.
   * @return value or {@code null} for none
   */
  public NetworkPolicy getNetwork() {
    return network;
  }

  /**
   * The network policy. If you define an instance template in the `InstancePolicyOrTemplate` field,
   * Batch will use the network settings in the instance template instead of this field.
   * @param network network or {@code null} for none
   */
  public AllocationPolicy setNetwork(NetworkPolicy network) {
    this.network = network;
    return this;
  }

  /**
   * The placement policy.
   * @return value or {@code null} for none
   */
  public PlacementPolicy getPlacement() {
    return placement;
  }

  /**
   * The placement policy.
   * @param placement placement or {@code null} for none
   */
  public AllocationPolicy setPlacement(PlacementPolicy placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Defines the service account for Batch-created VMs. If omitted, the [default Compute Engine
   * service account](https://cloud.google.com/compute/docs/access/service-
   * accounts#default_service_account) is used. Must match the service account specified in any used
   * instance template configured in the Batch job. Includes the following fields: * email: The
   * service account's email address. If not set, the default Compute Engine service account is
   * used. * scopes: Additional OAuth scopes to grant the service account, beyond the default cloud-
   * platform scope. (list of strings)
   * @return value or {@code null} for none
   */
  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Defines the service account for Batch-created VMs. If omitted, the [default Compute Engine
   * service account](https://cloud.google.com/compute/docs/access/service-
   * accounts#default_service_account) is used. Must match the service account specified in any used
   * instance template configured in the Batch job. Includes the following fields: * email: The
   * service account's email address. If not set, the default Compute Engine service account is
   * used. * scopes: Additional OAuth scopes to grant the service account, beyond the default cloud-
   * platform scope. (list of strings)
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public AllocationPolicy setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. Tags applied to the VM instances. The tags identify valid sources or targets for
   * network firewalls. Each tag must be 1-63 characters long, and comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. Tags applied to the VM instances. The tags identify valid sources or targets for
   * network firewalls. Each tag must be 1-63 characters long, and comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * @param tags tags or {@code null} for none
   */
  public AllocationPolicy setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public AllocationPolicy set(String fieldName, Object value) {
    return (AllocationPolicy) super.set(fieldName, value);
  }

  @Override
  public AllocationPolicy clone() {
    return (AllocationPolicy) super.clone();
  }

}
