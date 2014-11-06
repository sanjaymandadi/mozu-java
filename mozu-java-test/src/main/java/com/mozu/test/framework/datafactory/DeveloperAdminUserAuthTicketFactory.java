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
import com.mozu.api.resources.platform.developer.DeveloperAdminUserAuthTicketResource;

/** <summary>
 * Use this resource to manage authentication tickets for your developer account.
 * </summary>
 */
public class DeveloperAdminUserAuthTicketFactory
{

	public static com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, int expectedCode, int successCode) throws Exception
	{
		return createDeveloperUserAuthTicket(apiContext,  userAuthInfo,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(ApiContext apiContext, com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer developerAccountId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket returnObj = new com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket();
		DeveloperAdminUserAuthTicketResource resource = new DeveloperAdminUserAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.createDeveloperUserAuthTicket( userAuthInfo,  developerAccountId,  responseFields);
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

	public static com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(ApiContext apiContext, com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket, int expectedCode, int successCode) throws Exception
	{
		return refreshDeveloperAuthTicket(apiContext,  existingAuthTicket,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(ApiContext apiContext, com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket existingAuthTicket, Integer developerAccountId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket returnObj = new com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket();
		DeveloperAdminUserAuthTicketResource resource = new DeveloperAdminUserAuthTicketResource(apiContext);
		try
		{
			returnObj = resource.refreshDeveloperAuthTicket( existingAuthTicket,  developerAccountId,  responseFields);
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

	public static void deleteUserAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode, int successCode) throws Exception
	{
		DeveloperAdminUserAuthTicketResource resource = new DeveloperAdminUserAuthTicketResource(apiContext);
		try
		{
			resource.deleteUserAuthTicket( refreshToken);
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



