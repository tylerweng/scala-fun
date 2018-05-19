package hello

import akka.actor.{Actor, ActorSystem, Props}


class HelloActor extends Actor {
  override def receive: PartialFunction[Any, Unit] = {
    case "hello" => println("response")
    case _ =>
      println("so")
      println("what?")
  }
}

object Main2 extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "ni hao"
  System.exit(1)
}
