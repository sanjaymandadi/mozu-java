/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin.search;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTuningRuleFunction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String boostFunction;

	public String getBoostFunction() {
		return this.boostFunction;
	}

	public void setBoostFunction(String boostFunction) {
		this.boostFunction = boostFunction;
	}

	protected String boostFunctionCode;

	public String getBoostFunctionCode() {
		return this.boostFunctionCode;
	}

	public void setBoostFunctionCode(String boostFunctionCode) {
		this.boostFunctionCode = boostFunctionCode;
	}

	protected Double boostScore;

	public Double getBoostScore() {
		return this.boostScore;
	}

	public void setBoostScore(Double boostScore) {
		this.boostScore = boostScore;
	}

}
