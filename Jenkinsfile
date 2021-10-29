pipeline
{
  agent any
  tools{
    maven "maven-3.8.3"
  }
  
  environment {
    PATH = "/opt/apache-maven-3.8.3/bin/mvn:$PATH"
  }
  
  stages{
    stage("SCM CHECKOUT")
         {
           steps {
            git branch: 'main', credentialsId: 'demo', url: 'https://github.com/AHSORIN/secondrepo.git'
           }
         }
    
         stage("build")
         {
           steps
           {
             sh "mvn clean install"
           }
           
         }
  }
    
}
         
      
