Feature: Ordenar productos

  Scenario: Ordenar productos de menor a mayor precio
    Given que el usuario ha iniciado sesión correctamente
    When selecciona la opción de orden "Price (low to high)"
    Then debería ver que el primer producto listado es "Sauce Labs Onesie"