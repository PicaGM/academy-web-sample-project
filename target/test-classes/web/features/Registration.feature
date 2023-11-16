@Registration @Test
Feature: Casos de prueba en Practice Automation para el TP Integrador Crowdar

  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @RegistroSinPass
  Scenario Outline: ingresar un usuario sin contraseña
    Given el usuario hace click en My_Account
    When el usuario ingresa un Mail <mail> y Pass <contra>
    Then valido el mensaje de error es el siguiente <mensajeError>

    Examples:
      | mail                 | contra | mensajeError                             |
      | Pepito1231@gmail.com |        | Error: Please enter an account password. |

  @RegistroVacio
  Scenario Outline: Registrarse con los campos vacios
    Given el usuario hace click en My_Account
    When el usuario ingresa un Mail <mail> y Pass <contra>
    Then valido el mensaje de error es el siguiente <mensajeError>

    Examples:
      | mail | contra | mensajeError                                 |
      |      |        | Error: Please provide a valid email address. |