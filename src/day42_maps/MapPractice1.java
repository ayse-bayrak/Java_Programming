package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // I want to find out how many female and male employees that we have in this map

        System.out.println("---------------------------------------------");
        // how many female & male employees in the map?
        //Do I need to iterate the keys or the values or the entries? which one would be the best?

        int countMaleEmployee = 0;
        int countFemaleEmployees = 0;

        /*
        it is not the best choice for solution
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */

        // Since I just need the values of the map, we should use Values() method
        // so depending on the scenario that you will decide which iteration of the map you should be using
        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployee++;
            }
        }

        System.out.println("Male Employees: " + countMaleEmployee);
        System.out.println("Female Employees: " + countFemaleEmployees);

        System.out.println("---------------------------------------------");
        // display the names of all the female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender =employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }
         */
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("---------------------------------------------");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);
/*
by the iterating the map by te entry (using entrySet() method) we are able to update the calues by using the set value method,
because in the entry we do have this setter for the value. Do we have the setter for the keys of the map,
We don't because the keys are final, we don't have the setter of the keys
 */

    }
}
