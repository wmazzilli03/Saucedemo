Feature: Inicio de sesión

  Scenario: Login exitoso con usuario válido
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"
    Then debería ver la página de productos


  Scenario: Login fallido con usuario bloqueado
    Given que el usuario abre la aplicación
    When inicia sesión con el usuario "locked_out_user" y contraseña "secret_sauce1"
    Then debería ver el mensaje de error "Epic sadface: Username and password do not match any user in this service"