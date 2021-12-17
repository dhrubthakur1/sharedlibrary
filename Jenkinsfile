@Library('shared-lib-src') _
import com.sharedlib.SharedLibrary;
//new SharedLibrary(steps).startBuild()
pipeline{
agent any
  stages{
    stage('Build'){
      steps{
        script{
          new SharedLibrary(this).startBuild()
        }
      }
    }
  }
}
//new SharedLibrary(this).startBuild()
