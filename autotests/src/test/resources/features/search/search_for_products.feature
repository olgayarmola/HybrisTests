Feature: Products search
  As a customer I want to search products using search field in the header

  Scenario: Verify that user see suggestion box when search for products
    Given open storefront
    When type "Card" in the search field
    Then user see suggestion dropdown with results containing searched keywords