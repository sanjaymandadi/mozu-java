/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Specify sitewide settings to determine how checkout and order processing behaves. This service includes payment settings, customer checkout settings, and order processing settings.
 * </summary>
 */
public class CheckoutSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public CheckoutSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 *	CheckoutSettings checkoutsettings = new CheckoutSettings();
	 *	CheckoutSettings checkoutSettings = checkoutsettings.GetCheckoutSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CheckoutSettings getCheckoutSettings() throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> client = com.mozu.api.clients.commerce.settings.CheckoutSettingsClient.getCheckoutSettingsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



