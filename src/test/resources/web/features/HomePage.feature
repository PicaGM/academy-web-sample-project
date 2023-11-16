@HomePage @Test
Feature: Casos de prueba de Home Page para el TP Integrador de Crowdar
  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @BuyBookByArrivalProcess
  Scenario Outline: Proceso de compra de un libro
    And el usuario hace click en Arrival_Image
    And el usuario hace click en AddToBasketButton
    And el usuario puede ver el libro en el elemento del menú con el precio
    And el usuario hace click en ViewBasketButton
    And el usuario puede encontrar los valores total y subtotal justo arriba del boton para proceder al Pago
    And el usuario hace click en ProceedToChekoutButton
    And el usuario rellena los campos de detalles <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <PostCode>
    Then el usuario puede ver los detalles de facturacion, pedido y la opcion de usar cupon

    Examples:
      | FirstName | LastName | EmailAddress        | Phone        | Country   | Address        | TownDistrict | Region  | PostCode |
      | Pepito    | Pig      | pepito123@gmail.com | +54 12123211 | Argentina | PepoStreet 210 | PepoCity     | Mendoza | 2345     |

  @BuyBook
  Scenario Outline: Compra de un libro
    And el usuario hace click en Arrival_Image
    And el usuario hace click en AddToBasketButton
    And el usuario puede ver el libro en el elemento del menú con el precio
    And el usuario hace click en ViewBasketButton
    And el usuario puede encontrar los valores total y subtotal justo arriba del boton para proceder al Pago
    And el usuario hace click en ProceedToChekoutButton
    And el usuario rellena los campos de detalles <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <PostCode>
    And el usuario hace click en PlaceOrderButton
    Then el usuario puede ver los detalles de su compra

    Examples:
      | FirstName | LastName | EmailAddress        | Phone        | Country   | Address        | TownDistrict | Region  | PostCode |
      | Pepito    | Pig      | pepito123@gmail.com | +54 12123211 | Argentina | PepoStreet 210 | PepoCity     | Mendoza | 2345     |