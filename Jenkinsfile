pipeline
{
  agent any
  
  stages{
    stage("SCM CHECKOUT")
         {
           steps {
             git credentialsId:'git_credientials', url:'https://github.com/AHSORIN/secondrepo.git'
           }
         }
    
         stage"build")
         {
           steps
           {
             sh "mvn clean install"
           }
           
         }
    
}
         
      
