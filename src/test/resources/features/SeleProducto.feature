Feature: Selección de productos en la tienda

  Background:
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"


  Scenario Outline: Seleccionar un solo producto
    When el usuario agrega el producto "<nombre_producto>" al carrito al azar
    Then en el carrito de compra debería tener al menos 1 productos agregados
    Examples:
      | nombre_producto       |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |

 # Scenario: Seleccionar un producto aleatorio
  #  And el usuario agrega un producto al carrito al azar
   # Then en el carrito de compra debería tener al menos 1 producto agregado


  #Scenario: Seleccionar mas de un producto al carrito de compra
   # And el usuario agrega mas de un producto en el carrito de compra
    #Then en el carrito de compra debería tener al menos 1 productos agregados