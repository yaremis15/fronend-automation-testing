# language: es

@test
Característica: Registro de usurios

  Escenario: Registro de usuario manualmente
    Dado que Yaremis quiere realizar el registro en la pagina web Demo Qa
    Cuando ingrese a la sección de New user
    Y diligencie los campos de Register to Book Store
    Entonces podra realizar el registro de manera exitosa
