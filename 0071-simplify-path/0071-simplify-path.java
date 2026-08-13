import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        for (String x : path.split("/")) {
            if (x.equals("..")) {
                if (!s.empty()) s.pop();
            } else if (!x.equals("") && !x.equals(".")) {
                s.push(x);
            }
        }

        return "/" + String.join("/", s);
    }
}