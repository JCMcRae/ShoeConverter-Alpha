# ShoeConverter-Alpha
Successor to ShoeConverter. Built with Java Swing, utilizing ShoeSizeConverter API for US, UK, and EU sizing.
Requires Java 1.8

## Introduction
Must be used as a runnable JAR  or .exe file.
A user will input his or her shoe size, select their gender, and then select either the US, UK, or EU sizing. When they press convert, their shoe size in the US, UK, and EU sizing systems will be displayed.
A size that is may not currently by supported will return "NA".

## What's New?
A different interface and more sizes have been added to implement and introduce cross sizing conversion. The whole thing is meant to be a little easier to use and understand than the [predecessor](https://github.com/JCMcRae/ShoeConverter "ShoeConverter").

## How to Deploy
In order to use this application, you need to compile `ShoeConverter.java`:

`javac ShoeConverter.java`

Depending on your IDE of choice, if you so choose to use one, it will do it for you. You just need to figure out how to do that. After it compiles, you need to convert it to a `.jar' file:

`jar -cf ShoeConverter.jar ShoeConverter.class`

Then, you can simply run the .jar file, but if you have a wrapper program that turns the .jar to an .exe, that's okay, too.

