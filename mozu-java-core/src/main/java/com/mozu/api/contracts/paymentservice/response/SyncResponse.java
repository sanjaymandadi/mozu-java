/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.response;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Mozu.PaymentService.Contracts.Response.SyncResponse ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyncResponse implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Mozu.PaymentService.Contracts.Response.SyncResponse isSuccessful ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean isSuccessful;

	public Boolean getIsSuccessful() {
		return this.isSuccessful;
	}

	public void setIsSuccessful(Boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	/**
	 * Credit card Number Part
	 */
	protected String numberPart;

	public String getNumberPart() {
		return this.numberPart;
	}

	public void setNumberPart(String numberPart) {
		this.numberPart = numberPart;
	}

}
