package com.sharedlib;

public class SharedLibrary {
  def steps
  
  public SharedLibrary(steps) {    
    this.steps = steps
  }
  
  public void startBuild() {
    println("22")
    println(steps)
    //steps.echo "echo Hello World!"    
    steps.steps.sh "echo Hello World!"
  }
}
