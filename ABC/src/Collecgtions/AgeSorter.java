package Collecgtions;

import java.util.Comparator;

import test.Employee;

public class AgeSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}