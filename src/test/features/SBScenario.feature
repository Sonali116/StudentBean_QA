Feature: Simple Search
   @smoke1
  Scenario: As a user I want to search for a brand on studentbeans.com so that I can see if I can get a discount on that brand
    Given I am on the studentbeans homepage
    When I open the search bar
    And I enter "Samsung"
    Then I should be shown a search listing for "Samsung"