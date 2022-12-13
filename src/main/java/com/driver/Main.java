package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            int ans;
            return ans = x+y;
        }
        public int product(int x, int y, int z){
            int ans;
            return ans = x+y+z;
        }
        public double product(double x, double y){
            double ans;
            return ans = x+y;
        }
    }
    public static void main(String[] args) {
        int ans, ans1;
        double sol;
        Product p = new Product();
        ans1 = p.product(3,4);
        ans = p.product(3,4,5);
        sol = p.product(3.4,5.5);
        System.out.println(ans1);
        System.out.println(ans);
        System.out.println(sol);
    }
}