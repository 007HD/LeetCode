//class FirstUnique {
//     Queue<Integer> queue = new ArrayDeque<>();
//     public FirstUnique(int[] nums) {
//         for(int num: nums) {
//             queue.add(num);
//         }
//     }
    
//     public int showFirstUnique() {
//         for(int num: queue) {
//             int count = Collections.frequency(queue, num);
//             if(count == 1) {
//                 return num;
//             }
//         }
//         return -1;
//     }
    
//     public void add(int value) {
//         queue.add(value);
//     }
// }
//}

//Time Complexiity O(N^2)
//Space Complexity O(N)

// Optimized Solution
class FirstUnique {
    Set<Integer> unique = new LinkedHashSet<>();
    Set<Integer> all = new HashSet<>();
    public FirstUnique(int[] nums) {
        for(int num: nums) {
            add(num);
        }
        
    }
    
    public int showFirstUnique() {
        if(unique.isEmpty()) {
            return -1;
        } else {
            return unique.iterator().next();
        }
    }
    
    public void add(int value) {
        if(all.add(value)) {
            unique.add(value);
        } else {
            unique.remove(value);
        }
    }
}
//Time Complexity: O(N)
//Space Complexity: O(N)