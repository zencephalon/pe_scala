lazy val fibs = {
  def f(a:Int,b:Int):Stream[Int] = a #:: f(b,a+b)
  f(0,1)
}

println(fibs.filter(_ % 2 == 0).takeWhile(_ <= 4000000).foldLeft(0)(_ + _))