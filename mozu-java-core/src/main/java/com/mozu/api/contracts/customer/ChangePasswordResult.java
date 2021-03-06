/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Mozu.Customer.Contracts.ChangePasswordResult ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangePasswordResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer account generated by the system. Account IDs are generated at account creation.
	 */
	protected Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * Mozu.Customer.Contracts.ChangePasswordResult errorMessage ApiTypeMember DOCUMENT_HERE 
	 */
	protected String errorMessage;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Mozu.Customer.Contracts.ChangePasswordResult succeeded ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean succeeded;

	public Boolean getSucceeded() {
		return this.succeeded;
	}

	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}

}
