@E2E
Feature: Comprar producto

  Background: Validar compra con usuario creado
    Given el usuario navega en demoblaze.com

  @comprarProductos
  Scenario Outline:  CP02 - Compra con usuario creado
    When  Seleccionar "<categoria>" compra y "<producto>" a comprar
    And ingresa al carrito de compras y confirma el pedido
    And  el usuario completa la información de pago "Camilo", "Colombia", "Bogota", "6684 4565 1235 4564", "08", "28"
    Then se confirma la compra exitosa

    Examples:
      | categoria | producto          |
      | Phones    | Samsung galaxy s6 |
      | Laptops   | MacBook Pro       |
      | Monitors  | Apple monitor 24  |