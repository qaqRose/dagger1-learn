package org.example.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.util.List;

public class TypeTokenTest {

    public static void main(String[] args) {
        String json = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";

        // 创建一个TypeToken对象，用于保留泛型类型信息
        TypeToken<List<Person>> typeToken = new TypeToken<List<Person>>() {};

        // 通过getType()方法获取实际的Type对象
        java.lang.reflect.Type listType = typeToken.getType();

        // 使用Gson进行反序列化，将JSON数据转换为具体的泛型类型
        Gson gson = new Gson();
        List<Person> persons = gson.fromJson(json, listType);

        // 打印解析结果
        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();
        }
    }
}

@Data
class Person {
    private String name;
    private int age;

    // 省略构造方法、getter和setter
}
