@HomePage @Test
  Feature: como cliente de la pagina deseo que la Home Page funcione correctamente
  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

    @Home1
    Scenario: comprobar que tenemos 3 sliders
      Given el usuario hace click en Shop_Button
      When el usuario hace click en Home_Button
      And el usuario hace click en Slide_Button
      Then se puede comprobar que hay tres sliders

    @Home2
    Scenario: comprobar que tenemos 3 arrivals
      Given el usuario hace click en Shop_Button
      When el usuario hace click en Home_Button
      Then se puede comprobar que hay tres arrivals

    @Home3
    Scenario: comprobar que las imagenes de arrivals son navegables
      Given el usuario hace click en Shop_Button
      When el usuario hace click en Home_Button
      And el usuario hace click en un Arrival_Image
      Then se puede comprobar que las imagenes son navegables