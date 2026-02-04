package Package2;

import java.util.*;

public class Student implements Comparable<Student> {

    private int id;
    private  String name;
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FAKHAR id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }



    public static int[] dublicateNUmbers(int [] array){

        int [] arrays= new int[array.length];
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    arrays[i]=j;
                }
            }
        }
        return arrays;
    }


    public static void main(String[] args) {

        Student student = new Student(101,"Fakhar","Mandsaur");
        Student student1 = new Student(11,"nabeel","Indore");
        Student student2 = new Student(481,"Badrunr","Shahpura");
        Student student7 = new Student(651,"Sanobar","Ajmer");
        Student student3 = new Student(651,"Sanobar","Abmer");
        Student student4 = new Student(189,"Laynaat","Jaora");
        Student student6 = new Student(189,"Laynaat","Aaaora");

        List<Student> students= new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student6);
        students.add(student7);

        Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getAddress).reversed());


        for (Student student5: students){
            System.out.println(student5);
        }


        int num=0;

        List<Integer> list = Arrays.asList(1,3,5,25,3,6,7,8,5,5,9,9,9,15);
        int max=list.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(max);



        int [] array= list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();

        for (int i:array){
            if (!unique.add(i)){
                duplicates.add(i);}
//             else unique.add(i);
        }
        unique.removeAll(duplicates);
        System.out.println("Duplicates: " +duplicates);
        System.out.println("Unique Values: "+unique);

//        unique.addAll(duplicates);
        System.out.println(unique.contains(4));
        System.out.println(unique.stream().max(Comparator.comparingInt(x->x.intValue())).get());

        System.out.println("Unique Values After Each Loop: "+unique);

    }



}
