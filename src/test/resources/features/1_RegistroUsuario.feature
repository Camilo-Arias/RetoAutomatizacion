@E2E
Feature: Crear nuevo usuario

  Background: Validar Creacion de nuevo usuario
    Given el usuario navega en demoblaze.com

    @CreateUser
  Scenario Outline:  CP01 - Creacion nuevo usuario
    When Doy click en Sign up
    And lleno formulario de "<user>" and "<password>"
    And  Dar click en Sign up Formulario
    Then el registro es exitoso

    Examples:
      | user    | password |
      | cariasa | 123      |