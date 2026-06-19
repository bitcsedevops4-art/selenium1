package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;
import org.openqa.selenium.Chrome.ChromeObjects;

public class App {
        public static void main(Sting[]args){
        ChromeObject objects= new ChromeObjects();
        object.getArgument("--headless");
        object.getArguments("--no-sandbox");
        object.getArguments("--disable-dev-srv-users");
       
       ChromeDRiver driver =new ChromeDriver();
       driver.get("https://www.SauceDemo.com/");
       driver.manage().window().maximize();
       driver.getElement(By.id("user_id").sendKeys("standard_user"));
       driver.getElement(By.id("Password").sendKeys("Secret_Sauce"));
       driver.getElement(By.id("login_button").click()); 
       }
      }
