
Vagrant.configure("2") do |config|

  config.vm.box = "hashicorp/bionic64"


  config.vm.provision "file", source: "nginx", destination: "nginx"
  config.vm.provision "file", source: "Cloud", destination: "Cloud"

  config.vm.provision "file", source: "Dockerfile", destination: "Dockerfile"
  config.vm.provision "file", source: "docker-compose.yml", destination: "docker-compose.yml"
  config.vm.network "forwarded_port", guest: 8083, host: 8089

  
  config.vm.provision :shell, path: "script.sh"

end
