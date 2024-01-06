package com.company;

import javax.tools.JavaCompiler;
import javax.tools.Tool;
import javax.tools.ToolProvider;

public class Main {

    public static void main(String[] args) {
	    // Создаём компилятор для джава файлов
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        // он переведёт из text.java в text.class

        //получаем сообщение о компиляции = компилируем (вход парам, выход парам, ошибки, файл)
        int result = compiler.run(null, null, null, "text.java");
        System.out.println(result);
    }
}
