Feature: Product detail page
  As a customer I want to be able to see product detail page and use elements on the page to shop

  Scenario: Verify that user can adjust product qty
    Given open storefront
    When go to "Digital Cameras" product category
    When open product "2" on the page
    When type "2" in the qty field
    When click on plus button
    Then product qty is 3

  Scenario: Verify that user can switch product info tabs
    Given open storefront
    When go to