# language: es

@practiceForm @caseTwo
Característica: [Caso 2] Diligenciar formulario de inscripción de estudiantes


  @smokeTest @TC_005
  Esquema del escenario: [TC 005] Diligenciar formulario de inscripción de estudiantes en sección Practice Form
    Dado que Yaremis ingresa al modulo de "Forms -> Practice Form" de la aplicación
    Cuando ella diligencia la siguiente información del formulario de inscripción
      | First Name  | Last Name  | Email   | Gender   | Mobile   | Birth         | Subjects   | Hobbies   | Picture   | CurrentAddress   | State   | City   |
      | <firstName> | <lastName> | <email> | <gender> | <mobile> | <dateOfBirth> | <subjects> | <hobbies> | <picture> | <currentAddress> | <state> | <city> |

    Entonces se podrá visualizar el modal "Thanks for submitting the form" con la información diligenciada anteriormente
    Ejemplos:
      | firstName | lastName | email              | gender | mobile     | dateOfBirth | subjects | hobbies | picture                                   | currentAddress             | state   | city   |
      | Prueba01  | Prueba01 | prueba@yopmail.com | Female | 3004441234 | 27 sep 2000 | Arts     | Music   | src/test/resources/dataFiles/imagen1.jpeg | Autopista Norte al Oriente | Haryana | Karnal |


