#Autores: Andres Suarez
#Usuarios: ASUAR27@bancodebogota.com.co

Feature: Agregar producto al carrito MyDemoApp

  Background:
    Given que el usuario se encuentra dentro de MyDemoApp

  @RunAll
  @AgregarCarrito
  Scenario: Agregar productos al carrito de forma exitosa
    Given el usuario se encuentra autenticado
    When Seleccione un producto a comprar
    Then se debe visualizar el articulo en el carrito de forma exitosa