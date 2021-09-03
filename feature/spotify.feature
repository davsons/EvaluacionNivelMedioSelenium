Feature: Spotify Test

  Scenario Outline:

    Given Estoy en Sitio Spotify
    When Ingreso a Premium
    Then <Plan>
    Then Valido Plan Individual
    Then Valido Plan Familiar


    Examples:
    |Plan|
    |Individual|
    |Familiar|

  Scenario Outline:
    Given Estoy en Registro de Usuario
    When <Email>
    Then Valido Correo vacio
    Then Valido Correo incorrect
    Then Valido Correo existent

    Examples:
      |Email|
      |vacio|
      |incorrect|
      |existent|

  Scenario Outline:
    Given Estoy en Sitio Spotify
    When Ingreso a Sitio Legal
    Then <Options>

    Examples:
      |Options|
      |Disfutando Spotify|
      |Pagos cancelaciones|
      |Nuestro servicio|
















