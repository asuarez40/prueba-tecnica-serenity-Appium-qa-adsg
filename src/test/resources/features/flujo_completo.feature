#Autores: Andres Suarez
#Usuarios: ASUAR27@bancodebogota.com.co

Feature: Flujo completo de compra de articulo en MyDemoApp

  Background:
    Given que el usuario se encuentra dentro de MyDemoApp

  @RunAll
  @FlujoCompleto
  Scenario: Flujo completo de compra exitosa
    Given el usuario se encuentra autenticado
    And ya tiene seleccionado un articulo a comprar
    When diligencie la informacion de envio, metodo de pago
    And procese la compra
    Then se debe visualizar la confirmación del pedido exitoso