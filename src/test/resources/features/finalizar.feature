Feature: Flujo finalizado

  Background:
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"
    And el usuario agrega mas de un producto en el carrito de compra
    And en el carrito de compra debería tener al menos 1 productos agregados
    And el producto debería estar visible en el carrito
    And completo el formulario con los siguientes datos:
      | nombre | apellido | codigoPostal |
      | Anya   | Colina   | 032311       |


  Scenario: Login fallido con usuario bloqueado
    When el cliente se debe encontrar en la vista overview y presionar clic en el btn finish
    Then debería ver el mensaje de finalizacion "Thank you for your order!"