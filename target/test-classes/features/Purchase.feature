Feature: Realizar una compra en Demoblaze

  Scenario: Realizar un flujo de compra exitoso en Demoblaze
    Given que el usuario se encuentra en la página de inicio demoblaze
    When el usuario agrega dos productos al carrito, visualiza el carrito y completa el formulario de compra
    Then se realiza con éxito la compra y se muestra el mensaje "Thank you for your purchase"