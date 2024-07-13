Feature: Purchase a product from GreenKart Website
  @SmokeTest
  Scenario Outline:User searches product an add the product to cart
    Given User on the Green Kart home page
    When user searches the prod short name <Name> on the home page product search section and extract the text shown
    And user add the product to cart with quantity "3"
    And user proceed to checkout
    Then Variefy and Validate the checkout page

    Examples:
      | Name |
      | tom  |