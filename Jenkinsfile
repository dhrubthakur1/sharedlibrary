@Library('shared-lib-src') _
import com.sharedlib.SharedLibrary;
//new SharedLibrary(steps).startBuild()
def sharedLib = new SharedLibrary(this)
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
              script{
                //sharedLib.startBuild()
                new SharedLibrary(this)
              }
            }
        }
    }
}
//new SharedLibrary(this).startBuild()
