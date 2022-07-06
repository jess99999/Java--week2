
public class Ex12_ListEnds {
    public static void main(String args[]) {
    int[] numList = {5, 10, 15, 20, 25};
    int[] firstLast = new int[2];

    int size = (numList.length - 1);

    firstLast[0] = numList[0];
    firstLast[1] = numList[size];

    System.out.println(firstLast[0]);
    System.out.println(firstLast[1]);
}
}