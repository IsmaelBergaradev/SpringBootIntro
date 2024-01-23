#!/bin/bash

# Solicitar el nombre del commit al usuario
echo "Ingrese el nombre del commit:"
read commit_message

# Añadir todos los cambios al área de preparación
git add .

# Realizar el commit con el mensaje proporcionado por el usuario
git commit -m "$commit_message"

# Subir los cambios al repositorio remoto
git push
