#Autores: Andres Suarez
#Usuarios: ASUAR27@bancodebogota.com.co

Feature: Inicio de sesion MyDemoApp

  Background:
    Given que el usuario se encuentra dentro de MyDemoApp

  @RunAll
  @IncioSesionExitoso
  Scenario: Inicio de sesion exitoso
    Given el usuario se encuentra en la pantalla de inicio de sesion
    When el usuario ingresa su usuario "bob@example.com" , contrasena "10203040" e intente logesarse
    Then la app debe confirmarle el inicio de sesion exitoso


  @RunAll
  @IncioSesionFallido
  Scenario: Inicio de sesion Fallido con usuario bloqueado
    Given el usuario se encuentra en la pantalla de inicio de sesion
    When el usuario ingresa su usuario "alice@example.com" , contrasena "10203040" e intente logesarse
    Then la app debe mostrar un mensaje de rechazo y no dejar ingresar