Feature: Agregar productos al carrito

  Scenario: Agregar un producto al carrito
    Given que el usuario ha iniciado sesión correctamente
    When agrega el producto "Sauce Labs Backpack" al carrito
    Then debería ver el contador del carrito con valor "1"