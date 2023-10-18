@Account @Test
  Feature: como cliente de la pagina quiero verificar el correcto funcionamiento de las opciones de la Account Page
    Background:
      Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

    @Account1
    Scenario Outline: funcionamiento de la Dashboard
      Given el usuario hace click en My_Account
      When el usuario ingresa un User <usuario> y Pass <contra>
      And el usuario hace click en Dashboard
      Then el usuario puede confirmar el contenido de la Dashboard

      Examples:
        | usuario    | contra     |
        | pepito1231 | Pepito123! |

    @Account2
    Scenario Outline: funcionamiento de el icono Orders
      Given el usuario hace click en My_Account
      When el usuario ingresa un User <usuario> y Pass <contra>
      And el usuario hace click en Orders
      Then el usuario puede confirmar el contenido de Orders

      Examples:
        | usuario    | contra     |
        | pepito1231 | Pepito123! |