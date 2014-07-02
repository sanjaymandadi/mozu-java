/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class AppliedDiscountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public AppliedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.ApplyCoupon( cartId,  couponCode);
	 * </code></pre></p>
	 * @param cartId 
	 * @param couponCode 
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart applyCoupon(String cartId, String couponCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.applyCouponClient( cartId,  couponCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.RemoveCoupons( cartId);
	 * </code></pre></p>
	 * @param cartId 
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupons(String cartId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.removeCouponsClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	AppliedDiscount applieddiscount = new AppliedDiscount();
	 *	Cart cart = applieddiscount.RemoveCoupon( cartId,  couponCode);
	 * </code></pre></p>
	 * @param cartId 
	 * @param couponCode 
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart removeCoupon(String cartId, String couponCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.carts.AppliedDiscountClient.removeCouponClient( cartId,  couponCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



