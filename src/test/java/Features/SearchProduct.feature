Feature: Search and find a product in GreenCart home page and offer zone page

@SmokeTest
    Scenario Outline: User Searching the product on homepage and offer zone
    Given User on the Green Kart home page
    When user searches the prod short name <Name> on the home page product search section and extract the text shown
    Then user searches for the prod on offer zone <Name> and extracting the text from offer zone page
    And Validate the text extracted from the home page adn offer zone page

Examples:
    | Name |
    | tom  |
    | beet |
