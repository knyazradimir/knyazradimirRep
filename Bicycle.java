/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
class Student {
        int age;
        String hair;
        String education;
        
        public Student(){
            age=18;
            hair="Black";
            education="bachelor";
        }//Конструктор
        
        public Student (int setAge,String setHair,String setEducation){
            age=setAge; hair=setHair; education=setEducation;
        }
        
        public void changeAge(int setAge, String drhair, String noveducation){
            age=setAge;
            hair=drhair;
            education=noveducation;
        }
        
        public String gethair(){
            return hair;
        }
}
class Bicycle {
    public static void main (String[] args){
            String f="Black";
            String h="bachelor";
            Student s = new Student(25,f,h);
            System.out.println("age "+s.age);
            System.out.println("hair "+s.hair);
            System.out.println("education "+s.education);
            s.changeAge(22,"white","");
            System.out.println("age (после setAge) "+s.age+"; hair (после sethair) "+s.hair);
            System.out.println("gethair выдает "+s.gethair());
        }
}
