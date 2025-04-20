Feature: Proceso de compra

  Background:
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"
    And el usuario agrega mas de un producto en el carrito de compra
    And en el carrito de compra debería tener al menos 1 productos agregados
    And el producto debería estar visible en el carrito



  Scenario Outline: Completar la compra de un producto
    When completo el formulario con los siguientes datos:<nombre>,<apellido>,<codigoPostal>
    Then debería ver el mensaje "Checkout: Overview"
    Examples:
      | nombre     | apellido   | codigoPostal |
      | "Walberto" | "Mazzilli" | "032311"     |


  @outlineCheck
  Scenario: Completar la compra de un producto
    When completo el formulario con los siguientes datos:
      | nombre | apellido | codigoPostal |
      | Anya   | Colina   | 032311       |
    Then debería ver el mensaje "Checkout: Overview"