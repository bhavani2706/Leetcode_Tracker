// Last updated: 09/07/2026, 09:50:44
import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // skip empty and current dir
                continue;
            } else if (part.equals("..")) {
                // go one directory up if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // valid directory name
                stack.push(part);
            }
        }

        // Build canonical path
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.insert(0, "/" + dir);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
