@Login @Test
Feature: como cliente quiero comprobar el correcto funcionamiento de la pagina de Login

  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @Login1
  Scenario Outline: ingresar un usuario y contraseña correcto
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    Then el usuario inicia sesion correctamente

    Examples:
      | usuario    | contra     |
      | pepito1231 | Pepito123! |

  @Login2
  Scenario Outline: ingresar un usuario y contraseña incorrecto
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    Then el usuario se encuentra con que no se puede iniciar sesion

    Examples:
      | usuario  | contra |
      | pepito12 | Pepito |

  @Login3
  Scenario Outline: ingresar un usuario sin contraseña
    Given el usuario hace click en My_Account
    When el usuario ingresa un User <usuario> y Pass <contra>
    Then valido el mensaje de error es el siguiente <mensajeError>

    Examples:
      | usuario    | contra | mensajeError                 |
      | pepito1231 |        | Error: Password is required. |