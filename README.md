# CLOUD-projekat

varant up --provision

Pokretanje vagrant vm, koja u sebi radi sa docker-compose koji pokrece dve instance java aplikacije sa dve baze podataka, kojima upravlja nginx i vrsi loadbalance.
Provera ispravnosti pozivima na: http://localhost:8089/counter.

Pokretanje docker-compose bez vagranta: 

sudo service nginx stop // gasi prethodni nginx server
sudo docker-compose build
sudo docker-compose up
