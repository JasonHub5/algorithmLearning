/*
690. 员工的重要性

给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。

比如，员工1是员工2的领导，员工2是员工3的领导。他们相应的重要度为15, 10, 5。那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。

现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。

示例 1:

输入: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
输出: 11
解释:
员工1自身的重要度是5，他有两个直系下属2和3，而且2和3的重要度均为3。因此员工1的总重要度是 5 + 3 + 3 = 11。
注意:

一个员工最多有一个直系领导，但是可以有多个直系下属
员工数量不超过2000。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/employee-importance
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package graph;

import java.util.HashMap;
import java.util.List;

public class EmployeeImportance {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    private static HashMap<Integer, Employee> map;

    public static int getImportance(List<Employee> employees, int id) {
        if (employees.size() == 0) {
            return 0;
        }
        Employee emp = map.get(id);
        return dfs(emp);
    }

    public static int dfs(Employee employee) {
        int value = employee.importance;
        for (int id : employee.subordinates) {
            value += dfs(map.get(id));
        }
        return value;
    }

    private static void initialMap(List<Employee> employees) {
        map = new HashMap<>();
        for (Employee val : employees) {
            map.put(val.id, val);
        }
    }
}
