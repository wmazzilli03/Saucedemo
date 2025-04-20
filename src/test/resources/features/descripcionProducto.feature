Feature: Validar productos en el carrito

  Background:
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"
    And el usuario agrega mas de un producto en el carrito de compra
    And en el carrito de compra debería tener al menos 1 productos agregados

  Scenario: Verificar que el producto está en el carrito
    Then el producto debería estar visible en el carrito
    And el botón Checkout debería estar habilitado