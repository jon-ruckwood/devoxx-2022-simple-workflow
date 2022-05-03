package net.selfdotlearn.helloworld;

import io.javalin.Javalin;

import java.net.InetAddress;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello from '" + InetAddress.getLocalHost().getHostName() + "'"));
    app.get("/ping", ctx -> ctx.result("OK!"));
  }
}
