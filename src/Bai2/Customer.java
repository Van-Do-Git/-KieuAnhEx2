package Bai2;

public class Customer {
    private String name;
    private int no;
    private int codeMeter;

    public Customer() {
    }

    public Customer(String name, int no, int codeMeter) {
        this.name = name;
        this.no = no;
        this.codeMeter = codeMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCodeMeter() {
        return codeMeter;
    }

    public void setCodeMeter(int codeMeter) {
        this.codeMeter = codeMeter;
    }
    public String toString(){
        return " Name: "+getName()+
                " No: "+getNo()+
                " Code Meter: "+getCodeMeter();
    }
}
