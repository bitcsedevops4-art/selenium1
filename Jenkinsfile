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
              sh" mvn  exec:java -Dexec.mainClass="com.example.App"
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
            
               

