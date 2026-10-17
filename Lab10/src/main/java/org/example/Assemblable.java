package org.example;

interface Assemblable {

    void assemble();

    void disassemble();

    static void printInstructionWarning() {
        System.out.println("Перед сборкой/разборкой обязательно ознакомьтесь со схемой!!!!!!!!!!!");
    }
}
