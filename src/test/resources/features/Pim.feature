#Proyecto de pruebas y cargado en Github
#23/07/2022
#Mónica Guerra
@Regresion
Feature: PIM

#  @Sprint2
#  Scenario Outline: Ir a PIM
#    Given abrir el navegador
#    And registrar usuario <userName> y password <passw>
#    And ir a opción PIM agregar empleado

#    Examples: 
#      | userName | passw    |
#      | Admin    | admin123 |

  @AddEmployee @Sprint2
  Scenario Outline: Agregar empleado
    Given abrir el navegador
    And registrar usuario <userName> y password <passw>
    And ir a opción PIM agregar empleado
    When registrar empleado nombre <firstName> y apellido <lastName>

    Examples: 
      | userName | passw    | firstName | lastName |
      | Admin    | admin123 | Monica   | Guerra   |
