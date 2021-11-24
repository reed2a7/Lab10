class Cookie {
  private int cookieCount;
  private int bakeTemp;
  private int bakeTime;
  private boolean isReady;
  
  Cookie() {
    cookieCount = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int acookieCount, int abakeTemp, int abakeTime, boolean aisReady) {
    cookieCount = acookieCount;
    bakeTemp = abakeTemp;
    bakeTime = abakeTime; 
    isReady = aisReady;
  }

  boolean getisReady() {
    return isReady;
  }

  void setcookieCount(int acookieCount) {
    cookieCount = acookieCount;
  }

  void Bake(int abakeTemp, int abakeTime) {
    System.out.println(cookieCount + " cookies were baked at" + abakeTemp + " degress F for " + abakeTime + " minutes");
    isReady = true;
  }

}