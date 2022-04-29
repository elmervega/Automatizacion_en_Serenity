@Historia
  Feature: Inicializare en la pagina de serenity demo con el usuario y contrasena
    para crear una reunion

  @Escenario1
  Scenario Outline: Iniciare sesion en la pagina de serenity demo
    Given que tengo el usuario y la contrasena para entrar a la pagina
    When inicio la sesion ire al menu de organzacion y creare una nueva reunion
    |user  |password  |name  |select  |meet_name  |meet_type  |number_meet  |unit  |organizedBy  |reported  |attendeeList  |
    |<user>|<password>|<name>|<select>|<meet_name>|<meet_type>|<number_meet>|<unit>|<organizedBy>|<reported>|<attendeeList>|
    Then verifico que he realizado la creacion de esta reunion con el nombre informacion.

    Examples:
    |user   |password|name   |select        |meet_name  |meet_type |number_meet|unit   |organizedBy|reported|attendeeList|
    |admin  |serenity|Unidad1|Administration|Informacion|Vacaciones|123456     |Unidad1|Alexis Lopez|Charles Davi|James Brooks|
