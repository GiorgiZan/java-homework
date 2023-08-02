package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {
        // 2) start
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("555-542-231");
        arrayList.add("555-887-987");
        arrayList.add("555-161-143");
        arrayList.add("555-189-6667");


        // 3) start
        System.out.println("Using regular for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            String phoneNumber = arrayList.get(i);
            System.out.println(phoneNumber);
        }

        System.out.println("\nUsing iterator in while loop:");
        Iterator<String> iterator  = arrayList.iterator();
        while (iterator .hasNext()) {
            System.out.println( iterator .next());
        }


        // 4) start
        HashMap<String, String> hashMap = new HashMap<>();

        String[] names = {"გიორგი", "თინათინიუს", "ცოტნიუს", "სოფიუს"};

        for (int i = 0; i < arrayList.size() && i < names.length; i++) {
            String name = names[i];
            String phoneNumber = arrayList.get(i);
            hashMap.put(name, phoneNumber);
        }

        for (String name : hashMap.keySet()) {
            String phoneNumber = hashMap.get(name);
            System.out.println("Key=\"" + name + "\", Value=\"" + phoneNumber + "\"");
        }


        // 5) start
        System.out.println("Names whose phone number contains '8':");
        for (String name : hashMap.keySet()) {
            String phoneNumber = hashMap.get(name);
            if (phoneNumber.contains("8")) {
                System.out.println(name);
            }
        }


        // 7) start
        TreeSet<Circle> circleTreeSet = new TreeSet<>();
        System.out.println("\ncircleTreeSet:");
        circleTreeSet.add(new Circle(5.0));
        circleTreeSet.add(new Circle(5.0)); // იგივე რადიუსით. არ არის უნიკალური ამიტომაც  TreeSet არ დაამატებს რადგან ის ადარებს ჩვენი გაწერილი compareTo-თი
        circleTreeSet.add(new Circle(3.0));
        circleTreeSet.add(new Circle(7.0));
        circleTreeSet.add(new Circle(10.0));
        circleTreeSet.add(new Circle(7.0)); // იგივე რადიუსით. არ არის უნიკალური ამიტომაც  TreeSet არ დაამატებს რადგან ის ადარებს ჩვენი გაწერილი compareTo-თი
        circleTreeSet.add(new Circle(2.0));
        circleTreeSet.add(new Circle(2.0)); //იგივე რადიუსით. არ არის უნიკალური ამიტომაც  TreeSet არ დაამატებს რადგან ის ადარებს ჩვენი გაწერილი compareTo-თი
        circleTreeSet.add(new Circle(4.0));
        circleTreeSet.add(new Circle(6.0));


        for (Circle circle : circleTreeSet) {
            System.out.println(circle);
        }



        // 8) start
        HashSet<Circle> circleHashSet = new HashSet<>();
        System.out.println("\ncircleHashSet:");
        circleHashSet.add(new Circle(5.0));
        circleHashSet.add(new Circle(5.0)); //იგივე რადიუსით.HashSet დაამატებს რადგან ის ადარებს hashcode-ით new Circle-ის გამო კი ყველას განსხვავებული მისამართი აქვს
        circleHashSet.add(new Circle(3.0));
        circleHashSet.add(new Circle(7.0));
        circleHashSet.add(new Circle(10.0));
        circleHashSet.add(new Circle(7.0)); //იგივე რადიუსით. HashSet დაამატებს რადგან ის ადარებს hashcode-ით new Circle-ის გამო კი ყველას განსხვავებული მისამართი აქვს
        circleHashSet.add(new Circle(2.0));
        circleHashSet.add(new Circle(2.0)); //იგივე რადიუსით. HashSet დაამატებს რადგან ის ადარებს hashcode-ით new Circle-ის გამო კი ყველას განსხვავებული მისამართი აქვს
        circleHashSet.add(new Circle(4.0));
        circleHashSet.add(new Circle(6.0));


        for (Circle circle : circleHashSet) {
            System.out.println(circle);
        }

        }
}
