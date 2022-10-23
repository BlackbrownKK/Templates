package Collection.HashMap.HW1;

public class App {


    public static void main(String[] args) {
        FileData fileNubberA01 = new FileData("X001", 2, "testNumber01");
        FileData fileNubberA02 = new FileData("X002", 2, "testNumber02");
        FileData fileNubberA03 = new FileData("X002", 2, "testNumber03");

        FileNavigator myFirsrFileNavigator = new FileNavigator();
        myFirsrFileNavigator.add("testNumber01", fileNubberA01);
//        System.out.println(myFirsrFileNavigator.notifyAll()


//        String testNumber01 = "C:\\Users\\k.kosteniuk\\Documents\\hillel\\projects\\JavaPro13.09.2022\\1";
//        String testNumber02 = "C:\\Users\\k.kosteniuk\\Documents\\hillel\\projects\\JavaPro13.09.2022\\2";
//        String testNumber03 = "C:\\Users\\k.kosteniuk\\Documents\\hillel\\projects\\JavaPro13.09.2022\\3";
//
//        FileData fileNubberA01 = new FileData("X001", 2, "testNumber01");
//        FileData fileNubberA02 = new FileData("X002", 2, "testNumber02");
//        FileData fileNubberA03 = new FileData("X002", 2, "testNumber03");
//
//        FileNavigator myFirsrFileNavigator = new FileNavigator();
//        myFirsrFileNavigator.add(testNumber01, fileNubberA01);
//        myFirsrFileNavigator.add(testNumber01, fileNubberA02);
//        myFirsrFileNavigator.add(testNumber01, fileNubberA03);

//        System.out.println(myFirsrFileNavigator.find(testNumber01));
//        System.out.println(myFirsrFileNavigator.find(testNumber02));
//        System.out.println(myFirsrFileNavigator.find(testNumber03));

//        System.out.println(myFirsrFileNavigator.filterBySize(1));
//
//        myFirsrFileNavigator.remove(testNumber03);
//        myFirsrFileNavigator.find(testNumber01);
//        myFirsrFileNavigator.add(testNumber03,fileNubberA03);
    }
}
