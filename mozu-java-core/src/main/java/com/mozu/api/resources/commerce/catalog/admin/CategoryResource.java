/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.GetCategories(dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getCategories(dataViewMode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.GetCategories(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoriesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.GetCategory(dataViewMode,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoryClient(dataViewMode,  categoryId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the subcategories of a category. This is a list of subcategories at the same level (siblings). Use a list of siblings, for example, to display the categories in a horizontal list.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.GetChildCategories(dataViewMode,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category whose subcategories are retrieved.
	 * @return com.mozu.api.contracts.productadmin.CategoryCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getChildCategoriesClient(dataViewMode,  categoryId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy. If a ParentCategoryID is not specified, the new category becomes a top-level category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.AddCategory(dataViewMode,  category);
	 * </code></pre></p>
	 * @param category Properties of the new category. Required properties: ParentCategoryID and Content.Name.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategory(dataViewMode,  category,  null);
	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy. If a ParentCategoryID is not specified, the new category becomes a top-level category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.AddCategory(dataViewMode,  category,  incrementSequence);
	 * </code></pre></p>
	 * @param incrementSequence 
	 * @param category Properties of the new category. Required properties: ParentCategoryID and Content.Name.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addCategoryClient(dataViewMode,  category,  incrementSequence);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information to maintain for the category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.UpdateCategory(dataViewMode,  category,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category Properties of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategory(dataViewMode,  category,  categoryId,  null);
	}

	/**
	 * Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information to maintain for the category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.UpdateCategory(dataViewMode,  category,  categoryId,  cascadeVisibility);
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category Properties of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.updateCategoryClient(dataViewMode,  category,  categoryId,  cascadeVisibility);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.DeleteCategoryById(dataViewMode,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to delete.
	 * @return 
	 */
	public void deleteCategoryById(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		deleteCategoryById(dataViewMode,  categoryId,  null);
	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.DeleteCategoryById(dataViewMode,  categoryId,  cascadeDelete);
	 * </code></pre></p>
	 * @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Default: False.
	 * @param categoryId Unique identifier of the category to delete.
	 * @return 
	 */
	public void deleteCategoryById(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, Boolean cascadeDelete) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.deleteCategoryByIdClient(dataViewMode,  categoryId,  cascadeDelete);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



