Feature: Finding the different weight

  @BarWeighTest
  Scenario: Weight all bars one by one
    When user navigates to the website
    Then weights all bars one by one
    And finds the lighter bar.
    And closes the browser.

