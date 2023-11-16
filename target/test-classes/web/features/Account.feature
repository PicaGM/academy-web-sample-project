@Account @Test
Feature: Casos de prueba en Practice Automation para el TP Integrador Crowdar

  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @AccountDetails
  Scenario Outline: ingresar con la cuenta registrada y ver los detalles
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    And el usuario hace click en My_Account
    And el usuario hace click en MyAccount_Details
    Then el usuario puede ver los detalles de su cuenta

    Examples:
      | usuario    | contra     |  |
      | Pepito1231 | Pepito123! |  |

  @LoginUnlogin
  Scenario Outline: ingresar con un usuario y salir de la cuenta
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    And el usuario hace click en Logout_Button
    Then el usuario se encuentra con que esta fuera de sesion

    Examples:
      | usuario    | contra     |  |
      | Pepito1231 | Pepito123! |  |