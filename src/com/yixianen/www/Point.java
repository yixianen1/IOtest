package com.yixianen.www;

public class Point {
    private double x;
    private double y;
    // 获取距离
    public double getDistance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
    // 测试
    public static void main(String[] args) {
        //第一个点的坐标
        Point p1 = new Point(1, 0);
        //第二个点的坐标
        Point p2 = new Point(3, 0);
        System.out.println(p1.getDistance(p2));
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Point() {
        super();
    }
}

