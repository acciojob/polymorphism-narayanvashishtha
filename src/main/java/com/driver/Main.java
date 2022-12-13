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
        Product p = new Product();
        p.product(3,4);
        p.product(3,4,5);
        p.product(3.4,5.5);
    }
}