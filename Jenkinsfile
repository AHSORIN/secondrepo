node{
  stage ('SCM CHECKOUT')
         {
           git 'https://github.com/AHSORIN/secondrepo'
         }
         stage('compile-package')
         {
           sh 'mvn package'
         }
}
         
      
