package leetcode;

import java.util.*;

public class LeetCode146 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 캐시는 {1=1}입니다.
        lRUCache.put(2, 2); // 캐시는 {1=1, 2=2}입니다.
        lRUCache.get(1); // 1을 반환
        lRUCache.put(3, 3); // LRU 키는 2였고, 키 2를 제거하고, 캐시는 {1=1, 3=3}입니다.
        lRUCache.get(2); // -1을 반환합니다(찾을 수 없음).
        lRUCache.put(4, 4); // LRU 키는 1이었고, 키 1을 제거하고, 캐시는 {4=4, 3=3}입니다.
        lRUCache.get(1); // -1을 반환합니다(찾을 수 없음).
        lRUCache.get(3); // 3을 반환
        lRUCache.get(4); // 4를 반환
        lRUCache.put(1, 1); // 캐시는 {1=1}입니다.
        lRUCache.put(1, 2); // 캐시는 {1=1}입니다.
    }

    static class LRUCache {
        LinkedHashMap<Integer, Integer> linkedHashMap;
        int capacity;
        public LRUCache(int capacity) {
            this.capacity = capacity + 1;
            this.linkedHashMap = new LinkedHashMap<>(this.capacity);
        }

        public int get(int key) {
            Integer value = this.linkedHashMap.get(key);
            if (value != null) {
                this.linkedHashMap.remove(key);
                this.linkedHashMap.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (this.linkedHashMap.get(key) != null) {
                this.linkedHashMap.remove(key);
            }
            this.linkedHashMap.put(key, value);
            if (this.linkedHashMap.size() == capacity) {
                this.linkedHashMap.remove(this.linkedHashMap.keySet().iterator().next());
            }
        }
    }
}
