Feature: Cucumber Data Tables implementation practices

  Scenario: List of Fruits and Veggies I like
    Then User should see below list
      | strawberry |
      | mango      |
      | onion      |
      | pear       |
      | apple      |
      | kiwi       |
      | carrot     |
      | celery     |
      | cucumber   |


  Scenario: List of pets
    Then User should see list below
      | dog   |
      | cat   |
      | bird  |
      | eagle |
      | fish  |


  Scenario: Officer reads data about driver
    Then Officer is able to see any data he wants
      | name          | Tay          |
      | date of birth | 9/9/81       |
      | gender        | f            |
      | height        | 5'3          |
      | weight        | 120          |
      | state         | Co           |
      | town          | Fort Collins |
      | zip           | 80524        |