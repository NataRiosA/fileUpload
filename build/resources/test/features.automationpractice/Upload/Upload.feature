@test
Feature: Cargue de archivo

  Yo como PO
  Quiero cargar un archivo desde mi desktop

  @Scenario
  Scenario: se debe poder cargar un archivo
    Given el usuario se encuentra en la pagina principal
    When  el usuario carga el archivo
    Then el sisteme deberia mostrar mensaje de confirmacion