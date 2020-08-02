Feature: Lender Management
  Everybody wants to know when it's Friday

  Scenario: Is it friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Checking available funds for a loan
    Given I am a lender
    When I check my available funds
    Then I should see the current balance

  Scenario: A customer asks for a bigger loan than is available
    Given a customer requests a loan
    When the amount is larger than my available balance
    Then they will be denied

  Scenario Outline: Lender uses a mortgage calculator  to calculate monthly payments
    Given the loan "<principal>", "<interest>", and number of "<payments>"
    When I enter these values into the calculator
    Then the minimum monthly mortgage is "<result>"

    Examples:
      | principal | interest  | payments | result |
      | 100000    | 0.12      | 300      | 250    |