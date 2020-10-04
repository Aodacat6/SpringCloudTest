package com.mycom.springtest;



import java.util.*;
import java.util.stream.Collectors;

import static com.mycom.springtest.contrast.TestClass2.AAA;

/**
 * @author ：songdalin
 * @date ：2020/9/25 上午 09:52
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class testMain {

//    public static void main(String[] args){
//        Map<String, Object> map = new HashMap<>();
//        map.put("tom", 10);
//        map.put("tom", 12);
//        map.put("tom", 22);
//        map.put("amy", 33);
//        map.put("amy", 33);
//        map.put("amy", 2);
//        map.put("ming", 8);
//        map.put("ming", 54);
//        map.put("ming", 86);
//        map.put("ming", 10);
//        map.put("damiao", 10);
//
//        List<Map<String, Object>> list = new ArrayList<>();
//        list.add(map);
//
//        Map<Object, List<Map<String, Object>>> newMap = list.stream().collect(Collectors.groupingBy(m -> map.keySet()));
//        //newMap.forEach(e -> System.out.println(e));
//        System.out.println();
//    }

/*    public static void main(String[] args){
        Student a = new Student(1,"mm");
        Student b = new Student(2, "gg");
        List<Student> studentList = Arrays.asList(a,b);
        Map<Integer, Student> map = studentList.stream().collect(Collectors.toMap(
                Student::getId, student -> student
        ));
        map.forEach(( te, ty) -> {System.out.println("key is " + te);
        System.out.println("value is " + ty);} );
    }*/

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        ListTest listTest = new ListTest();
        listTest.setIntegerList(list);
        list.add(22);
        listTest.setIntegerList(list);
        Thread.sleep(10);
        System.out.println(AAA);
    }

}


class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class ListTest{
    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
}
