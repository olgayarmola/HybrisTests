Feature: Products search
  As a customer I want to search products using search field in the header

  Scenario: Verify that user see suggestion box when search for products
    Given open storefront
    When type "Card" in the search field
    Then user see suggestion box

    Scenario: Verify that user is navigated to the search results page when search
      Given open storefront
      When type "digital camera" in the search field
      When click on search button
      Then search results page is loaded for "digital camera"
