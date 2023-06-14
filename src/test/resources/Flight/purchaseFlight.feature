Feature: Purchase Page Functionality

  Scenario Outline: Verify User able to Purchase a Flight
    Given User navigates to purchase Page "https://blazedemo.com/purchase.php"
    When User enter Name "<Name>"
    And User enters Address "<Address>"
    And User enters City "<City>"
    And User etners State "<State>"
    And User etners ZipCode "<ZipCode>"
    And User selects Card Type "<CardType>"
    And User etners Card Number "<CardNumber>"
    And User etners Month "<Month>"
    And User etners Year "<Year>"
    And User etners Name On Card "<NameOnCard>"
    And User Checks remember me  
    And User Clicks Purchase Flight 
    Then User verifies success message "<message>"

    Examples: 
      | Name      | Address       | City       | State | ZipCode | CardType         | CardNumber  | Month | Year | NameOnCard | message                            |
      | John cena | 123 drive st  | Sacramento | CA    |   57148 | Visa             |  4544694616 |    11 | 2023 | John       | Thank you for your purchase today! |
      | Hamza     | 345 drive st  | ELk grove  | CA    |   56565 | Visa             |  1464949949 |    01 | 2022 | Hamza      | Thank you for your purchase today! |
      | Gary      | 678 drive st  | maryland   | VA    |   97585 | American Express |   551555155 |    02 | 2023 | Gary       | Thank you for your purchase today! |
      | Meridian  | 912 street st | Highland   | TX    |   98575 | Visa             |  1548741548 |    10 | 2025 | Meriden    | Thank you for your purchase today! |
      | Yuliya    | 101 street st | folsom     | TX    |   94747 | American Express |   548484152 |     9 | 2026 | Yuliya     | Thank you for your purchase today! |
      | Farah     | 101 Blvd st   | roseville  | PA    |   98676 | Visa             | 98415218962 |     5 | 2024 | Farah      | Thank you for your purchase today! |
