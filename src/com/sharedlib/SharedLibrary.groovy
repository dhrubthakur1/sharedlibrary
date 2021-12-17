package com.sharedlib;

public class SharedLibrary {
  def steps
  
  public SharedLibrary(steps) {
    println('111')
    this.steps = steps
  }
  
  public void startBuild() {
    println('222')
    println(steps)
    steps.sh "echo Hello World!"
    //steps.echo "Hello, World!"
  }
}
