# language: es

@deleteAccount @caseOne
Característica: [Caso 1] - Realizar la eliminación de una cuenta creada en el modulo de Book Store Application

  Regla de negocio: El usuario debe crearse manualmente en la plataforma anteriormente con las credenciales:
  firstName: Test01, lastName: Test01

    Antecedentes: Ingreso del usuario al modulo de Book Store
      Dado que Yaremis ingresa al modulo de "Book Store Application -> Login" de la aplicación

    @smokeTest @TC_003
    Esquema del escenario: [TC 003] Eliminar una cuenta de un usario registrado en la sección de Book Store Application
      Dado que Yaremis se loguea con sus credenciales en la sección de Book Store
        | UserName   | Password   |
        | <userName> | <password> |
      Cuando ella elimina la cuenta de su usuario del aplicativo
      Entonces se podrá visualizar la alerta con el mensaje "User Deleted." al confirmar la eliminación
      Y no se deberá permitir el ingreso al aplicativo con las credenciales de la cuenta eliminada
        | UserName   | Password   |
        | <userName> | <password> |
      Ejemplos:
        | userName | password  |
        | test01   | Test2023* |