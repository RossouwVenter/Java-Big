package com.company;

public class Exercise28 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }


    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            double area = width * height;
            double totalBuckets = (area / areaPerBucket) - extraBuckets;
            return (int)Math.ceil(totalBuckets);
        }
    }

    public static int getBucketCount(double width,double height, double areaPerBucket){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
                return -1;
            } else {
                double area = width * height;
                double totalBuckets = (area / areaPerBucket);
                return (int)Math.ceil(totalBuckets);
            }
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if ( area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double tBuckets = area / areaPerBucket;
            return (int)Math.ceil(tBuckets);
        }
    }
}
