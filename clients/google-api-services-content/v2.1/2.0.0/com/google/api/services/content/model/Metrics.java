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

package com.google.api.services.content.model;

/**
 * Performance metrics. Values are only set for metrics requested explicitly in the request's search
 * query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metrics extends com.google.api.client.json.GenericJson {

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order size - the average number of items in an order. **This metric cannot be
   * segmented by product dimensions and customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double aos;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order value in micros (1 millionth of a standard unit, 1 USD = 1000000 micros) -
   * the average value (total price of items) of all placed orders. The currency of the returned
   * value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double aovMicros;

  /**
   * Number of clicks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long clicks;

  /**
   * Number of conversions divided by the number of clicks, reported on the impression date. The
   * metric is currently available only for the `FREE_PRODUCT_LISTING` program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double conversionRate;

  /**
   * Value of conversions in micros (1 millionth of a standard unit, 1 USD = 1000000 micros)
   * attributed to the product, reported on the conversion date. The metric is currently available
   * only for the `FREE_PRODUCT_LISTING` program. The currency of the returned value is stored in
   * the currency_code segment. If this metric is selected, 'segments.currency_code' is
   * automatically added to the SELECT clause in the search query (unless it is explicitly selected
   * by the user) and the currency_code segment is populated in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long conversionValueMicros;

  /**
   * Number of conversions attributed to the product, reported on the conversion date. Depending on
   * the attribution model, a conversion might be distributed across multiple clicks, where each
   * click gets its own credit assigned. This metric is a sum of all such credits. The metric is
   * currently available only for the `FREE_PRODUCT_LISTING` program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double conversions;

  /**
   * Click-through rate - the number of clicks merchant's products receive (clicks) divided by the
   * number of times the products are shown (impressions).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double ctr;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an order being placed and the order being fully shipped,
   * reported on the last shipment date. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double daysToShip;

  /**
   * Number of times merchant's products are shown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long impressions;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an item being ordered and the item being **This metric
   * cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double itemDaysToShip;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Percentage of shipped items in relation to all finalized items (shipped or rejected by
   * the merchant; unshipped items are not taken into account), reported on the order date. Item
   * fill rate is lowered by merchant rejections. **This metric cannot be segmented by
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double itemFillRate;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros). Excludes shipping, taxes (US only), and customer cancellations that happened within 30
   * minutes of placing the order. The currency of the returned value is stored in the currency_code
   * segment. If this metric is selected, 'segments.currency_code' is automatically added to the
   * SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long orderedItemSalesMicros;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long orderedItems;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of placed orders. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long orders;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items canceled by the merchant, reported on the order date. **This
   * metric cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rejectedItems;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of returned items divided by the total price of shipped items, reported on
   * the order date. If this metric is selected, 'segments.currency_code' is automatically added to
   * the SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double returnRate;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items sent back for return, reported on the date when the merchant
   * accepted the return. **This metric cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long returnedItems;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items sent back for return in micros (1 millionth of a standard
   * unit, 1 USD = 1000000 micros), reported on the date when the merchant accepted the return. The
   * currency of the returned value is stored in the currency_code segment. If this metric is
   * selected, 'segments.currency_code' is automatically added to the SELECT clause in the search
   * query (unless it is explicitly selected by the user) and the currency_code segment is populated
   * in the response. **This metric cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long returnsMicros;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of shipped items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros), reported on the order date. Excludes shipping and taxes (US only). The currency of the
   * returned value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shippedItemSalesMicros;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of shipped items, reported on the shipment date. **This metric cannot be segmented
   * by customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shippedItems;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of fully shipped orders, reported on the last shipment date. **This metric cannot
   * be segmented by product dimensions and customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shippedOrders;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items not shipped up until the end of the queried day. If a multi-day
   * period is specified in the search query, the returned value is the average number of unshipped
   * items over the days in the queried period. **This metric cannot be segmented by
   * customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unshippedItems;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of orders not shipped or partially shipped up until the end of the queried day. If
   * a multi-day period is specified in the search query, the returned value is the average number
   * of unshipped orders over the days in the queried period. **This metric cannot be segmented by
   * product dimensions and customer_country_code.**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unshippedOrders;

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order size - the average number of items in an order. **This metric cannot be
   * segmented by product dimensions and customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getAos() {
    return aos;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order size - the average number of items in an order. **This metric cannot be
   * segmented by product dimensions and customer_country_code.**
   * @param aos aos or {@code null} for none
   */
  public Metrics setAos(java.lang.Double aos) {
    this.aos = aos;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order value in micros (1 millionth of a standard unit, 1 USD = 1000000 micros) -
   * the average value (total price of items) of all placed orders. The currency of the returned
   * value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getAovMicros() {
    return aovMicros;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average order value in micros (1 millionth of a standard unit, 1 USD = 1000000 micros) -
   * the average value (total price of items) of all placed orders. The currency of the returned
   * value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @param aovMicros aovMicros or {@code null} for none
   */
  public Metrics setAovMicros(java.lang.Double aovMicros) {
    this.aovMicros = aovMicros;
    return this;
  }

  /**
   * Number of clicks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getClicks() {
    return clicks;
  }

  /**
   * Number of clicks.
   * @param clicks clicks or {@code null} for none
   */
  public Metrics setClicks(java.lang.Long clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * Number of conversions divided by the number of clicks, reported on the impression date. The
   * metric is currently available only for the `FREE_PRODUCT_LISTING` program.
   * @return value or {@code null} for none
   */
  public java.lang.Double getConversionRate() {
    return conversionRate;
  }

  /**
   * Number of conversions divided by the number of clicks, reported on the impression date. The
   * metric is currently available only for the `FREE_PRODUCT_LISTING` program.
   * @param conversionRate conversionRate or {@code null} for none
   */
  public Metrics setConversionRate(java.lang.Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Value of conversions in micros (1 millionth of a standard unit, 1 USD = 1000000 micros)
   * attributed to the product, reported on the conversion date. The metric is currently available
   * only for the `FREE_PRODUCT_LISTING` program. The currency of the returned value is stored in
   * the currency_code segment. If this metric is selected, 'segments.currency_code' is
   * automatically added to the SELECT clause in the search query (unless it is explicitly selected
   * by the user) and the currency_code segment is populated in the response.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConversionValueMicros() {
    return conversionValueMicros;
  }

  /**
   * Value of conversions in micros (1 millionth of a standard unit, 1 USD = 1000000 micros)
   * attributed to the product, reported on the conversion date. The metric is currently available
   * only for the `FREE_PRODUCT_LISTING` program. The currency of the returned value is stored in
   * the currency_code segment. If this metric is selected, 'segments.currency_code' is
   * automatically added to the SELECT clause in the search query (unless it is explicitly selected
   * by the user) and the currency_code segment is populated in the response.
   * @param conversionValueMicros conversionValueMicros or {@code null} for none
   */
  public Metrics setConversionValueMicros(java.lang.Long conversionValueMicros) {
    this.conversionValueMicros = conversionValueMicros;
    return this;
  }

  /**
   * Number of conversions attributed to the product, reported on the conversion date. Depending on
   * the attribution model, a conversion might be distributed across multiple clicks, where each
   * click gets its own credit assigned. This metric is a sum of all such credits. The metric is
   * currently available only for the `FREE_PRODUCT_LISTING` program.
   * @return value or {@code null} for none
   */
  public java.lang.Double getConversions() {
    return conversions;
  }

  /**
   * Number of conversions attributed to the product, reported on the conversion date. Depending on
   * the attribution model, a conversion might be distributed across multiple clicks, where each
   * click gets its own credit assigned. This metric is a sum of all such credits. The metric is
   * currently available only for the `FREE_PRODUCT_LISTING` program.
   * @param conversions conversions or {@code null} for none
   */
  public Metrics setConversions(java.lang.Double conversions) {
    this.conversions = conversions;
    return this;
  }

  /**
   * Click-through rate - the number of clicks merchant's products receive (clicks) divided by the
   * number of times the products are shown (impressions).
   * @return value or {@code null} for none
   */
  public java.lang.Double getCtr() {
    return ctr;
  }

  /**
   * Click-through rate - the number of clicks merchant's products receive (clicks) divided by the
   * number of times the products are shown (impressions).
   * @param ctr ctr or {@code null} for none
   */
  public Metrics setCtr(java.lang.Double ctr) {
    this.ctr = ctr;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an order being placed and the order being fully shipped,
   * reported on the last shipment date. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getDaysToShip() {
    return daysToShip;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an order being placed and the order being fully shipped,
   * reported on the last shipment date. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @param daysToShip daysToShip or {@code null} for none
   */
  public Metrics setDaysToShip(java.lang.Double daysToShip) {
    this.daysToShip = daysToShip;
    return this;
  }

  /**
   * Number of times merchant's products are shown.
   * @return value or {@code null} for none
   */
  public java.lang.Long getImpressions() {
    return impressions;
  }

  /**
   * Number of times merchant's products are shown.
   * @param impressions impressions or {@code null} for none
   */
  public Metrics setImpressions(java.lang.Long impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an item being ordered and the item being **This metric
   * cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getItemDaysToShip() {
    return itemDaysToShip;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Average number of days between an item being ordered and the item being **This metric
   * cannot be segmented by customer_country_code.**
   * @param itemDaysToShip itemDaysToShip or {@code null} for none
   */
  public Metrics setItemDaysToShip(java.lang.Double itemDaysToShip) {
    this.itemDaysToShip = itemDaysToShip;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Percentage of shipped items in relation to all finalized items (shipped or rejected by
   * the merchant; unshipped items are not taken into account), reported on the order date. Item
   * fill rate is lowered by merchant rejections. **This metric cannot be segmented by
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getItemFillRate() {
    return itemFillRate;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Percentage of shipped items in relation to all finalized items (shipped or rejected by
   * the merchant; unshipped items are not taken into account), reported on the order date. Item
   * fill rate is lowered by merchant rejections. **This metric cannot be segmented by
   * customer_country_code.**
   * @param itemFillRate itemFillRate or {@code null} for none
   */
  public Metrics setItemFillRate(java.lang.Double itemFillRate) {
    this.itemFillRate = itemFillRate;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros). Excludes shipping, taxes (US only), and customer cancellations that happened within 30
   * minutes of placing the order. The currency of the returned value is stored in the currency_code
   * segment. If this metric is selected, 'segments.currency_code' is automatically added to the
   * SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getOrderedItemSalesMicros() {
    return orderedItemSalesMicros;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros). Excludes shipping, taxes (US only), and customer cancellations that happened within 30
   * minutes of placing the order. The currency of the returned value is stored in the currency_code
   * segment. If this metric is selected, 'segments.currency_code' is automatically added to the
   * SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * @param orderedItemSalesMicros orderedItemSalesMicros or {@code null} for none
   */
  public Metrics setOrderedItemSalesMicros(java.lang.Long orderedItemSalesMicros) {
    this.orderedItemSalesMicros = orderedItemSalesMicros;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getOrderedItems() {
    return orderedItems;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by customer_country_code.**
   * @param orderedItems orderedItems or {@code null} for none
   */
  public Metrics setOrderedItems(java.lang.Long orderedItems) {
    this.orderedItems = orderedItems;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of placed orders. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getOrders() {
    return orders;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of placed orders. Excludes customer cancellations that happened within 30 minutes
   * of placing the order. **This metric cannot be segmented by product dimensions and
   * customer_country_code.**
   * @param orders orders or {@code null} for none
   */
  public Metrics setOrders(java.lang.Long orders) {
    this.orders = orders;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items canceled by the merchant, reported on the order date. **This
   * metric cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getRejectedItems() {
    return rejectedItems;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items canceled by the merchant, reported on the order date. **This
   * metric cannot be segmented by customer_country_code.**
   * @param rejectedItems rejectedItems or {@code null} for none
   */
  public Metrics setRejectedItems(java.lang.Long rejectedItems) {
    this.rejectedItems = rejectedItems;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of returned items divided by the total price of shipped items, reported on
   * the order date. If this metric is selected, 'segments.currency_code' is automatically added to
   * the SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getReturnRate() {
    return returnRate;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of returned items divided by the total price of shipped items, reported on
   * the order date. If this metric is selected, 'segments.currency_code' is automatically added to
   * the SELECT clause in the search query (unless it is explicitly selected by the user) and the
   * currency_code segment is populated in the response. **This metric cannot be segmented by
   * customer_country_code.**
   * @param returnRate returnRate or {@code null} for none
   */
  public Metrics setReturnRate(java.lang.Double returnRate) {
    this.returnRate = returnRate;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items sent back for return, reported on the date when the merchant
   * accepted the return. **This metric cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getReturnedItems() {
    return returnedItems;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items sent back for return, reported on the date when the merchant
   * accepted the return. **This metric cannot be segmented by customer_country_code.**
   * @param returnedItems returnedItems or {@code null} for none
   */
  public Metrics setReturnedItems(java.lang.Long returnedItems) {
    this.returnedItems = returnedItems;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items sent back for return in micros (1 millionth of a standard
   * unit, 1 USD = 1000000 micros), reported on the date when the merchant accepted the return. The
   * currency of the returned value is stored in the currency_code segment. If this metric is
   * selected, 'segments.currency_code' is automatically added to the SELECT clause in the search
   * query (unless it is explicitly selected by the user) and the currency_code segment is populated
   * in the response. **This metric cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getReturnsMicros() {
    return returnsMicros;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of ordered items sent back for return in micros (1 millionth of a standard
   * unit, 1 USD = 1000000 micros), reported on the date when the merchant accepted the return. The
   * currency of the returned value is stored in the currency_code segment. If this metric is
   * selected, 'segments.currency_code' is automatically added to the SELECT clause in the search
   * query (unless it is explicitly selected by the user) and the currency_code segment is populated
   * in the response. **This metric cannot be segmented by customer_country_code.**
   * @param returnsMicros returnsMicros or {@code null} for none
   */
  public Metrics setReturnsMicros(java.lang.Long returnsMicros) {
    this.returnsMicros = returnsMicros;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of shipped items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros), reported on the order date. Excludes shipping and taxes (US only). The currency of the
   * returned value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getShippedItemSalesMicros() {
    return shippedItemSalesMicros;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Total price of shipped items in micros (1 millionth of a standard unit, 1 USD = 1000000
   * micros), reported on the order date. Excludes shipping and taxes (US only). The currency of the
   * returned value is stored in the currency_code segment. If this metric is selected,
   * 'segments.currency_code' is automatically added to the SELECT clause in the search query
   * (unless it is explicitly selected by the user) and the currency_code segment is populated in
   * the response. **This metric cannot be segmented by customer_country_code.**
   * @param shippedItemSalesMicros shippedItemSalesMicros or {@code null} for none
   */
  public Metrics setShippedItemSalesMicros(java.lang.Long shippedItemSalesMicros) {
    this.shippedItemSalesMicros = shippedItemSalesMicros;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of shipped items, reported on the shipment date. **This metric cannot be segmented
   * by customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getShippedItems() {
    return shippedItems;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of shipped items, reported on the shipment date. **This metric cannot be segmented
   * by customer_country_code.**
   * @param shippedItems shippedItems or {@code null} for none
   */
  public Metrics setShippedItems(java.lang.Long shippedItems) {
    this.shippedItems = shippedItems;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of fully shipped orders, reported on the last shipment date. **This metric cannot
   * be segmented by product dimensions and customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Long getShippedOrders() {
    return shippedOrders;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of fully shipped orders, reported on the last shipment date. **This metric cannot
   * be segmented by product dimensions and customer_country_code.**
   * @param shippedOrders shippedOrders or {@code null} for none
   */
  public Metrics setShippedOrders(java.lang.Long shippedOrders) {
    this.shippedOrders = shippedOrders;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items not shipped up until the end of the queried day. If a multi-day
   * period is specified in the search query, the returned value is the average number of unshipped
   * items over the days in the queried period. **This metric cannot be segmented by
   * customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnshippedItems() {
    return unshippedItems;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of ordered items not shipped up until the end of the queried day. If a multi-day
   * period is specified in the search query, the returned value is the average number of unshipped
   * items over the days in the queried period. **This metric cannot be segmented by
   * customer_country_code.**
   * @param unshippedItems unshippedItems or {@code null} for none
   */
  public Metrics setUnshippedItems(java.lang.Double unshippedItems) {
    this.unshippedItems = unshippedItems;
    return this;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of orders not shipped or partially shipped up until the end of the queried day. If
   * a multi-day period is specified in the search query, the returned value is the average number
   * of unshipped orders over the days in the queried period. **This metric cannot be segmented by
   * product dimensions and customer_country_code.**
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnshippedOrders() {
    return unshippedOrders;
  }

  /**
   * *Deprecated*: This field is no longer supported and retrieving it returns 0 starting from May
   * 2024. Number of orders not shipped or partially shipped up until the end of the queried day. If
   * a multi-day period is specified in the search query, the returned value is the average number
   * of unshipped orders over the days in the queried period. **This metric cannot be segmented by
   * product dimensions and customer_country_code.**
   * @param unshippedOrders unshippedOrders or {@code null} for none
   */
  public Metrics setUnshippedOrders(java.lang.Double unshippedOrders) {
    this.unshippedOrders = unshippedOrders;
    return this;
  }

  @Override
  public Metrics set(String fieldName, Object value) {
    return (Metrics) super.set(fieldName, value);
  }

  @Override
  public Metrics clone() {
    return (Metrics) super.clone();
  }

}
