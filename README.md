Lista Doblemente Enlazada en Java

Descripción
Este proyecto implementa una lista doblemente enlazada en Java

  Decisiones de Diseño
- Uso de una estructura `Node` y `DoubleList`:  
  Se ha optado por dividir la lógica en dos clases (`Node` para representar cada nodo y `DoubleList` para gestionar la lista).

- Uso de `String` como tipo de dato:  
  Se decidió almacenar únicamente cadenas de texto para cumplir con los requisitos de la actividad.
- Optimización con `size`:  
  Se agregó un contador `size` para evitar recorrer la lista al contar elementos, mejorando la eficiencia.

  Estructura del Código
 1. Clase `Node`
Representa un nodo con:
- `value`: Almacena el valor del nodo.
- `next`: Referencia al siguiente nodo.
- `previous`: Referencia al nodo anterior.
- Métodos: `getNext()`, `setNext()`, `getValue()`, `setValue()`,ETC

 2. Clase `DoubleList`
Gestiona la lista doblemente enlazada, con:
- `first`, `last`: Referencias al primer y último nodo.
- `size`: Contador de elementos en la lista.
- Métodos principales:
  - `add(String value)`: Agrega un elemento a la lista.
  - `count()`: Retorna el número de elementos.
  - `get(int index)`: Obtiene un elemento en una posición específica.
  - `contains(String value)`: Verifica si un elemento existe en la lista.
  - `remove(String value)`: Elimina un nodo específico.
  - `removeAt(int index)`: Elimina un nodo por índice.
  - `replace(String oldValue, String newValue)`: Reemplaza un elemento.
  - `concatenate(DoubleList otherList)`: Une dos listas.
  - `printList()`: Muestra la lista en consola.

 3. Clase `Main`
Implementa un caso de uso real: Gestión de tareas pendientes.
- Se insertan tareas.
- Se reemplazan y eliminan elementos.
- Se concatenan listas de tareas.
- Se muestra la lista final.


