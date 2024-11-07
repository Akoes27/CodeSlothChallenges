import Java.util.Scanner;
/**Sorry if this has errors. I wrote it during my comp sci class with github instead of a nice IDE*/
public class ControlCandControlV {

  private String info;
  private String clipboard;
  public ControlCandControlV(){
  Scanner sc = new Scanner(System.in);
    clipboard = "";
    info = sc.nextLine();
  }
  public ControlCandControlV(String info){
    this.info = info;
    clipboard = "";
  }

  public void utilizeCtrls(){
int x;
      while(info.indexOf("Ctrl + ")>-1){
        x=info.indexOf("Ctrl + ")+7;
        
      }
      if(info.charAt(x).equals("C"))
      clipboard = info.subString(0,info.indexOf("Ctrl + C"));
      if(info.charAt(x).equals("V")){
info = info.subString(0,info.indexOf("Ctrl + "))+info.subString(info.indexOf("Ctrl + "))+clipboard; 
      }

      info = info.subString(0,info.indexOf("Ctrl + "))+info.subString(info.indexOf("Ctrl + ")+8); 
    }
  }
}
