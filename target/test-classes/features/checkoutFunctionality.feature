Feature: Search and add product to cart and checkout

@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page

Given User is on GreenCart Landing page
When user searched with shortname <Name> and extracted actual name of product
And user adds <Quantity> of the item and click on add to cart
Then user click on cart and proceeds to checkout
Then validate product name in cart page matches with Landing page

Examples:
| Name 		| Quantity |
| Potato 	| 		3		 |
| Beans 	|			8		 |
| Carrot  |    10 	 |