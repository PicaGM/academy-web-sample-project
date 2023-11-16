@Login @Test
Feature: Casos de prueba en Practice Automation para el TP Integrador Crowdar

  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @LoginMayusculas
  Scenario Outline: ingresar un usuario y contraseña con mayusculas y verificar la diferencia
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    Then valido el mensaje de error es el siguiente <mensajeError>

    Examples:
      | usuario    | contra     | mensajeError                                                                                  |
      | PepitO1231 | PepitO123! | Error: The password you entered for the username PepitO1231 is incorrect. Lost your password? |

  @UnloginCorrecto
  Scenario Outline: ingresar con un usuario y salir de la cuenta
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    And el usuario hace click en Logout_Button
    And el usuario hace click en My_Account
    Then el usuario se encuentra con que esta fuera de sesion

    Examples:
      | usuario    | contra     |  |
      | PepitO1231 | Pepito123! |  |