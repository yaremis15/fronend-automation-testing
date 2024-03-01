# language: es

@registerNewUser
Característica: Realizar el registro de un nuevo usuario en Book Store Application

  Regla de negocio: Las contraseñas deben tener al menos un carácter no alfanumérico, un dígito ('0'-'9'), una mayúscula ('A'-'Z'),
  una minúscula ('a'-'z'), un carácter especial y la contraseña debe tener ocho caracteres o más.

    @smokeTest
    Esquema del escenario: [TC 001] Registrar un nuevo usuario en Book Store Application
      Dado que Yaremis ingresa a la sección de Book Store Application
      Cuando ella diligencia la información de los campos requeridos
        | First Name  | Last Name  | UserName   | Password   |
        | <firstName> | <lastName> | <userName> | <password> |
      # No se puede validar dado que existe un reCaptcha para confirmar con selección de imagenes
      Entonces se podrá visualizar la alerta con el mensaje "User Register Successfully." al crear el usuario
      Ejemplos:
        | firstName | lastName | userName | password  |
        | Test01    | Test01   | test01   | Test2023* |
