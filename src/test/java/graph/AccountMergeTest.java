package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountMergeTest {
    @Test
    public void test(){
        //[["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]

        List<List<String>> list =new ArrayList<>();
        list.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        list.add(Arrays.asList("John", "johnnybravo@mail.com"));
        list.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        list.add(Arrays.asList("Mary", "mary@mail.com"));
        List<List<String>> lists = AccountsMerge.accountsMerge(list);
        System.out.println(list);
    }
}
