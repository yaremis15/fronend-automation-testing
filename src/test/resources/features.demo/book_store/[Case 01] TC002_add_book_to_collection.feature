# language: es

@registerNewUser @caseOne
Característica: [Caso 1] Agregar libros de la sección Book Store a una colección


  @smokeTest @TC_002 @testCI
  Esquema del escenario: [TC 002] Agregar un libro de la sección Book Store a una colección
    Dado que Yaremis ingresa al modulo de "Book Store Application -> Book Store" de la aplicación
    Cuando ella realiza la búsqueda del libro "<book>"
    Entonces podrá agregar el libro a la collección
    Ejemplos:
      | book                       |
      | Programming JavaScript     |
      | Understanding ECMAScript 6 |
