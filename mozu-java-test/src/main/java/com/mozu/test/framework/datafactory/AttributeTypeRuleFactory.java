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
import com.mozu.api.resources.commerce.catalog.admin.attributedefinition.attributes.AttributeTypeRuleResource;

/** <summary>
 * Type rules are subresources of product attributes which could be specifications that can be shared across products in a store or assigned to specific products. Attribute type rules provide definitions of how attribute types will appear on the user interface.
 * </summary>
 */
public class AttributeTypeRuleFactory
{

	public static com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getAttributeTypeRules(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection getAttributeTypeRules(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection returnObj = new com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection();
		AttributeTypeRuleResource resource = new AttributeTypeRuleResource(apiContext);
		try
		{
			returnObj = resource.getAttributeTypeRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

}



