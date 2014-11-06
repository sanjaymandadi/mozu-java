/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.discounts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class DiscountTargetUrl
{

	/**
	 * Get Resource Url for GetDiscountTarget
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDiscountTargetUrl(Integer discountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/discounts/{discountId}/target?responseFields={responseFields}");
		formatter.formatUrl("discountId", discountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDiscountTarget
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDiscountTargetUrl(Integer discountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/discounts/{discountId}/target?responseFields={responseFields}");
		formatter.formatUrl("discountId", discountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

