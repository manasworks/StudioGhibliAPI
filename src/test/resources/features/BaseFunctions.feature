@smoke @wip
Feature: Basic Functions of Studio Ghibli API's

      Scenario: verify response code
            Given user send request to "films" endpoint
            Then verify response status code is 200

      Scenario: get film by name
            Given user send request to "films" endpoint
            Then verify response status code is 200
            Then retrieve a film by name "My Neighbor Totoro"