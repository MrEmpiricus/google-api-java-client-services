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
 * Model definition for FlightObject.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FlightObject extends com.google.api.client.json.GenericJson {

  /**
   * Optional app or website link that will be displayed as a button on the front of the pass. If
   * AppLinkData is provided for the corresponding class only object AppLinkData will be displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppLinkData appLinkData;

  /**
   * The barcode type and value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Barcode barcode;

  /**
   * Passenger specific information about boarding and seating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BoardingAndSeatingInfo boardingAndSeatingInfo;

  /**
   * Required. The class associated with this object. The class must be of the same type as this
   * object, must already exist, and must be approved. Class IDs should follow the format issuer
   * ID.identifier where the former is issued by Google and latter is chosen by you.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String classId;

  /**
   * A copy of the inherited fields of the parent class. These fields are retrieved during a GET.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FlightClass classReference;

  /**
   * Indicates if notifications should explicitly be suppressed. If this field is set to true,
   * regardless of the `messages` field, expiration notifications to the user will be suppressed. By
   * default, this field is set to false. Currently, this can only be set for Flights.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableExpirationNotification;

  /**
   * Information that controls how passes are grouped together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupingInfo groupingInfo;

  /**
   * Whether this object is currently linked to a single device. This field is set by the platform
   * when a user saves the object, linking it to their device. Intended for use by select partners.
   * Contact support for additional information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasLinkedDevice;

  /**
   * Indicates if the object has users. This field is set by the platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasUsers;

  /**
   * Optional banner image displayed on the front of the card. If none is present, hero image of the
   * class, if present, will be displayed. If hero image of the class is also not present, nothing
   * will be displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image heroImage;

  /**
   * The background color for the card. If not set the dominant color of the hero image is used, and
   * if no hero image is set, the dominant color of the logo is used. The format is #rrggbb where
   * rrggbb is a hex RGB triplet, such as `#ffcc00`. You can also use the shorthand version of the
   * RGB triplet which is #rgb, such as `#fc0`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hexBackgroundColor;

  /**
   * Required. The unique identifier for an object. This ID must be unique across all objects from
   * an issuer. This value should follow the format issuer ID.identifier where the former is issued
   * by Google and latter is chosen by you. The unique identifier should only include alphanumeric
   * characters, '.', '_', or '-'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Image module data. The maximum number of these fields displayed is 1 from object level and 1
   * for class object level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageModuleData> imageModulesData;

  /**
   * Deprecated. Use textModulesData instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InfoModuleData infoModuleData;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * `"walletobjects#flightObject"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * linked_object_ids are a list of other objects such as event ticket, loyalty, offer, generic,
   * giftcard, transit and boarding pass that should be automatically attached to this flight
   * object. If a user had saved this boarding pass, then these linked_object_ids would be
   * automatically pushed to the user's wallet (unless they turned off the setting to receive such
   * linked passes). Make sure that objects present in linked_object_ids are already inserted - if
   * not, calls would fail. Once linked, the linked objects cannot be unlinked. You cannot link
   * objects belonging to another issuer. There is a limit to the number of objects that can be
   * linked to a single object. After the limit is reached, new linked objects in the call will be
   * ignored silently. Object IDs should follow the format issuer ID. identifier where the former is
   * issued by Google and the latter is chosen by you.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> linkedObjectIds;

  /**
   * Links module data. If links module data is also defined on the class, both will be displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LinksModuleData linksModuleData;

  /**
   * Note: This field is currently not supported to trigger geo notifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LatLongPoint> locations;

  /**
   * An array of messages displayed in the app. All users of this object will receive its associated
   * messages. The maximum number of these fields is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Message> messages;

  /**
   * Pass constraints for the object. Includes limiting NFC and screenshot behaviors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PassConstraints passConstraints;

  /**
   * Required. Passenger name as it would appear on the boarding pass. eg: "Dave M Gahan" or
   * "Gahan/Dave" or "GAHAN/DAVEM"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passengerName;

  /**
   * Required. Information about flight reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReservationInfo reservationInfo;

  /**
   * The rotating barcode type and value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RotatingBarcode rotatingBarcode;

  /**
   * Restrictions on the object that needs to be verified before the user tries to save the pass.
   * Note that this restrictions will only be applied during save time. If the restrictions changed
   * after a user saves the pass, the new restrictions will not be applied to an already saved pass.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SaveRestrictions saveRestrictions;

  /**
   * An image for the security program that applies to the passenger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image securityProgramLogo;

  /**
   * The value that will be transmitted to a Smart Tap certified terminal over NFC for this object.
   * The class level fields `enableSmartTap` and `redemptionIssuers` must also be set up correctly
   * in order for the pass to support Smart Tap. Only ASCII characters are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String smartTapRedemptionValue;

  /**
   * Required. The state of the object. This field is used to determine how an object is displayed
   * in the app. For example, an `inactive` object is moved to the "Expired passes" section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Text module data. If text module data is also defined on the class, both will be displayed. The
   * maximum number of these fields displayed is 10 from the object and 10 from the class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TextModuleData> textModulesData;

  /**
   * The time period this object will be `active` and object can be used. An object's state will be
   * changed to `expired` when this time period has passed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeInterval validTimeInterval;

  /**
   * Deprecated
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long version;

  /**
   * Optional app or website link that will be displayed as a button on the front of the pass. If
   * AppLinkData is provided for the corresponding class only object AppLinkData will be displayed.
   * @return value or {@code null} for none
   */
  public AppLinkData getAppLinkData() {
    return appLinkData;
  }

  /**
   * Optional app or website link that will be displayed as a button on the front of the pass. If
   * AppLinkData is provided for the corresponding class only object AppLinkData will be displayed.
   * @param appLinkData appLinkData or {@code null} for none
   */
  public FlightObject setAppLinkData(AppLinkData appLinkData) {
    this.appLinkData = appLinkData;
    return this;
  }

  /**
   * The barcode type and value.
   * @return value or {@code null} for none
   */
  public Barcode getBarcode() {
    return barcode;
  }

  /**
   * The barcode type and value.
   * @param barcode barcode or {@code null} for none
   */
  public FlightObject setBarcode(Barcode barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Passenger specific information about boarding and seating.
   * @return value or {@code null} for none
   */
  public BoardingAndSeatingInfo getBoardingAndSeatingInfo() {
    return boardingAndSeatingInfo;
  }

  /**
   * Passenger specific information about boarding and seating.
   * @param boardingAndSeatingInfo boardingAndSeatingInfo or {@code null} for none
   */
  public FlightObject setBoardingAndSeatingInfo(BoardingAndSeatingInfo boardingAndSeatingInfo) {
    this.boardingAndSeatingInfo = boardingAndSeatingInfo;
    return this;
  }

  /**
   * Required. The class associated with this object. The class must be of the same type as this
   * object, must already exist, and must be approved. Class IDs should follow the format issuer
   * ID.identifier where the former is issued by Google and latter is chosen by you.
   * @return value or {@code null} for none
   */
  public java.lang.String getClassId() {
    return classId;
  }

  /**
   * Required. The class associated with this object. The class must be of the same type as this
   * object, must already exist, and must be approved. Class IDs should follow the format issuer
   * ID.identifier where the former is issued by Google and latter is chosen by you.
   * @param classId classId or {@code null} for none
   */
  public FlightObject setClassId(java.lang.String classId) {
    this.classId = classId;
    return this;
  }

  /**
   * A copy of the inherited fields of the parent class. These fields are retrieved during a GET.
   * @return value or {@code null} for none
   */
  public FlightClass getClassReference() {
    return classReference;
  }

  /**
   * A copy of the inherited fields of the parent class. These fields are retrieved during a GET.
   * @param classReference classReference or {@code null} for none
   */
  public FlightObject setClassReference(FlightClass classReference) {
    this.classReference = classReference;
    return this;
  }

  /**
   * Indicates if notifications should explicitly be suppressed. If this field is set to true,
   * regardless of the `messages` field, expiration notifications to the user will be suppressed. By
   * default, this field is set to false. Currently, this can only be set for Flights.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableExpirationNotification() {
    return disableExpirationNotification;
  }

  /**
   * Indicates if notifications should explicitly be suppressed. If this field is set to true,
   * regardless of the `messages` field, expiration notifications to the user will be suppressed. By
   * default, this field is set to false. Currently, this can only be set for Flights.
   * @param disableExpirationNotification disableExpirationNotification or {@code null} for none
   */
  public FlightObject setDisableExpirationNotification(java.lang.Boolean disableExpirationNotification) {
    this.disableExpirationNotification = disableExpirationNotification;
    return this;
  }

  /**
   * Information that controls how passes are grouped together.
   * @return value or {@code null} for none
   */
  public GroupingInfo getGroupingInfo() {
    return groupingInfo;
  }

  /**
   * Information that controls how passes are grouped together.
   * @param groupingInfo groupingInfo or {@code null} for none
   */
  public FlightObject setGroupingInfo(GroupingInfo groupingInfo) {
    this.groupingInfo = groupingInfo;
    return this;
  }

  /**
   * Whether this object is currently linked to a single device. This field is set by the platform
   * when a user saves the object, linking it to their device. Intended for use by select partners.
   * Contact support for additional information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasLinkedDevice() {
    return hasLinkedDevice;
  }

  /**
   * Whether this object is currently linked to a single device. This field is set by the platform
   * when a user saves the object, linking it to their device. Intended for use by select partners.
   * Contact support for additional information.
   * @param hasLinkedDevice hasLinkedDevice or {@code null} for none
   */
  public FlightObject setHasLinkedDevice(java.lang.Boolean hasLinkedDevice) {
    this.hasLinkedDevice = hasLinkedDevice;
    return this;
  }

  /**
   * Indicates if the object has users. This field is set by the platform.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasUsers() {
    return hasUsers;
  }

  /**
   * Indicates if the object has users. This field is set by the platform.
   * @param hasUsers hasUsers or {@code null} for none
   */
  public FlightObject setHasUsers(java.lang.Boolean hasUsers) {
    this.hasUsers = hasUsers;
    return this;
  }

  /**
   * Optional banner image displayed on the front of the card. If none is present, hero image of the
   * class, if present, will be displayed. If hero image of the class is also not present, nothing
   * will be displayed.
   * @return value or {@code null} for none
   */
  public Image getHeroImage() {
    return heroImage;
  }

  /**
   * Optional banner image displayed on the front of the card. If none is present, hero image of the
   * class, if present, will be displayed. If hero image of the class is also not present, nothing
   * will be displayed.
   * @param heroImage heroImage or {@code null} for none
   */
  public FlightObject setHeroImage(Image heroImage) {
    this.heroImage = heroImage;
    return this;
  }

  /**
   * The background color for the card. If not set the dominant color of the hero image is used, and
   * if no hero image is set, the dominant color of the logo is used. The format is #rrggbb where
   * rrggbb is a hex RGB triplet, such as `#ffcc00`. You can also use the shorthand version of the
   * RGB triplet which is #rgb, such as `#fc0`.
   * @return value or {@code null} for none
   */
  public java.lang.String getHexBackgroundColor() {
    return hexBackgroundColor;
  }

  /**
   * The background color for the card. If not set the dominant color of the hero image is used, and
   * if no hero image is set, the dominant color of the logo is used. The format is #rrggbb where
   * rrggbb is a hex RGB triplet, such as `#ffcc00`. You can also use the shorthand version of the
   * RGB triplet which is #rgb, such as `#fc0`.
   * @param hexBackgroundColor hexBackgroundColor or {@code null} for none
   */
  public FlightObject setHexBackgroundColor(java.lang.String hexBackgroundColor) {
    this.hexBackgroundColor = hexBackgroundColor;
    return this;
  }

  /**
   * Required. The unique identifier for an object. This ID must be unique across all objects from
   * an issuer. This value should follow the format issuer ID.identifier where the former is issued
   * by Google and latter is chosen by you. The unique identifier should only include alphanumeric
   * characters, '.', '_', or '-'.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The unique identifier for an object. This ID must be unique across all objects from
   * an issuer. This value should follow the format issuer ID.identifier where the former is issued
   * by Google and latter is chosen by you. The unique identifier should only include alphanumeric
   * characters, '.', '_', or '-'.
   * @param id id or {@code null} for none
   */
  public FlightObject setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Image module data. The maximum number of these fields displayed is 1 from object level and 1
   * for class object level.
   * @return value or {@code null} for none
   */
  public java.util.List<ImageModuleData> getImageModulesData() {
    return imageModulesData;
  }

  /**
   * Image module data. The maximum number of these fields displayed is 1 from object level and 1
   * for class object level.
   * @param imageModulesData imageModulesData or {@code null} for none
   */
  public FlightObject setImageModulesData(java.util.List<ImageModuleData> imageModulesData) {
    this.imageModulesData = imageModulesData;
    return this;
  }

  /**
   * Deprecated. Use textModulesData instead.
   * @return value or {@code null} for none
   */
  public InfoModuleData getInfoModuleData() {
    return infoModuleData;
  }

  /**
   * Deprecated. Use textModulesData instead.
   * @param infoModuleData infoModuleData or {@code null} for none
   */
  public FlightObject setInfoModuleData(InfoModuleData infoModuleData) {
    this.infoModuleData = infoModuleData;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * `"walletobjects#flightObject"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * `"walletobjects#flightObject"`.
   * @param kind kind or {@code null} for none
   */
  public FlightObject setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * linked_object_ids are a list of other objects such as event ticket, loyalty, offer, generic,
   * giftcard, transit and boarding pass that should be automatically attached to this flight
   * object. If a user had saved this boarding pass, then these linked_object_ids would be
   * automatically pushed to the user's wallet (unless they turned off the setting to receive such
   * linked passes). Make sure that objects present in linked_object_ids are already inserted - if
   * not, calls would fail. Once linked, the linked objects cannot be unlinked. You cannot link
   * objects belonging to another issuer. There is a limit to the number of objects that can be
   * linked to a single object. After the limit is reached, new linked objects in the call will be
   * ignored silently. Object IDs should follow the format issuer ID. identifier where the former is
   * issued by Google and the latter is chosen by you.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLinkedObjectIds() {
    return linkedObjectIds;
  }

  /**
   * linked_object_ids are a list of other objects such as event ticket, loyalty, offer, generic,
   * giftcard, transit and boarding pass that should be automatically attached to this flight
   * object. If a user had saved this boarding pass, then these linked_object_ids would be
   * automatically pushed to the user's wallet (unless they turned off the setting to receive such
   * linked passes). Make sure that objects present in linked_object_ids are already inserted - if
   * not, calls would fail. Once linked, the linked objects cannot be unlinked. You cannot link
   * objects belonging to another issuer. There is a limit to the number of objects that can be
   * linked to a single object. After the limit is reached, new linked objects in the call will be
   * ignored silently. Object IDs should follow the format issuer ID. identifier where the former is
   * issued by Google and the latter is chosen by you.
   * @param linkedObjectIds linkedObjectIds or {@code null} for none
   */
  public FlightObject setLinkedObjectIds(java.util.List<java.lang.String> linkedObjectIds) {
    this.linkedObjectIds = linkedObjectIds;
    return this;
  }

  /**
   * Links module data. If links module data is also defined on the class, both will be displayed.
   * @return value or {@code null} for none
   */
  public LinksModuleData getLinksModuleData() {
    return linksModuleData;
  }

  /**
   * Links module data. If links module data is also defined on the class, both will be displayed.
   * @param linksModuleData linksModuleData or {@code null} for none
   */
  public FlightObject setLinksModuleData(LinksModuleData linksModuleData) {
    this.linksModuleData = linksModuleData;
    return this;
  }

  /**
   * Note: This field is currently not supported to trigger geo notifications.
   * @return value or {@code null} for none
   */
  public java.util.List<LatLongPoint> getLocations() {
    return locations;
  }

  /**
   * Note: This field is currently not supported to trigger geo notifications.
   * @param locations locations or {@code null} for none
   */
  public FlightObject setLocations(java.util.List<LatLongPoint> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * An array of messages displayed in the app. All users of this object will receive its associated
   * messages. The maximum number of these fields is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<Message> getMessages() {
    return messages;
  }

  /**
   * An array of messages displayed in the app. All users of this object will receive its associated
   * messages. The maximum number of these fields is 10.
   * @param messages messages or {@code null} for none
   */
  public FlightObject setMessages(java.util.List<Message> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Pass constraints for the object. Includes limiting NFC and screenshot behaviors.
   * @return value or {@code null} for none
   */
  public PassConstraints getPassConstraints() {
    return passConstraints;
  }

  /**
   * Pass constraints for the object. Includes limiting NFC and screenshot behaviors.
   * @param passConstraints passConstraints or {@code null} for none
   */
  public FlightObject setPassConstraints(PassConstraints passConstraints) {
    this.passConstraints = passConstraints;
    return this;
  }

  /**
   * Required. Passenger name as it would appear on the boarding pass. eg: "Dave M Gahan" or
   * "Gahan/Dave" or "GAHAN/DAVEM"
   * @return value or {@code null} for none
   */
  public java.lang.String getPassengerName() {
    return passengerName;
  }

  /**
   * Required. Passenger name as it would appear on the boarding pass. eg: "Dave M Gahan" or
   * "Gahan/Dave" or "GAHAN/DAVEM"
   * @param passengerName passengerName or {@code null} for none
   */
  public FlightObject setPassengerName(java.lang.String passengerName) {
    this.passengerName = passengerName;
    return this;
  }

  /**
   * Required. Information about flight reservation.
   * @return value or {@code null} for none
   */
  public ReservationInfo getReservationInfo() {
    return reservationInfo;
  }

  /**
   * Required. Information about flight reservation.
   * @param reservationInfo reservationInfo or {@code null} for none
   */
  public FlightObject setReservationInfo(ReservationInfo reservationInfo) {
    this.reservationInfo = reservationInfo;
    return this;
  }

  /**
   * The rotating barcode type and value.
   * @return value or {@code null} for none
   */
  public RotatingBarcode getRotatingBarcode() {
    return rotatingBarcode;
  }

  /**
   * The rotating barcode type and value.
   * @param rotatingBarcode rotatingBarcode or {@code null} for none
   */
  public FlightObject setRotatingBarcode(RotatingBarcode rotatingBarcode) {
    this.rotatingBarcode = rotatingBarcode;
    return this;
  }

  /**
   * Restrictions on the object that needs to be verified before the user tries to save the pass.
   * Note that this restrictions will only be applied during save time. If the restrictions changed
   * after a user saves the pass, the new restrictions will not be applied to an already saved pass.
   * @return value or {@code null} for none
   */
  public SaveRestrictions getSaveRestrictions() {
    return saveRestrictions;
  }

  /**
   * Restrictions on the object that needs to be verified before the user tries to save the pass.
   * Note that this restrictions will only be applied during save time. If the restrictions changed
   * after a user saves the pass, the new restrictions will not be applied to an already saved pass.
   * @param saveRestrictions saveRestrictions or {@code null} for none
   */
  public FlightObject setSaveRestrictions(SaveRestrictions saveRestrictions) {
    this.saveRestrictions = saveRestrictions;
    return this;
  }

  /**
   * An image for the security program that applies to the passenger.
   * @return value or {@code null} for none
   */
  public Image getSecurityProgramLogo() {
    return securityProgramLogo;
  }

  /**
   * An image for the security program that applies to the passenger.
   * @param securityProgramLogo securityProgramLogo or {@code null} for none
   */
  public FlightObject setSecurityProgramLogo(Image securityProgramLogo) {
    this.securityProgramLogo = securityProgramLogo;
    return this;
  }

  /**
   * The value that will be transmitted to a Smart Tap certified terminal over NFC for this object.
   * The class level fields `enableSmartTap` and `redemptionIssuers` must also be set up correctly
   * in order for the pass to support Smart Tap. Only ASCII characters are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getSmartTapRedemptionValue() {
    return smartTapRedemptionValue;
  }

  /**
   * The value that will be transmitted to a Smart Tap certified terminal over NFC for this object.
   * The class level fields `enableSmartTap` and `redemptionIssuers` must also be set up correctly
   * in order for the pass to support Smart Tap. Only ASCII characters are supported.
   * @param smartTapRedemptionValue smartTapRedemptionValue or {@code null} for none
   */
  public FlightObject setSmartTapRedemptionValue(java.lang.String smartTapRedemptionValue) {
    this.smartTapRedemptionValue = smartTapRedemptionValue;
    return this;
  }

  /**
   * Required. The state of the object. This field is used to determine how an object is displayed
   * in the app. For example, an `inactive` object is moved to the "Expired passes" section.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Required. The state of the object. This field is used to determine how an object is displayed
   * in the app. For example, an `inactive` object is moved to the "Expired passes" section.
   * @param state state or {@code null} for none
   */
  public FlightObject setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Text module data. If text module data is also defined on the class, both will be displayed. The
   * maximum number of these fields displayed is 10 from the object and 10 from the class.
   * @return value or {@code null} for none
   */
  public java.util.List<TextModuleData> getTextModulesData() {
    return textModulesData;
  }

  /**
   * Text module data. If text module data is also defined on the class, both will be displayed. The
   * maximum number of these fields displayed is 10 from the object and 10 from the class.
   * @param textModulesData textModulesData or {@code null} for none
   */
  public FlightObject setTextModulesData(java.util.List<TextModuleData> textModulesData) {
    this.textModulesData = textModulesData;
    return this;
  }

  /**
   * The time period this object will be `active` and object can be used. An object's state will be
   * changed to `expired` when this time period has passed.
   * @return value or {@code null} for none
   */
  public TimeInterval getValidTimeInterval() {
    return validTimeInterval;
  }

  /**
   * The time period this object will be `active` and object can be used. An object's state will be
   * changed to `expired` when this time period has passed.
   * @param validTimeInterval validTimeInterval or {@code null} for none
   */
  public FlightObject setValidTimeInterval(TimeInterval validTimeInterval) {
    this.validTimeInterval = validTimeInterval;
    return this;
  }

  /**
   * Deprecated
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersion() {
    return version;
  }

  /**
   * Deprecated
   * @param version version or {@code null} for none
   */
  public FlightObject setVersion(java.lang.Long version) {
    this.version = version;
    return this;
  }

  @Override
  public FlightObject set(String fieldName, Object value) {
    return (FlightObject) super.set(fieldName, value);
  }

  @Override
  public FlightObject clone() {
    return (FlightObject) super.clone();
  }

}
