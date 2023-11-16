@ShopPage @Test
Feature: Casos de prueba de Home Page para el TP Integrador de Crowdar
  Background:
    Given el usuario se encuentra en la URL "https://practice.automationtesting.in/"

  @BuyBookProcess
  Scenario Outline: Compra de un libro
    And el usuario hace click en ShopButton
    And el usuario hace click en AddToBasket
    And el usuario puede ver el libro en el elemento del menú con el precio
    And el usuario hace click en ViewBasket
    And el usuario puede encontrar los valores total y subtotal justo arriba del boton para proceder al Pago
    And el usuario hace click en ProceedToChekoutButton
    And el usuario rellena los campos de detalles <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <PostCode>
    Then el usuario puede ver los detalles de facturacion, pedido y la opcion de usar cupon

    Examples:
      | FirstName | LastName | EmailAddress        | Phone        | Country   | Address        | TownDistrict | Region  | PostCode |
      | Pepito    | Pig      | pepito123@gmail.com | +54 12123211 | Argentina | PepoStreet 210 | PepoCity     | Mendoza | 2345     |

  @VerifyTaxes
  Scenario: Compra de un libro
    And el usuario hace click en ShopButton
    And el usuario hace click en AddToBasket
    And el usuario puede ver el libro en el elemento del menú con el precio
    And el usuario hace click en ViewBasket
    And el usuario puede encontrar los valores total y subtotal justo arriba del boton para proceder al Pago
    And el usuario verifica que la taza del total sea mayor al subtotal
    Then el usuario verifica que la taza de impuestos es del 2% para la India y 5% para otros paises