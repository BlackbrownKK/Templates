package Collection.HashMap.HW1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {
    //    private final String fileName;
//    private final double sizeOfFileInBytes;
//    private final String pachToFile;
    private final HashMap<String, ArrayList<FileData>> hashMapFileData = new HashMap<>();

    public void add(String pachToFile, FileData myFilesInArrayList) {
        if (myFilesInArrayList.getPachToFile().equals(pachToFile)) {
            hashMapFileData.put(pachToFile, new ArrayList<>());
        } else {
            System.out.println("such file already exists");
        }
    }



//            case myFiles.getPachToFile().equals(pachToFile) -> System.out.println("such file already exists");
////            case !collectionHashMapFileData.containsKey(pachToFile) -> collectionHashMapFileData.put(pachToFile, new ArrayList<>());
//            default -> collectionHashMapFileData.put(pachToFile, new ArrayList<>());
//        }
//
////        public ArrayList<FileData> find (String pachToFile){
////            return collectionHashMapFileData.get(pachToFile);
////        }myFiles.getPachToFile().equals(pachToFile)

//        public ArrayList<FileData> filterBySize ( int maxBytes){
//            ArrayList<FileData> f1FilesSortedBySize = new ArrayList<>();
//            ArrayList<FileData> f2filesMatchedBySize = new ArrayList<>();
//            for (int i = 0; i < f1FilesSortedBySize.size() && f1FilesSortedBySize.get(i).getSizeOfFileInBytes() <= maxBytes; i++) {
//                f2filesMatchedBySize.add(f1FilesSortedBySize.get(i));
//            }
//            return f2filesMatchedBySize;
//        }
//
//        private ArrayList<FileData> sortSavedFilesBySize () {
//            ArrayList<FileData> allFilesSortedBySize = new ArrayList<>();
//            for (Map.Entry<String, ArrayList<FileData>> entry : hashMapFileData.entrySet()) {
//                allFilesSortedBySize.addAll(entry.getValue());
//            }
//            allFilesSortedBySize.sort(Comparator.comparing(FileData::getSizeOfFileInBytes));
//            return allFilesSortedBySize;
//        }

    public void remove(String pachToFile) {
        hashMapFileData.remove(pachToFile);
    }
}

