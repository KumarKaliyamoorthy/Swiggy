Feature: verify a demo site

  Scenario Outline: verify a main page
    Given user is on main page
    When verify a firstname,lastname and date "<firstname>","<lastname>","<date>"
    Then I validate the outcomes

    Examples: 
      | firstname | lastname | date     |
      | kumar     | kumar    | 31/07/97 |
