/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Use the product variations sub-resource to manage the variations of a product based on its attributes. For example, a t-shirt product could be offered in six variations: Small Black, Medium Black, Large Black, Small White, Medium White, and Large White.
 * </summary>
 */
public class ProductVariationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductVariationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductVariationResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.getProductVariationLocalizedDeltaPrices( productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode 
	 * @param variationKey 
	 * @return List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPrices(String productCode, String variationKey) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.getProductVariationLocalizedDeltaPricesClient(_dataViewMode,  productCode,  variationKey);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.getProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param productCode 
	 * @param variationKey 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode) throws Exception
	{
		return getProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.getProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice getProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.getProductVariationLocalizedDeltaPriceClient(_dataViewMode,  productCode,  variationKey,  currencyCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a product variation based on the supplied product code and variation key.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariation productVariation = productvariation.getProductVariation( productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public com.mozu.api.contracts.productadmin.ProductVariation getProductVariation(String productCode, String variationKey) throws Exception
	{
		return getProductVariation( productCode,  variationKey,  null);
	}

	/**
	 * Retrieves the details of a product variation based on the supplied product code and variation key.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariation productVariation = productvariation.getProductVariation( productCode,  variationKey,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public com.mozu.api.contracts.productadmin.ProductVariation getProductVariation(String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.getProductVariationClient(_dataViewMode,  productCode,  variationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationPagedCollection productVariationPagedCollection = productvariation.getProductVariations( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(String productCode) throws Exception
	{
		return getProductVariations( productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationPagedCollection productVariationPagedCollection = productvariation.getProductVariations( productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.getProductVariationsClient(_dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.addProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode 
	 * @param variationKey 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey) throws Exception
	{
		return addProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.addProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  responseFields);
	 * </code></pre></p>
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice addProductVariationLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.addProductVariationLocalizedDeltaPriceClient(_dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.updateProductVariationLocalizedDeltaPrices( localizedDeltaPrice,  productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode 
	 * @param variationKey 
	 * @param localizedDeltaPrice 
	 * @return List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPrices(List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> localizedDeltaPrice, String productCode, String variationKey) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.updateProductVariationLocalizedDeltaPricesClient(_dataViewMode,  localizedDeltaPrice,  productCode,  variationKey);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.updateProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param productCode 
	 * @param variationKey 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode) throws Exception
	{
		return updateProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationDeltaPrice productVariationDeltaPrice = productvariation.updateProductVariationLocalizedDeltaPrice( localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey 
	 * @param localizedDeltaPrice 
	 * @return com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice updateProductVariationLocalizedDeltaPrice(com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.updateProductVariationLocalizedDeltaPriceClient(_dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies the details of a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariation productVariation = productvariation.updateProductVariation( productVariation,  productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param productVariation Wrapper for the properties of the specified product variation.
	 * @return com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public com.mozu.api.contracts.productadmin.ProductVariation updateProductVariation(com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey) throws Exception
	{
		return updateProductVariation( productVariation,  productCode,  variationKey,  null);
	}

	/**
	 * Modifies the details of a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariation productVariation = productvariation.updateProductVariation( productVariation,  productCode,  variationKey,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param productVariation Wrapper for the properties of the specified product variation.
	 * @return com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public com.mozu.api.contracts.productadmin.ProductVariation updateProductVariation(com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.updateProductVariationClient(_dataViewMode,  productVariation,  productCode,  variationKey,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies the collection of variations for the specified product code. Because this PUT replaces the existing resource, supply all information necessary to maintain for the product variation.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationCollection productVariationCollection = productvariation.updateProductVariations( productVariations,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productVariations Wrapper for the collection of variations configured for the specified product code.
	 * @return com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationCollection updateProductVariations(com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode) throws Exception
	{
		return updateProductVariations( productVariations,  productCode,  null);
	}

	/**
	 * Modifies the collection of variations for the specified product code. Because this PUT replaces the existing resource, supply all information necessary to maintain for the product variation.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	ProductVariationCollection productVariationCollection = productvariation.updateProductVariations( productVariations,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @param productVariations Wrapper for the collection of variations configured for the specified product code.
	 * @return com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductVariationCollection updateProductVariations(com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.updateProductVariationsClient(_dataViewMode,  productVariations,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	productvariation.deleteProductVariation( productCode,  variationKey);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return 
	 */
	public void deleteProductVariation(String productCode, String variationKey) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.deleteProductVariationClient(_dataViewMode,  productCode,  variationKey);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductVariation productvariation = new ProductVariation();
	 *	productvariation.deleteProductVariationLocalizedDeltaPrice( productCode,  variationKey,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param productCode 
	 * @param variationKey 
	 * @return 
	 */
	public void deleteProductVariationLocalizedDeltaPrice(String productCode, String variationKey, String currencyCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductVariationClient.deleteProductVariationLocalizedDeltaPriceClient(_dataViewMode,  productCode,  variationKey,  currencyCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



