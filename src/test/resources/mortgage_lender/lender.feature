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

    Scenario Outline: Lender appraises a customers credit worthiness
      Given a customer has "<credit score>" credit score, DTI of "<dti>" and deposits "<deposit>" from savings
      When they apply for a loan
      Then they are qualified for it

      Examples:
        | credit score |   dti   |  deposit  |
        | 620          |  25     | 10000     |

    Scenario: Lender offers loan contract to a qualified customer
      Given I have sufficient funds to make a loan
      When I find a qualified applicant
      Then I offer them a loan

    Scenario: Lender receives a commission from approving a loan
      Given I sent a loan offer
      When a qualified applicant accepts
      Then I approve the loan
      And I receive a commission of 2%

    Scenario Outline: Lender disburses loan funds to borrower
      Given an current balance of "<start balance>" in my account
      When I disburse a loan of "<loan>" to a borrower
      Then my balance should be "<end balance>"
      Examples:
        | start balance |   loan   |  end balance  |
        | 1000000       |  250000  |  750000       |

    Scenario Outline: Lender sets expiration date on a loan offer
      Given I have a good loan candidate
      When I extend a loan offer on "<offer date>"
      Then the offer will expire "<expires>"
      Examples:
        | offer date |   expires    |
        | 06-01-2075 |  06-04-2075  |

    Scenario: Lender manages available funds and pending funds to avoid bankruptcy
      Given a good candidate
      When I extend a loan offer
      Then the loan amount is moved from available funds to pending funds

    Scenario: Lender moves pending funds to available when offer expires
      Given a loan contract was sent to a customer
      When the contract expires without a response from the customer
      Then the amount is moved from pending funds to available funds

