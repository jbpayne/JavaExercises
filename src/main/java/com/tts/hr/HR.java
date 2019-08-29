package com.tts.hr;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getNumEmployees() {
        return employees.size();
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public String payEverybody() {
        double total = 0.0;
        for (Employee e : employees) {
            System.out.println("Employee: " + e + ", was paid " + NumberFormat.getCurrencyInstance().format(e.computePay()) + ".");
            total += e.computePay();
        }
        return "Total pay: " + NumberFormat.getCurrencyInstance().format(total);
    }
}
