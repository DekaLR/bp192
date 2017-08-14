package mobile.contents.contest.CelLib;


public class Input_Data {
    private static String input1 = "0";
    private static int input1_type = 2;
    private static String input2 = "";
    private static int input2_type = 2;

    public void aidl() {

    }
    /*public String convert(int input, int format);
    public String convert(int input);

    public String plus(int input1, int format1, int input2, int format2);

    public String minus(int input1, int format1, int input2, int format2);*/

    public String getInput1() {
        return input1;
    }
    public String getInput2() {
        return input2;
    }
    public int getInput1_type() {
        return input1_type;
    }
    public int getInput2_type() {
        return input2_type;
    }

    public void setInput1(String i) {
        input1 = i;
    }
    public void setInput2(String i) {
        input2 = i;
    }
    public void setInput1_type(int i) {
        input1_type = i;
    }
    public void setInput2_type(int i) {
        input2_type = i;
    }
}
