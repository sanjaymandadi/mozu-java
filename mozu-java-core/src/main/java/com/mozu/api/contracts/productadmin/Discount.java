/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.DiscountCondition;
import com.mozu.api.contracts.productadmin.DiscountLocalizedContent;
import com.mozu.api.contracts.productadmin.DiscountTarget;

/**
 *	Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Discount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The integer amount of the discount. For example, an entry of "10" could represent a discount of $10.00 or a discount of 10%, depending on the type.
	 */
	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * The type of discount amount, such as an amount or a percentage.
	 */
	protected String amountType;

	public String getAmountType() {
		return this.amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	/**
	 * Signifies that the discount is not referenced and can be hard deleted
	 */
	protected Boolean canBeDeleted;

	public Boolean getCanBeDeleted() {
		return this.canBeDeleted;
	}

	public void setCanBeDeleted(Boolean canBeDeleted) {
		this.canBeDeleted = canBeDeleted;
	}

	/**
	 * The number of times this discount has been redeemed.
	 */
	protected Integer currentRedemptionCount;

	public Integer getCurrentRedemptionCount() {
		return this.currentRedemptionCount;
	}

	public void setCurrentRedemptionCount(Integer currentRedemptionCount) {
		this.currentRedemptionCount = currentRedemptionCount;
	}

	/**
	 * Determines whether or not a discount applies to a items with a sale price. Applicable on order and line item discounts. For line items, when this is true, the discount will be disqualified. For order level discounts, when true, the discount will not be applied to those items have a sale price.
	 */
	protected Boolean doesNotApplyToProductsWithSalePrice;

	public Boolean getDoesNotApplyToProductsWithSalePrice() {
		return this.doesNotApplyToProductsWithSalePrice;
	}

	public void setDoesNotApplyToProductsWithSalePrice(Boolean doesNotApplyToProductsWithSalePrice) {
		this.doesNotApplyToProductsWithSalePrice = doesNotApplyToProductsWithSalePrice;
	}

	/**
	 * If true, this discount does not apply to a line item product with a defined sale price. The default is false, which applies the discount to products with and without defined sale prices.
	 */
	protected Boolean doesNotApplyToSalePrice;

	public Boolean getDoesNotApplyToSalePrice() {
		return this.doesNotApplyToSalePrice;
	}

	public void setDoesNotApplyToSalePrice(Boolean doesNotApplyToSalePrice) {
		this.doesNotApplyToSalePrice = doesNotApplyToSalePrice;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Maximum impact this discount can apply on a single order. Must be either null or greater than zero.
	 */
	protected Double maximumDiscountImpactPerOrder;

	public Double getMaximumDiscountImpactPerOrder() {
		return this.maximumDiscountImpactPerOrder;
	}

	public void setMaximumDiscountImpactPerOrder(Double maximumDiscountImpactPerOrder) {
		this.maximumDiscountImpactPerOrder = maximumDiscountImpactPerOrder;
	}

	/**
	 * Maximum impact this discount can apply on a single line item. Must be either null or greater than zero.
	 */
	protected Double maximumDiscountImpactPerRedemption;

	public Double getMaximumDiscountImpactPerRedemption() {
		return this.maximumDiscountImpactPerRedemption;
	}

	public void setMaximumDiscountImpactPerRedemption(Double maximumDiscountImpactPerRedemption) {
		this.maximumDiscountImpactPerRedemption = maximumDiscountImpactPerRedemption;
	}

	/**
	 * Maximum number of redemptions allowed per order. If null, defaults to unlimited.
	 */
	protected Integer maximumRedemptionsPerOrder;

	public Integer getMaximumRedemptionsPerOrder() {
		return this.maximumRedemptionsPerOrder;
	}

	public void setMaximumRedemptionsPerOrder(Integer maximumRedemptionsPerOrder) {
		this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
	}

	/**
	 * The maximum number of times an individual shopper can redeem the discount.
	 */
	protected Integer maximumUsesPerUser;

	public Integer getMaximumUsesPerUser() {
		return this.maximumUsesPerUser;
	}

	public void setMaximumUsesPerUser(Integer maximumUsesPerUser) {
		this.maximumUsesPerUser = maximumUsesPerUser;
	}

	/**
	 * The scope to which the discount applies, which is "Order" for order discounts or "LineItem" for individual product discounts.
	 */
	protected String scope;

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * The current status of an object. This status is specific to the object including payment (New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack), discount (Active, Scheduled, or Expired), returns (ReturnAuthorized), tenant, package (Fulfilled or NotFulfilled), application, master and product catalogs, orders (Pending, Submitted, Processing, Pending Review, Closed, or Canceled), and order validation results (Pass, Fail, Error, or Review).
	 */
	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * List of conditions that must be met for the discount to apply.
	 */
	protected DiscountCondition conditions;

	public DiscountCondition getConditions() {
		return this.conditions;
	}

	public void setConditions(DiscountCondition conditions) {
		this.conditions = conditions;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected DiscountLocalizedContent content;

	public DiscountLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(DiscountLocalizedContent content) {
		this.content = content;
	}

	/**
	 * Targets represent the object, such as an item to apply discounts (products or orders) or a view field for content. When accessing MZDB APIs for Mongo interactions, targets are the dot notation that links to the source document property. For example, firstitem for the direc level or firstitem.seconditem.thirditem for a deeper property.              
	 */
	protected DiscountTarget target;

	public DiscountTarget getTarget() {
		return this.target;
	}

	public void setTarget(DiscountTarget target) {
		this.target = target;
	}

}
