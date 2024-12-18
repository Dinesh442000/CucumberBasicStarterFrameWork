#Feature: Search and place the order for products

#Scenario: Search experience for product search in both home and offers page
#
#Given User is on GreenCart Landing page
#When user searched with shortname "Tom" and extracted actual name of product
#Then user searched for "Tom" shortname in offers page 
#And validate product name in offers page matches with Landing page

#
#Scenario Outline: Search experience for product search in both home and offers page
#
#Given User is on GreenCart Landing page
#When user searched with shortname <Name> and extracted actual name of product
#Then user searched for <Name> shortname in offers page 
#And validate product name in offers page matches with Landing page
#
#Examples:
#| Name 	| 
#| Tom 	| 
#|	Beet 	|