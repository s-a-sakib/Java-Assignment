import java.security.PrivateKey;
import java.util.Objects;

public class Convertor {
    private String S1;
    private String S2;
    private double value;
    private double liter;
    private double kg;
    private double m;
    public Convertor(String S1,String S2,double value) {
        this.S1 = S1;
        this.S2 = S2;
        this.value = value;
        if(Objects.equals(S1, "fl oz")) liter = value*Constant.flozToLiter;
        else if (Objects.equals(S1,"gal")) liter = value*Constant.galToLiter;
        else if (Objects.equals(S1,"oz")) liter = value*Constant.ozToLiter;
        else if (Objects.equals(S1,"lb")) kg = value*Constant.lbToKg;
        else if (Objects.equals(S1,"in")) m = value*Constant.inToM;
        else if (Objects.equals(S1,"ft")) m = value*Constant.ftToM;
        else m = value*Constant.miToM;
    }
    public double getReturn(){
        if(Objects.equals(S2,"ml")) return liter*1000;
        else if (Objects.equals(S2,"l"))  return liter;
        else if (Objects.equals(S2,"g")) return kg * 1000;
        else if(Objects.equals(S2,"kg")) return kg;
        else if(Objects.equals(S2,"mm")) return m*1000;
        else if(Objects.equals(S2,"cm")) return m*100;
        else if(Objects.equals(S2,"m")) return m;
        else return m/1000;
    }
}