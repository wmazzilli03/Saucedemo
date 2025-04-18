Feature: Proceso de compra

  Scenario: Completar la compra de un producto
    Given que el usuario al iniciar sesión correctamente
    And agrega el producto "Sauce Labs Backpack" al carrita
    When inicia el proceso de compra
    And completa el formulario con nombre "Juan", apellido "Pérez" y código postal "11001"
    And finaliza la compra
    Then debería ver el mensaje "Thank you for your order!"