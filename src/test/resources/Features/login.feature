Feature: Verifyin the adactin book page

  Scenario Outline: verifyin the book details
    Given user in adactin home page
    When user enter "<username>" and "<password>"
    And user fill  the "<location>","<hotel>","<roomtype>","<Numberofroom>","<checkin>","<Checkout>","<No of adult>","<No of child>"
    And user enter the "<first name>","<Last name>","<address>","<credit card number>","<cardtype>","<expiry month>","<expiry year>","<CVV>"
    Then user get the order number

    Examples: 
      | username | password        | location | hotel       | roomtype | Numberofroom | checkin    | Checkout   | No of adult | No of child | first name | Last name  | address             | credit card number | cardtype | expiry month | expiry year | CVV |
      | Ragulskt | Ragulmariyappan | Brisbane | Hotel Creek | Deluxe   | 2 - Two      | 28/02/2020 | 01/03/2020 | 3 - Three   | 1 - One     | ragul      | mariyappan | xyz street, chennai |   1234567890123456 | VISA     | September    |        2022 | 980 |
