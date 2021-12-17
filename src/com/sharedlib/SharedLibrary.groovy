package com.sharedlib;

public class SharedLibrary {
  def steps
  
  public SharedLibrary(steps) {
    this.steps = steps
  }
  
  public void startBuild() {
    println(steps)
    steps.echo "Hello, World!"
  }
}
