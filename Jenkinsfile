pipeline{
       agent any
       tools{
       maven 'Maven'
       }
       Stages{
           stage("Checkout"){
           steps{
               git origin:"main",url"https://github.com/bitcsedevops4-art/selenium1.git"
               }
              }
            stage("build"){
            steps{
             sh"mvn clean install"
             }
            }
            stage("test"){
            steps{
             sh"mvn test"
             }
            }
            stage("Run application"){
            steps{
              sh"java -jar target/selenium-1.0-SNAPSHOT.jar"
              }
            }
           }
          post{
               sucess{
                 echo "Build Sucess"
                 }
               failure{
                 echo "Build failure"
                }
              }
            }
            
               

