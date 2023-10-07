@Search
Feature: As a potential client i need to search in google to find a web site
  Background:
  Given The client is on google page

 Scenario Outline: Search
   Given The client search for <word>
   Then The client verify that results are shown properly

   Examples:
     | word            |  |
     | Crowdar Academy |  |
     | Calidad         |  |
     | Software        |  |
     | Testing         |  |
