Feature: Proceso de compra

  Background:
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"


  Scenario: Completar la compra de un producto
    And agrega el producto un producto al carrito de compra
    And inicia el proceso de compra
    And completa el formulario con nombre "Walberto", apellido "Mazzilli" y código postal "11001"
    And finalizar la compra
    Then debería ver el mensaje "Thank you for your order!"