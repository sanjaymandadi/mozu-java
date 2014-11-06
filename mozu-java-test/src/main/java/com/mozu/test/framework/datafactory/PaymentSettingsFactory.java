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
import com.mozu.api.resources.commerce.settings.checkout.PaymentSettingsResource;

/** <summary>
 * Use the Payment Settings resource to specify settings when creating payments for order checkout on the site.
 * </summary>
 */
public class PaymentSettingsFactory
{

	public static List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> getThirdPartyPaymentWorkflows(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> returnObj = new ArrayList<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>();
		PaymentSettingsResource resource = new PaymentSettingsResource(apiContext);
		try
		{
			returnObj = resource.getThirdPartyPaymentWorkflows();
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



