job('lwautojob1') {
    
    description('My first job auto')
    

    scm {
        github(ownerAndProject=krishabh080/myjenkins, branch = 'main')
              
    }
    steps {
         maven {
            goals('package')
            mavenInstallation('mymaven3')
           
        }
        shell('date')
    }
    
    
}
