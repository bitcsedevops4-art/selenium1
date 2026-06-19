Pipeline{
       agent any
       tools{
       maven 'Maven'
       }
       Stages{
           Stage("Checkout"){
           Steps{
               git origin:"main",url"https://github.com/bitcsedevops4-art/selenium1.git"
               }
              }
            Stage("build"){
            Steps{
             sh"mvn clean install"
             }
            }
            Stage("test"){
            Steps{
             sh"mvn test"
             }
            }
            Stage("Run application"){
            Steps{
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
            
               

