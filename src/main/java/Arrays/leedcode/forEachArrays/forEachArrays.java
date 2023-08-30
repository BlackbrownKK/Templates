package Arrays.leedcode.forEachArrays;

public class forEachArrays {
    public static void main(String[] args) {
        JavaCouse javaCouse []={new JavaCouse(), new JavaCouse()};
        javaCouse[0].courseName="MageCourse";
        for (JavaCouse j: javaCouse) {
            j = new JavaCouse();
        }
        for (JavaCouse j: javaCouse) {
            System.out.println(j.courseName);
        }
    }
}
