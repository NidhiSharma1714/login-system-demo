package com.example.demo;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        int[] nums = { 1,2,3,4,5 };
        int first=0;
        int second=-1;
        for(int i=0;i<nums.length;i++){
            if(first<nums[i]){
                first=nums[i];
            }
        }
        System.out.println("the value of first Max is "+first);
    }

}
