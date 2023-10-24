//package com.mawuli.dev.controller;
//
//import com.mawuli.dev.entity.Person;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping
//public class RafiatuController {
//
//     List<Person> people = new ArrayList<Person>(){{
//         add(new Person("Fuad", 130));
//         add(new Person("rafiatu", 13));
//         add(new Person("Muhammed", 25));
//     }};
//
//   @GetMapping("salutation")
//    public String rafiatu(){
//       return "Hello World";
//
//    }
//    @GetMapping("introduction")
//    public String introduction(){
//       return "My name is Rafiatu Ibrahim";
//    }
//
//    @GetMapping("person")
//    public List<Person> people(){
//       return people;
//    }
//
//    @GetMapping("person/{name}")
//    public List<Person> personByName(@PathVariable("name") String name){
////        for (Person person: people) {
////            if (person.getName().equals(name)){
////                return person;
////            }
////        }
//        return null;
//
//
//
//
//
//    }
//
////    @GetMapping("person/{name}/age/{age}")
////    public Person personByNameAndAge(@PathVariable("name") String name, @PathVariable("age") Integer age){
////        for (Person person: people) {
////            Boolean nameMatch = person.getName().equals(name);
////            Boolean ageMatch = person.getAge() == age;
////
////            if (nameMatch && ageMatch){
////                return person;
////            }
////        }
////        return null;
////    }
//
////    @PostMapping("person")
////    public String person(@RequestBody Person person){
////       people.add(person);
////     return "hello " + person.getName();
////    }
//
////    @PutMapping("person/{name}")
////    public String update(@RequestBody Person person, @PathVariable("name") String name){
////        for (Person searchPerson: people) {
////
////            if (searchPerson.getName().equals(name)){
////                searchPerson.setName(person.getName());
////                searchPerson.setAge(person.getAge());
////
////                return "updated successfully";
////            }
////        }
////        return "no record found";
////    }
//
////    @DeleteMapping("person/{name}")
////    public String delete(@PathVariable ("name") String name){
////        // check if Person with name exists
////        for (Person person : people) {
////            if (person.getName().equals(name)){
////                people.remove(person);
////                return person.getName() + " deleted successfully";
////            }
////        }
////
////        return "Delete unsuccessful";
////    }
//
//
//
//}
