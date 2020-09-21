package com.hqyj.traveluser;

import java.util.Scanner;

public class test01{
    public static void main(String[] args){
        int[] A={1,3,5,7};
        int ans=BinarySearch(A,5);
        System.out.println(ans);

    }
    public static int BinarySearch(int[] A,int x){
        int left=0;
        int right=A.length-1;
        int middle;
        while (left<=right){
            middle=(left+right)/2;
            if(x==A[middle]){
                return middle;
            }
            else if(x<A[middle]){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return -1;
    }

        /*public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int a=sc.nextInt();
            System.out.println("请输入第一个数：");
            int b=sc.nextInt();
            int sum=0;
            int bwO=a/100;
            int swO=(a-bwO*100)/10;
            int gwO=a-bwO*100-swO*10;

            int bwT=b/100;
            int swT=(b-bwO*100)/10;
            int gwT=b-bwO*100-swO*10;
            int bw=bwO+bwT;
            int sw=swO+swT;
            int gw=gwO+gwT;
            sum= bw*100+sw*10+gw;
            System.out.println(sum);
        }*/
}