/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use this subresource to apply coupons to or remove coupons from an order based on a supplied coupon code.
 * </summary>
 */
public class AppliedDiscountClient {
	
	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyCouponClient( orderId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyCouponClient(String orderId, String couponCode) throws Exception
	{
		return applyCouponClient( orderId,  couponCode,  null,  null);
	}

	/**
	 * Apply a coupon to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ApplyCouponClient( orderId,  couponCode,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	 * @param updateMode Specifies whether to apply the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> applyCouponClient(String orderId, String couponCode, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AppliedDiscountUrl.applyCouponUrl(couponCode, orderId, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveCouponClient( orderId,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order with the coupon to remove.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeCouponClient(String orderId, String couponCode) throws Exception
	{
		return removeCouponClient( orderId,  couponCode,  null,  null);
	}

	/**
	 * Removes a coupon previously applied to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveCouponClient( orderId,  couponCode,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param couponCode Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 * @param orderId Unique identifier of the order with the coupon to remove.
	 * @param updateMode Specifies whether to remove the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeCouponClient(String orderId, String couponCode, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AppliedDiscountUrl.removeCouponUrl(couponCode, orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveCouponsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the coupons to remove.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeCouponsClient(String orderId) throws Exception
	{
		return removeCouponsClient( orderId,  null,  null);
	}

	/**
	 * Removes all coupons previously applied to the order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=RemoveCouponsClient( orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order with the coupons to remove.
	 * @param updateMode Specifies whether to remove coupons by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> removeCouponsClient(String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.AppliedDiscountUrl.removeCouponsUrl(orderId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



