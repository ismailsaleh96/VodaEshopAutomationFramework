Feature: UserOrderAppleProductFromEshopVodafone
   I want to check that the user can order a apple product  in Vodafone E-Shop website.
   
	Scenario Outline: User Go E-Shop Web Page and Order Apple Product
	Given User on EShop Home  Page
	When Select English Language
	When Click on Apple Products
	Then Choose AirPods 2
	Then Click on Add To Basket Button
	Then Click on Processed To Check Out
	Then  Choose City and Area
	And I Entered "<StreetName>" , "<BuildingNo>" , "<FloorNumber>" , "<Appar>" , "<Landmark>"  , "<AddressName>"
	And I entered "<FullName>" , "<Email>"  , "<MobileNumber>" , "<LandlineMobileNumber>"


 
 	Examples:
 	 | StreetName | BuildingNo | FloorNumber | Appar |  Landmark | AddressName
 	 | Maadi | 2 | 1 | 6 |  Supermarket |  SmartVillage |

 	 | StreetName | BuildingNo | FloorNumber | Appar |  Landmark | AddressName
 	 | Ismail Saleh | esmailsaleh.cs@gmail.com |  01151279461 |  0221906123 |


 	  