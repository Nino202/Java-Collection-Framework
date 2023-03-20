import java.util.*;

public class CollectionDemo {
    public static void main(String A[]) {

        // LIST : ARRAY LIST OR LINKED LIST(Same as ARRAY LIST)

        List<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(7);

        System.out.println(al.get(3));
        al.set(2, 30);
        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        al.remove(Integer.valueOf(7));
        System.out.println(al);

        System.out.println(al.contains(15));
        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(20);

        al.addAll(l);
        System.out.println(al);

        System.out.println(al.size());

        for (Integer i : al) {
            System.out.println("Element: " + i);
        }

        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            System.out.println("iterator: " + it.next());
        }

        // LIST : STACK

        Stack<String> name = new Stack<>();

        name.push("Madhura");
        name.push("Aryaa");
        name.push("Yash");
        name.push("Dip");
        name.push("Sujal");

        System.out.println(name);
        System.out.println(name.peek());

        name.pop();
        System.out.println(name);
        System.out.println(name.peek());

        // QUEUE : LINKED LIST

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());
        // return true/false/null || thows Exception
        // offer()---------------||-------add()
        // peek()----------------||-------element()
        // poll()-----------------||-------remove()

        // QUEUE: PRIORITY QUEUE

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(7);
        pq.offer(40);
        pq.offer(13);

        System.out.println(pq);
        pq.poll();

        System.out.println(pq);
        System.out.println(pq.peek());

        // QUEUE : ARRAYDEQUE(Doubly Ended Queue)

        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.offer(10);
        aq.offerLast(30);
        aq.offerFirst(50);
        aq.offer(40);

        System.out.println(aq);

        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        System.out.println(aq.poll());
        System.out.println(aq);
        System.out.println(aq.pollFirst());
        System.out.println(aq);
        System.out.println(aq.pollLast());
        System.out.println(aq);

        // SET
        /// Set<Integer> ts = new TreeSet<>(); // (in sorted order and unique)
        // Set<Integer> lhs = new LinkedHashSet<>();//(in sequence as we inserted)
        Set<Integer> set = new HashSet<>();

        set.add(4);
        set.add(8);
        set.add(6);
        set.add(2);
        set.add(3);

        set.add(4);
        set.add(4);
        set.add(4);

        set.remove(6);
        System.out.println(set);

        System.out.println(set.contains(10));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

        // MAP : HashMap
       // Map<String, Integer> t = new TreeMap<>(); //sort the keys
        Map<String, Integer> st = new HashMap<>();

        st.put("Omkar", 259);
        st.put("Prajwal", 313);
        st.put("Sushil", 252);
        st.put("Rashmi", 251);

        st.putIfAbsent("Niranjan", 253);

        if (!st.containsKey("Shreya")) {
            st.put("Shreya", 299);
        }

        System.out.println(st);
        System.out.println(st.containsKey("Dakshita"));
        System.out.println(st.containsValue(314));
        System.out.println(st.isEmpty());

        for (Map.Entry<String, Integer> e : st.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String e : st.keySet()) {
            System.out.println(e);
        }

        for (Integer e : st.values()) {
            System.out.println(e);
        }

        st.remove("Omkar");
        System.out.println(st);

        st.clear();
        System.out.println(st);
    }

}
