
# OrderLineItemTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogObjectId** | **String** | The catalog object id referencing [CatalogTax](#type-catalogtax). |  [optional]
**name** | **String** | The tax&#39;s name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the calculation method used to apply the tax.  See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values. |  [optional]
**percentage** | **String** | The percentage of the tax, as a string representation of a decimal number.  A value of &#x60;7.25&#x60; corresponds to a percentage of 7.25%. |  [optional]
**appliedMoney** | [**Money**](Money.md) | The amount of the money applied by the tax in an order. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN_TAX | &quot;UNKNOWN_TAX&quot;
ADDITIVE | &quot;ADDITIVE&quot;
INCLUSIVE | &quot;INCLUSIVE&quot;



