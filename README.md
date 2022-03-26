# Mentoring dia 35

### TEMARIO: 

Para Reactjs (/front)
- React con Redux
- Estructura de Redux y Diseño

Para de Spring Boot (/back)
- CRUD con mongodb
- Reactividad con web flux
- Hacer pruebas del controlador


### PROBLEMA

Crear una ventana en ReactJS que me permite renderizar una lista aleatoria que se le pase por una caja de texto dentro de un formulario, ingresar una lista separadas por coma y hacer submit de esa lista. El dato random se debe consultar a través de una API REST reactiva que esta diseñada con Spring Boot + Webflux. 

### SOLUCIÓN

La aplicación se basa en un teletransportador randómico el cual debe de ingresar el nombre de la persona a teletransportar, tal y como se muestra en la siguiente imagen:
![EnteringName](https://github.com/MauricioZapata00/mentoring35/blob/main/EnteringName.png)

Luego de esto, al darle "click" en teletransportar el sistema responde que la persona ha sido teletransportada a un posición de la tierra aleatoria:
![PersonTeleported](https://github.com/MauricioZapata00/mentoring35/blob/main/PersonTeleported.png)

Por último, podemos ver el almacenamiento de estas variables en MongoDB. Para este caso, se usa Robo3T:
![Storage](https://github.com/MauricioZapata00/mentoring35/blob/main/Storage.png)

