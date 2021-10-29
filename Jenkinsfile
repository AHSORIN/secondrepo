node{
  stage ('SCM CHECKOUT')
         {
           git 'https://github.com/AHSORIN/secondrepo.git'
         }
         stage('compile-package')
         {
           sh 'mvn package'
         }
}
         
      
