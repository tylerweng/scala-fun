package hello

import akka.actor.{Actor, Props}

class HelloWorld extends Actor{
  override def preStart(): Unit = {
    val greeter = context.actorOf(Props[Greeter], "greeter")
    greeter ! Greeter.Greet
  }
  def receive = {
    case Greeter.Done => context.stop(self)
  }
}
