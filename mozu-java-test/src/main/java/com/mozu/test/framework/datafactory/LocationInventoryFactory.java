/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.products.LocationInventoryResource;

/** <summary>
 * Use the Product Location Inventory resource to manage the levels of active product inventory to maintain across defined locations at the product level.
 * </summary>
 */
public class LocationInventoryFactory
{

	public static com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(ApiContext apiContext, String productCode, int expectedCode, int successCode) throws Exception
	{
		return getLocationInventories(apiContext,  productCode,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(ApiContext apiContext, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.LocationInventoryCollection returnObj = new com.mozu.api.contracts.productadmin.LocationInventoryCollection();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext);
		try
		{
			returnObj = resource.getLocationInventories( productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(ApiContext apiContext, String productCode, String locationCode, int expectedCode, int successCode) throws Exception
	{
		return getLocationInventory(apiContext,  productCode,  locationCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(ApiContext apiContext, String productCode, String locationCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.LocationInventory returnObj = new com.mozu.api.contracts.productadmin.LocationInventory();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext);
		try
		{
			returnObj = resource.getLocationInventory( productCode,  locationCode,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, int expectedCode, int successCode) throws Exception
	{
		return addLocationInventory(apiContext, dataViewMode,  locationInventoryList,  productCode,  null, expectedCode, successCode );
	}

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, Boolean performUpserts, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.LocationInventory> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addLocationInventory( locationInventoryList,  productCode,  performUpserts);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.LocationInventory> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.LocationInventory>();
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateLocationInventory( locationInventoryAdjustments,  productCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static void deleteLocationInventory(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String locationCode, int expectedCode, int successCode) throws Exception
	{
		LocationInventoryResource resource = new LocationInventoryResource(apiContext, dataViewMode);
		try
		{
			resource.deleteLocationInventory( productCode,  locationCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



