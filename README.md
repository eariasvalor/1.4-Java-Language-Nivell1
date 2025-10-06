# 🧩 Exercicis 1, 2 i 3 - Col·leccions, Càlcul de DNI i Excepcions en Java

## 📚 Exercici 1 - Classe Biblioteca i gestió de llibres

📄 **Descripció - Enunciat de l'exercici**

Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca.  
La classe ha de permetre:

- Afegir llibres a la col·lecció  
- Recuperar la llista completa de llibres  
- Obtenir el títol d’un llibre per la seva posició  
- Afegir un llibre en una posició específica  
- Eliminar un llibre per títol  

🔹 **Condició addicional:**  
La llista ha de romandre **ordenada alfabèticament** després d’afegir o eliminar llibres.  

🧪 **Tests JUnit a implementar**

- La llista de llibres no és nul·la després de crear l’objecte  
- La mida de la llista és correcta després d’afegir llibres  
- Un llibre concret apareix a la posició esperada  
- No hi ha títols duplicats  
- Es pot recuperar un llibre per la seva posició  
- Afegir un llibre modifica correctament la col·lecció  
- Eliminar un llibre redueix la mida de la llista  
- La llista roman **ordenada alfabèticament** després de les operacions  

---

## 🧮 Exercici 2 - Classe CalculoDni

📄 **Descripció - Enunciat de l'exercici**

Crea una classe anomenada **`CalculoDni`** que calculi la lletra del DNI en rebre el número com a paràmetre.  
El mètode haurà de retornar la lletra corresponent segons el càlcul estàndard del DNI.

🧪 **Tests JUnit parametritzats**

- Implementa una classe JUnit parametritzada que:
  - Rebi un conjunt de **10 números de DNI predefinits**.  
  - Verifiqui automàticament si la lletra retornada és la correcta per a cada cas.  
  - Asseguri que el càlcul és robust i funciona per a un ampli espectre de dades.  

---

## ⚠️ Exercici 3 - Excepcions (ArrayIndexOutOfBoundsException)

📄 **Descripció - Enunciat de l'exercici**

Crea una classe amb un mètode que llanci una **`ArrayIndexOutOfBoundsException`**.  
L’objectiu és comprovar el correcte maneig d’aquesta excepció mitjançant proves unitàries.

🧪 **Tests JUnit**

- Comprova que el mètode llança l’excepció esperada.  
- Verifica que el programa gestiona correctament l’error sense interrompre l’execució.  

---

-----------------------------------

💻 Used technologies

- Java SE 21 (o higher)
- IDE (IntelliJ IDEA)
- Terminal for compiling and executing with javac and java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

---

🛠️ Instal·lació

1. Clona aquest repositori:
   git clone <URL-del-repositori>
2. Accedeix al directori del projecte:
   cd <nom-de-l'exercici>
3. Comprova que tens Java instal·lat:
   java -version

-----------------------------------

▶️ Execució

1. Compila el projecte:
   javac *.java


🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja’ls:
   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:
   git push origin feature/NovaFuncionalitat
5. Fes un pull request.
