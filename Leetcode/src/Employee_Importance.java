import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * (690)Employee Importance
 * You are given a data structure of employee information, which includes the employee's unique id, his importance value
 * 15, 10, and 5, respectively. Then employee 1 has a data structure like [1, 15,[2]], and employee 2 has [2, 10,[3]],
 * and employee 3 has [3,5,[]]. Note that although employee 3 is also a subordinate of employee 1, the relationship is
 * not direct.
 *
 * Now given the employee information of a company, and an employee id, you need to return the total importance value
 * of this employee and all his subordinates.
 *
 * Example 1:
 * Input: [[1,5,[2,3]],[2,3,[]],[3,3,[]]],1
 * Output: 11
 * Explanation:
 * Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3. They both have
 * importance value 3. so the total importance value of employee 1 is 5 + 3 + 3 = 11
 *
 * Note:
 * 1. One employee has at most one direct leader and may have several subordinates
 * 2. The maximum number of employees won't exceed 2000.
 *
 *
 * Time complexity: O(N)
 * Space complexity: O(n)
 *
 * Easy level
 *
 *
 */
public class Employee_Importance {
    public int getImportance(List<Employee> employees, int id){
        // 1是员工ID， 5是重要度
        // 1员工有两个手下分别是2和3
        // 2号员工，重要度是3，没手下
        // 3号员工，重要度是3，没收下
        int result = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id, e);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.add(map.get(id));
        while(!queue.isEmpty()){
            Employee current = queue.poll();
            result += current.importance;
            for(int sub : current.subordinates){
                queue.add(map.get(sub));
            }
        }
        return result;
    }
}
