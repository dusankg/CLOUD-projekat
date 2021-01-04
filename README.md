# CLOUD-projekat

varant up --provision

Pokretanje vagrant vm, koja u sebi radi sa docker-compose koji pokrece dve instance java aplikacije sa dve baze podataka, kojima upravlja nginx i vrsi loadbalance.
Provera rada pozivima na: http://localhost:8089/counter na host racunaru, koji se povezuje na 8083 unutar vagrant vm.

Pokretanje docker-compose bez vagranta: 

sudo service nginx stop // gasi prethodni nginx server

sudo docker-compose build

sudo docker-compose up

Provera rada pozivima na: http://localhost:8083/counter na host racunaru
