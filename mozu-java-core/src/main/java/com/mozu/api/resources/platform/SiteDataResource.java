/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the site data resource to store site-level information required for a third-party application in the Mozu database.
 * </summary>
 */
public class SiteDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SiteDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the value of a record in the Mozu database.
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	string string = sitedata.getDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery) throws Exception
	{
		return getDBValue( dbEntryQuery,  null);
	}

	/**
	 * Retrieves the value of a record in the Mozu database.
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	string string = sitedata.getDBValue( dbEntryQuery,  responseFields);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery, String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.platform.SiteDataClient.getDBValueClient( dbEntryQuery,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	sitedata.createDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param value The value string to create.
	 * @return 
	 * @see string
	 */
	public void createDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.createDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Updates a record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	sitedata.updateDBValue( value,  dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param value The database value to update.
	 * @return 
	 * @see string
	 */
	public void updateDBValue(String value, String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.updateDBValueClient( value,  dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Removes a previously defined record in the Mozu database.
	 * <p><pre><code>
	 *	SiteData sitedata = new SiteData();
	 *	sitedata.deleteDBValue( dbEntryQuery);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @return 
	 */
	public void deleteDBValue(String dbEntryQuery) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.SiteDataClient.deleteDBValueClient( dbEntryQuery);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



