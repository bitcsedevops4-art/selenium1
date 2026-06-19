pipeline{
       agent any
       tools{
       maven 'Maven'
       }
       Stages{
           Stage("Checkout"){
           steps{
               git origin:"main",url"https://github.com/bitcsedevops4-art/selenium1.git"
               }
              }
            Stage("build"){
            steps{
             sh"mvn clean install"
             }
            }
            Stage("test"){
            steps{
             sh"mvn test"
             }
            }
            Stage("Run application"){
            steps{
              sh"java -jar target/selenium-1.0-SNAPSHOT.jar"
              }
            }
           }
          post{
               success{
                 echo "Build Sucess"
                 }
               failure{
                 echo "Build failure"
                }
              }
            }
            
               

