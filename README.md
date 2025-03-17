# Actividad 7: Pair Programming
En esta actividad, los alumnos trabajarán en parejas para desarrollar soluciones a problemas reales mediante estructuras condicionales (if-else y switch-case). Cada grupo de cuatro estudiantes abordará el mismo problema, pero una pareja utilizará if-else y la otra switch-case.

El objetivo de esta actividad es:
* Comparar ambas estructuras de control en términos de legibilidad, eficiencia y aplicabilidad.
* Comprender en qué casos una estructura es más recomendable que la otra.
* Aplicar condicionales a problemas más complejos que requieren manejar múltiples variables y escenarios.

Al finalizar la sesión, cada grupo deberá analizar y discutir las diferencias entre ambas soluciones, explicando cuál consideran más eficiente y por qué. Este debate ayudará a reforzar el pensamiento crítico y la toma de decisiones en programación.

## Temáticas del Trabajo
### 1. Sistema de Descuentos en una Tienda
Cada pareja debe diseñar un sistema que aplique descuentos según el tipo de cliente y el monto de compra.

Condiciones a considerar:
* Cliente estándar: Sin descuento.
* Cliente fidelizado (con tarjeta de socio): 10% de descuento.
* Cliente VIP: 20% de descuento.
* Si la compra supera los 100€, se aplica un 5% adicional a cualquier cliente.

### 2. Control de Acceso a un Evento
Un sistema que determine si una persona puede entrar a un evento según su edad y tipo de entrada.

Condiciones a considerar:
* Menores de 16 años: No pueden entrar.
* Entre 16 y 18 años: Solo pueden entrar con entrada especial.
* Mayores de 18 años: Pueden entrar libremente.
* Si tienen entrada VIP, pueden acceder a una zona especial.

### 3. Diagnóstico de Enfermedades Comunes
Cada pareja desarrollará un sistema que sugiera posibles enfermedades según los síntomas del usuario.

Condiciones a considerar:
* Fiebre + tos + fatiga → Posible gripe.
* Tos + estornudos + ojos llorosos → Posible alergia.
* Fiebre alta + dolor muscular + cansancio extremo → Posible COVID-19.
* Dolor de garganta + fiebre moderada + dificultad para tragar → Posible amigdalitis.

### 4. Clasificación de Vehículos
Cada pareja creará un sistema que clasifique un vehículo según su tipo para determinar si debe pagar impuesto especial.

Tipos de vehículos:
* Moto → Exento de impuesto.
* Coche gasolina/diesel → Paga impuesto.
* Coche eléctrico → Exento de impuesto.
* Camión → Paga impuesto adicional.
* Autobús → Paga tarifa reducida.

### 5. Sistema de Elección de Menú en un Restaurante
Cada pareja diseñará un programa que recomiende un menú según las preferencias del cliente.

Opciones de menú:
* Opción 1: Carnívoro → Filete con patatas.
* Opción 2: Vegetariano → Ensalada con tofu.
* Opción 3: Vegano → Hamburguesa de lentejas.
* Opción 4: Sin gluten → Pasta sin gluten con salsa de tomate.
* Opción 5: Salir del menú.

### 6. Verificación de Usuario y Contraseña
Cada pareja creará un sistema de autenticación que verifique si el usuario y la contraseña ingresados son correctos.

Condiciones de validación:
* Si el usuario y la contraseña son correctos → "Acceso concedido".
* Si el usuario es correcto pero la contraseña es incorrecta → "Contraseña incorrecta".
* Si el usuario no existe → "Usuario no encontrado".
* Si se ingresan datos vacíos → "Campos obligatorios".
* Si se introducen tres intentos incorrectos → "Cuenta bloqueada".

### 7. Sistema de Clasificación de Películas
Cada pareja diseñará un programa que asigne una clasificación de edad a una película según su contenido.

Clasificación de películas:
* APT → Apta para todos los públicos.
* 7+ → No recomendada para menores de 7 años.
* 12+ → No recomendada para menores de 12 años.
* 16+ → No recomendada para menores de 16 años.
* 18+ → Solo para adultos.

### 8. Asistente Virtual de Recomendaciones de Clima
Cada pareja diseñará un programa que sugiera ropa o actividades según el clima actual.

Condiciones climáticas y sugerencias:
* Soleado → "Ponte gafas de sol y ropa ligera".
* Lluvioso → "Lleva un paraguas y ponte un impermeable".
* Nublado → "Puede llover, lleva un abrigo ligero".
* Nevado → "Abrígate bien y usa botas de nieve".
* Tormentoso → "Mejor quédate en casa".

### 9. Sistema de Gestión de Bonificaciones Salariales
Cada pareja diseñará un programa que calcule el bono salarial de un empleado según su antigüedad y rendimiento.

Condiciones para el bono:
* Menos de 1 año → Sin bonificación.
* 1-3 años → 5% del salario base.
* 4-6 años → 10% del salario base.
* Más de 6 años → 15% del salario base.
* Si el rendimiento es "Excelente" → Se añade un 5% extra.

### 10. Asignación de Impuestos según Ingresos y Estado Civil
Cada pareja diseñará un programa que calcule el porcentaje de impuestos a pagar según el nivel de ingresos y estado civil.

Condiciones para el impuesto:
* Ingresos < 15,000€ → 5% de impuestos.
* Ingresos 15,000 - 30,000€ → 10% de impuestos.
* Ingresos 30,000 - 60,000€ → 20% de impuestos.
* Ingresos > 60,000€ → 30% de impuestos.
* Si el estado civil es "Casado" → Se aplica una reducción del 2%.
* Si tiene más de 2 hijos → Se aplica una reducción adicional del 3%.
