"Real-Time Analytics with Apache Storm"
=======================================
----------
###Introduction
Udacity in partnership with Twitter have started an excellent course on Apache Storm. You can join the course for free on [Udacity](www.udacity.com/course/ud381). <br>
This is a WIP basically.


###Commands
Commands to boot into the Storm Virtual Machine.<br>

    vagrant up
    vagrant ssh

Commands for executing Storm topologies:<br>

    cd /vagrant
    mvn package
    storm jar target/*dependencies.jar udacity.storm.*Topology


Commands for starting Visualization component:<br>

    vagrant ssh
    cd /vagrant/viz
    python app.py

Then point your browser to [http://localhost:5000](http://localhost:5000 "Viz")