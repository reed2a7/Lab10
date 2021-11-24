class Sugar extends Cookie {
  private String cookieShape;
  private boolean cookieDecorated;

  Sugar() {
    cookieShape = "";
    cookieDecorated = false;
  }

  Sugar(String acookieShape, boolean cookieDecorated) {
    cookieShape = acookieShape;
    cookieDecorated = false;
  }

  String getcookieShape() {
    return cookieShape;
  }

  void setcookieShape(String acookieShape) {
    cookieShape = acookieShape; 
  }

  Sugar(int acookieCount, int abakeTemp, int abakeTime, boolean aisReady, String acookieShape) {
    super(acookieCount, abakeTemp, abakeTime, aisReady);
    cookieShape = acookieShape;
  }
  
  void cutOut(String acookieShape, int acookieCount) {
    super.setcookieCount(acookieCount);
    cookieShape = acookieShape;
    System.out.println(acookieCount + " cookies were cut into " + acookieShape);
  }

  void decorate() {
    super.getisReady();
    if (super.getisReady() = true) {
      System.out.println("The cookies were decorated");
    }
    else if (super.getisReady() = false){
      System.out.println("Make sure to bake the cookies first");
    }
  }
  

}