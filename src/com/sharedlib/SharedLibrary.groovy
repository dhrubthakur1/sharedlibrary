package com.sharedlib;

public class SharedLibrary {
  def pipeline
  
  public SharedLibrary(pipeline) {    
    this.pipeline = pipeline
  }
  
  public void startBuild() {
    println("22")
    println(pipeline)
    //steps.echo "echo Hello World!"    
    pipeline.steps.bat "echo Hello World!"
  }
}
