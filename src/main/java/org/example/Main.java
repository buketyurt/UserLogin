package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız : ");
        String username = scanner.nextLine();

        System.out.println("Şifreniz : ");
        String password = scanner.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız! ");
        } else{
            password = "java123";
            System.out.println("Giriş bilgileriniz yanlış! Şifrenizi sıfırlamak ister misiniz?");
            String answer = scanner.nextLine();
            if(Objects.equals(answer, "evet")){
                System.out.println("Yeni şifre :");
                String newPassword = scanner.nextLine();
                if (newPassword.equals(password) ){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");

                }else{
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu. ");
                }
            }
        }
    }
}