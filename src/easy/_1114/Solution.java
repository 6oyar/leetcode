package easy._1114;

/**
 * 1114. Print in Order
 * https://leetcode.com/problems/print-in-order/
 */
public class Solution {
//    public static void main(String[] args) throws InterruptedException {
//        Foo   = new Foo();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    foo.first(new Runnable() {
//                        @Override
//                        public void run() {
//                            System.out.print("first");
//                        }
//                    });
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    foo.second(new Runnable() {
//                        @Override
//                        public void run() {
//                            System.out.print("second");
//                        }
//                    });
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    foo.third(new Runnable() {
//                        @Override
//                        public void run() {
//                            System.out.print("third");
//                        }
//                    });
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//    }
//
//    static class Foo {
//
//        public volatile boolean first = false;
//        public volatile boolean second = false;
//
//        public Foo() {
//
//        }
//
//        public void first(Runnable printFirst) throws InterruptedException {
//            synchronized (this) {
//                // printFirst.run() outputs "first". Do not change or remove this line.
//                printFirst.run();
//                first = true;
//            }
//        }
//
//        public void second(Runnable printSecond) throws InterruptedException {
//            synchronized (this) {
//                while (!first) {
//
//                }
//                // printSecond.run() outputs "second". Do not change or remove this line.
//                printSecond.run();
//                second = true;
//            }
//        }
//
//        public void third(Runnable printThird) throws InterruptedException {
//            synchronized (this) {
//                while (!second) {
//
//                }
//                // printThird.run() outputs "third". Do not change or remove this line.
//                printThird.run();
//            }
//        }
//    }

}
