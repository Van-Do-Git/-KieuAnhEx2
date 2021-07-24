package Bai5.model;

import java.time.LocalDate;

public class Employee extends Cadres {
    public final String[] arrRank = {"3/7", "4/7", "5/7", "6/7", "7/7"};
    private int indexRank;

    public Employee() {

    }

    public Employee(String name, LocalDate born, boolean sex, String address, int indexRank) {
        super(name, born, sex, address);
        this.indexRank = 0;
    }

    public int getIndexRank() {
        return indexRank;
    }

    public void setIndexRank(int indexRank) throws IndexOutOfBoundsException{
        if(indexRank<0||indexRank>4){
            throw new IndexOutOfBoundsException("Not exits this rank");
        }else
        this.indexRank = indexRank;
    }

    public String getRank() {
        return arrRank[indexRank];
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "indexRank=" + getRank() +
                '}';
    }
}
