package com.training.w_1_Day14;


public class CentralUniversity {
    String name ="abc";

  private static CentralUniversity centralUnivSingleInstance = null;




  private CentralUniversity() {
      name= "Fuvgh";
  }

  public synchronized static CentralUniversity getInstance() {

    if (CentralUniversity.centralUnivSingleInstance == null) {
      CentralUniversity.centralUnivSingleInstance = new CentralUniversity();
    }

    return CentralUniversity.centralUnivSingleInstance;
  }

  public void broadcast() {
    System.out.println("This is singleton."+name);
  }

}