package com.designpattern.creational

// Step 1: Product Interfaces

interface Button {
    fun draw()
}

interface TextField {
    fun show()
}


// Step 2: Light Theme Products

class LightButton : Button {
    override fun draw() {
        println("Light Button")
    }
}

class LightTextField : TextField {
    override fun show() {
        println("Light TextField")
    }
}

// Step 3: Dark Theme Products

class DarkButton : Button {
    override fun draw() {
        println("Dark Button")
    }
}

class DarkTextField : TextField {
    override fun show() {
        println("Dark TextField")
    }
}

// Step 4: Abstract Factory

interface UIFactory {
    fun createButton(): Button
    fun createTextField(): TextField
}

// Step 5: Concrete Factories

class LightFactory : UIFactory {

    override fun createButton() = LightButton()

    override fun createTextField() = LightTextField()
}

class DarkFactory : UIFactory {

    override fun createButton() = DarkButton()

    override fun createTextField() = DarkTextField()
}

//Usage
fun main(){
    val darkFactory: UIFactory = DarkFactory()

    val button = darkFactory.createButton()
    button.draw()

    val lightFactory: UIFactory = DarkFactory()

    val textField = lightFactory.createTextField()
    textField.show()
}