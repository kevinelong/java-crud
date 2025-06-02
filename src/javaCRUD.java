import java.util.*;


//What is CRUD
/*
(C)reate - Assign to variable?
(R)ead - Print to console?
(U)pdate - Change value of variable?
(D)elete - Destroy the value of a variable?
 */
class Row extends HashMap<String, String> {
    Row(Map map){
        super(map);
    }
}

class Table extends ArrayList<Row> {
}

public class javaCRUD {
    public static void main(String[] args) {
        Integer x = 123; //CREATE
        System.out.printf("x=%d\n", x); //READ

        x = 456; //UPDATE
        System.out.printf("x=%d\n", x); //READ AGAIN

        x = null; //DELETE
        System.out.printf("x=%d\n", x); //READ AGAIN
        /// ////////////////////////////////////////////
        var table = new Table();

        //CREATE
        table.add(new Row(Map.of(
                "ID", "111",
                "NAME", "DRINKS")));
        table.add(new Row(Map.of(
                "ID", "222",
                "NAME", "DESSERTS")));
        table.add(new Row(Map.of(
                "ID", "333",
                "NAME", "MAIN COURSES")));

        //READ
        table.forEach(System.out::println);
        System.out.println();

        //UPDATE
        table.set(0, new Row(Map.of(
                "ID", "999",
                "NAME", "BEVERAGES")));
        //READ
        table.forEach(System.out::println);
        System.out.println();

        //DELETE
        table.remove(1); //desserts
        //READ
        table.forEach(System.out::println);
        System.out.println();
    }
}


//public class demoList {
//    public static void main(String[] args) {
//        var list = List.of(
//            Map.of("ID", "111", "FIRST", "Kevin", "LAST", "LONG"),
//            Map.of("ID", "111", "FIRST", "Kevin", "LAST", "LONG")
//        );
//        list.forEach(System.out::println);
//
//    }
//}
