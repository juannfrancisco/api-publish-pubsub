# Crear topico en pub-sub

export NAME_TOPIC="messages"
export NAME_SUB_TOPIC="sub-messages"

gcloud services enable pubsub.googleapis.com
gcloud pubsub topics create ${NAME_TOPIC}



#Ejecutar App
mvn spring-boot:run





### Crear Suscripcion

´´´
gcloud pubsub subscriptions create ${NAME_SUB_TOPIC} \
  --topic=${NAME_TOPIC}
´´´


## Obtener mensajes

gcloud pubsub subscriptions pull ${NAME_SUB_TOPIC}
