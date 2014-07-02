/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.wishlists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Wish List Items subresource to manage items in a shopper wish list. The same product can be defined as an item in any number of wish lists for the customer account. Use the Wish Lists resource to manage shopper wish lists.
 * </summary>
 */
public class WishlistItemResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public WishlistItemResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the details of an item in a shopper wish list.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.GetWishlistItem( wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list item to retrieve.
	 * @param wishlistItemId Unique identifier of the wish list associated with the item to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem getWishlistItem(String wishlistId, String wishlistItemId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemClient( wishlistId,  wishlistItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of items in a shopper wish list according to any specified filter and sort criteria.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.GetWishlistItems( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list associated with the items to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItems(String wishlistId) throws Exception
	{
		return getWishlistItems( wishlistId,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of items in a shopper wish list according to any specified filter and sort criteria.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.GetWishlistItems( wishlistId,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param wishlistId Unique identifier of the wish list associated with the items to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItems(String wishlistId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemsClient( wishlistId,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.GetWishlistItemsByWishlistName( customerAccountId,  wishlistName);
	 * </code></pre></p>
	 * @param customerAccountId 
	 * @param wishlistName 
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItemsByWishlistName(Integer customerAccountId, String wishlistName) throws Exception
	{
		return getWishlistItemsByWishlistName( customerAccountId,  wishlistName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItemCollection wishlistItemCollection = wishlistitem.GetWishlistItemsByWishlistName( customerAccountId,  wishlistName,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param customerAccountId 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param wishlistName 
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection getWishlistItemsByWishlistName(Integer customerAccountId, String wishlistName, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.getWishlistItemsByWishlistNameClient( customerAccountId,  wishlistName,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a product in a site's catalog as an item in a shopper wish list.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.AddItemToWishlist( wishlistItem,  wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list associated with the item to add.
	 * @param wishlistItem Properties of the item to add to the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem addItemToWishlist(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.addItemToWishlistClient( wishlistItem,  wishlistId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of an item in a shopper wish list.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.UpdateWishlistItem( wishlistItem,  wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list associated with the item to update.
	 * @param wishlistItemId Unique identifier of the item in the shopper wish list to update.
	 * @param wishlistItem Properties of the shopper wish list item to update.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItem(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.updateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the quantity of an item in a shopper wish list.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	WishlistItem wishlistItem = wishlistitem.UpdateWishlistItemQuantity( wishlistId,  wishlistItemId,  quantity);
	 * </code></pre></p>
	 * @param quantity The quantity of the item in the wish list.
	 * @param wishlistId Unique identifier of the wish list associated with the item quantity to update.
	 * @param wishlistItemId Unique identifier of the item in the wish list to update quantity.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem updateWishlistItemQuantity(String wishlistId, String wishlistItemId, Integer quantity) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.updateWishlistItemQuantityClient( wishlistId,  wishlistItemId,  quantity);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes all items associated with a shopper wish list.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	Wishlist wishlist = wishlistitem.RemoveAllWishlistItems( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list associated with the items to remove.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist removeAllWishlistItems(String wishlistId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.removeAllWishlistItemsClient( wishlistId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes an item from the wish list specified in the request.
	 * <p><pre><code>
	 *	WishlistItem wishlistitem = new WishlistItem();
	 *	wishlistitem.DeleteWishlistItem( wishlistId,  wishlistItemId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list associated with the item to remove.
	 * @param wishlistItemId Unique identifier of the item to remove from the shopper wish list.
	 * @return 
	 */
	public void deleteWishlistItem(String wishlistId, String wishlistItemId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.wishlists.WishlistItemClient.deleteWishlistItemClient( wishlistId,  wishlistItemId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



