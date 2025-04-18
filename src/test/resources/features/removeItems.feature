Feature: Eliminar productos del carrito

  Scenario: Eliminar un producto del carrito
    Given que el usuario ha iniciado sesión correctamente
    And agrega el producto "Sauce Labs Backpack" al carrito
    When elimina el producto desde el carrito
    Then el carrito debería estar vacío